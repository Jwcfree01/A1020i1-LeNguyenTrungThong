-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.

select idNhanVien, hoTen, ngaySinh, sdt, luong, diaChi 
from nhanVien
where (hoTen like 'T%' or hoTen like 'D%' or hoTen like 'K%') and char_length(hoTen) < 16;

-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select * 
from khachHang
 where ((SELECT TIMESTAMPDIFF(YEAR, ngaySinh, CURDATE()) >17) or (SELECT TIMESTAMPDIFF(YEAR, ngaySinh, CURDATE()) <51))
 	and (diaChi = 'da nang' or diaChi = 'quang tri');
    
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được 
-- sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select *, count(hopDong.idHD) as soLan
from khachHang
inner join hopDong on khachHang.idKH = hopDong.id_kH
where id_loaiKH = 1 in (
	select idHD
    from hopDong
    where hopDong.id_kH = khachHang.idKH is not null
)
group by (idKH)
order by soLan desc
;

-- 5.Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
-- khachHang, loaiKH, hopDong, dichVu, loaiDichVu, dichVuDiKem

select idKH, hoVaTen, tenLoaiKH, idHD, ngayLamHD, ngayKetThuc, tenLoaiDichVu, (dichVu.chiPhiThue + dichVuDiKem.donVi*dichVuDiKem.gia ) as tong_tien
from khachHang inner join loaiKH on khachHang.id_loaiKH = loaiKH.idLoaiKH
left join hopDong on khachHang.idKH = hopDong.id_kH
left join dichVu on dichVu.idDichVu = hopDong.id_dichVu
left join loaiDichVu on loaiDichVu.idLoaiDichVu = dichVu.id_loaiDichVu
left join hopDongChiTiet on hopDongChiTiet.id_hD = hopDong.idHD
left join dichVuDiKem on dichVuDiKem.idDichVuDiKem = hopDongChiTiet.id_dichVuDiKem
order by (idKH);

-- 6.Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện 
-- đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select idDichVu, tenLoaiDichVu, dienTich, chiPhiThue 
from hopDong inner join dichVu on hopDong.id_dichVu = dichVu.idDichVu
inner join loaiDichVu on loaiDichVu.idLoaiDichVu = dichVu.id_loaiDichVu
where idDichVu not in (
	select id_dichVu
	from hopDong
	where (ngayLamHD between'2019-01-01' and '2019-03-31')
);

-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ 
-- đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select idDichVu, tenLoaiDichVu, dienTich, soNguoiToiDa, chiPhiThue
from dichVu inner join loaiDichVu on loaiDichVu.idLoaiDichVu = dichVu.id_loaiDichVu
where exists (select idHD from hopDong where year (hopDong.ngayLamHD)='2018' and hopDong.id_dichVu = dichVu.idDichVu)
and not exists(select idHD from hopDong where year (hopDong.ngayLamHD)='2019' and hopDong.id_dichVu = dichVu.idDichVu);

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thuc hiện yêu cầu trên
-- c1
select distinct hoVaTen from khachHang;

-- c2
select hoVaTen from khachHang group by hoVaTen;

-- c3
select hoVaTen from khachHang union select hoVaTen from khachHang;

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngayLamHD) as thang, count(id_kH) as soKH
from hopDong
where year(ngayLamHD) = '2019'
group by month(ngayLamHD)
order by month(ngayLamHD);

-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select idHD, ngayLamHD, ngayKetThuc, tienDatCoc, count(idHDChiTiet) as so_luong_dich_vu_di_kem
from hopDong
	left join hopDongChiTiet hdct on hopDong.idHD = hdct.id_hD
group by idHD;

-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi 
-- những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”. 
select kH.hoVaTen, kH.diaChi, tenLoaiKH, hD.idHD, dvdk.tenDichVuDiKem, donVi
from khachHang kh
	inner join loaiKH lk on kh.id_loaiKH = lk.idloaiKH
    inner join hopDong hd on kh.idKH = hd.id_kH
    inner join hopDongChiTiet hdct on hd.idHD = hdct.id_hD
    inner join dichVuDiKem dvdk on hdct.id_dichVuDiKem = dvdk.idDichVuDiKem
where lk.tenLoaiKH = 'Diamond' and (kh.diaChi in ('Da Nang', 'Quảng Ngãi'))
order by kh.hoVaTen;

-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hd.idHD, nv.hoTen, kh.hoVaTen, kh.sdt, sum(hdct.idHDChiTiet) as so_luong_dich_vu_di_kem
from hopdong hd
	inner join nhanvien nv on hd.id_nV = nv.idNhanVien
    inner join khachhang kh on hd.id_KH = kh.idKH
    inner join dichvu dv on hd.id_dichVu = dv.idDichVu
    left join hopdongchitiet hdct on hd.idHD = hdct.id_hD
where year(ngayLamHD) = '2021' and month(ngayLamHD) in (1,2,3,4) and month(ngayLamHD) not in (10,11,12)
group by hd.idHD
order by hd.idHD;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select dvdk.idDichVuDiKem, dvdk.tenDichVuDiKem,count(hdct.id_dichVuDiKem) as so_lan_su_dung
from hopdongchitiet hdct
	inner join dichvudikem dvdk on hdct.id_dichVuDiKem = dvdk.idDichVuDiKem
group by hdct.id_dichVuDiKem
having count(hdct.id_dichVuDiKem) =( 
	select max(so_lan_su_dung)
	from (
		select count(id_dichVuDiKem) as so_lan_su_dung
        from hopdongchitiet
        group by id_dichVuDiKem) as so_lan_su_dung_dich_vu_di_kem
	);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hd.idHD, tenDichVuDiKem, count(hdct.id_dichVuDiKem) as so_lan_su_dung
from hopDong hd
	inner join dichvu dv on hd.id_dichVu = dv.idDichVu
    inner join hopdongchitiet hdct on hd.idHD = hdct.id_hD
    inner join dichvudikem dvdk on hdct.id_dichVuDiKem = dvdk.idDichVuDiKem
group by hdct.id_dichVuDiKem
having count(hdct.id_dichVuDiKem) = 1
order by hd.idHD;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm :
-- IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select nv.idNhanVien, hoTen, td.trinhDo, bp.idBoPhan, nv.sdt, nv.diaChi, count(idHD) as so_hop_dong
from nhanvien nv
	inner join trinhdo td on nv.id_trinhDo = td.idTrinhDo
    inner join bophan bp on nv.id_boPhan = bp.idBoPhan
	inner join vitri vt on nv.id_viTri = vt.idViTri
    left join hopdong hd on nv.idNhanVien = hd.id_nV
where year(ngayLamHD) > 2020
group by nv.idNhanVien
having count(idHD) <= 3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
select * from nhanvien;
 
delete from nhanvien
where idNhanVien not in (
	select idNhanVien
    from hopdong
    where year(ngayLamHD) between '2017' and '2021');
        
-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
update khachhang, (select hopdong.id_kH as id, sum(hopdong.tongtien) as tong_tien
from hopdong
where year(hopdong.ngayLamHD) = 2021
group by hopdong.id_kH
having tong_tien > 10000000) as temp set khachhang.id_loaiKH = (select loaikh.idLoaiKH from loaikh where loaikh.tenLoaiKH = 'Diamond')
	where khachhang.id_loaiKH = (select loaikh.idLoaiKH from loaikh where loaikh.tenLoaiKH = 'Platinium')
	and temp.id = khachhang.id_loaiKH;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).

SELECT * FROM khachHang;

DELETE FROM khachHang 
WHERE idKH IN (
SELECT id_kH
    FROM hopDong
    WHERE YEAR(ngayLamHD) < 2016);

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

-- update dichvudikem 
-- 	inner join (select dichvudikem.tenDichVuDiKem as ten_dich_vu_di_kem 
-- 				from hopdongchitiet inner join dichvudikem on hopdongchitiet.id_dichVuDiKem = dichvudikem.idDichVuDiKem
--                 group by dichvudikem.idDichVuDiKem
--                 having count(hopdongchitiet.id_dichVuDiKem) > 10) as temp set dichvudikem.gia = dichvudikem.gia*2
-- where dichvudikem.tenDichVuDiKem = temp.tenDichVuDiKem;

UPDATE dichVuDiKem 
SET gia = gia * 2
WHERE
    idDichVuDiKem IN (SELECT 
            id_dichVuDiKem
        FROM
            hopDongChiTiet
                INNER JOIN
            hopDong ON hopDongChiTiet.id_hD = hopDong.idHD
        WHERE
            YEAR(ngayLamHD) = 2019
        GROUP BY hopDongChiTiet.id_dichVuDiKem
        HAVING COUNT(idDichVuDiKem) > 1);

SELECT 
    dichVuDiKem.*,
    COUNT(hopDongChiTiet.id_dichVuDiKem) AS SoLanSuDung
FROM
    dichVuDiKem
        LEFT JOIN
    hopDongChiTiet ON dichVuDiKem.idDichVuDiKem = hopDongChiTiet.id_dichVuDiKem
GROUP BY dichVuDiKem.idDichVuDiKem;

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
--  thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select idNhanVien, hoTen, email, sdt, ngaySinh, diaChi, 'nhan vien' as form_table
from nhanvien
union all
select idKH, hoVaTen, email, sdt, ngaySinh, diaChi, 'khach hang' as form_table
from khachhang;