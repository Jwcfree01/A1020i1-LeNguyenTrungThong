drop database if exists case_db;
create database case_db;
use case_db;

create table viTri(
	idViTri int primary key,
    tenViTri varchar(45)
);

create table trinhDo(
	idTrinhDo int primary key,
    trinhDo varchar(45)
);

create table boPhan(
	idBoPhan int primary key,
    tenBoPhan varchar(45)
);

create table loaiDichVu(
	idLoaiDichVu int primary key,
    tenLoaiDichVu varchar(45)
);

create table dichVuDiKem(
	idDichVuDiKem int primary key,
    tenDichVuDiKem varchar(45),
    gia double,
    donVi int,
    trangthai varchar(45)
);

create table loaiKH(
	idLoaiKH int primary key,
    tenLoaiKH varchar(45)
);

create table nhanVien(
	idNhanVien int primary key,
    hoTen varchar(50),
    ngaySinh date,
    soCM varchar(45),
    luong double,
    sdt int(11),
    email varchar(45),
    diaChi varchar(45),
    id_viTri int,
    id_trinhDo int(50),
    id_boPhan int,
    foreign key(id_viTri) references viTri (idViTri),
    foreign key(id_trinhDo) references trinhDo (idTrinhDo),
    foreign key(id_boPhan) references boPhan (idBoPhan)
);

create table khachHang(
	idKH int primary key,
    hoVaTen varchar(45),
    ngaySinh date,
    soCM int(11),
    sdt int(11),
    email varchar(45),
    diaChi varchar(45),
    id_loaiKH int,
    foreign key (id_loaiKH) references loaiKH (idLoaiKH)
);

create table dichVu(
	idDichVu int primary key,
    id_loaiDichVu int,
    dienTich double,
    soTang int,
    soNguoiToiDa int,
    chiPhiThue double,
    trangThai varchar(45),
    foreign key (id_loaiDichVu) references loaiDichVu (idLoaiDichVu)
);

create table hopDong(
	idHD int primary key,
    ngayLamHD date,
    ngayKetThuc date,
    tienDatCoc double,
    tongtien double,
	id_nV int,
    id_kH int,
    id_dichVu int,
    foreign key (id_nV) references nhanVien (idNhanVien),
    foreign key (id_kH) references khachHang (idKH),
    foreign key (id_dichVu) references dichVu (idDichVu)
);

create table hopDongChiTiet(
	idHDChiTiet int primary key,
    soLuong int,
    id_hD int,
    id_dichVuDiKem int,
    foreign key (id_hD) references hopDong (idHD),
    foreign key (id_dichVuDiKem) references dichVuDiKem (idDichVuDiKem)
);

insert into viTri values
(1, 'lễ tân'),
(2, 'phục vụ'),
(3, 'chuyên viên'),
(4, 'giám sát'),
(5, 'quản lí'),
(6, 'giám đốc');

insert into trinhDo values
(1, 'trung cấp'),
(2, 'cao đẳng'),
(3, 'đại học'),
(4, 'sau đại học');

insert into boPhan values
(1, 'Sale – Marketing'),
(2, 'Hành Chính'),
(3, 'Phục vụ'),
(4, 'Quản lý');

insert into nhanVien values
(1, 'Thong', '2000/04/14', '206267400', 7000000, 0981729499, 'letrungthong@gmail.com', 'quang nam', 1, 1, 1),
(2, 'Thuan', '1999/05/20', '206267411', 8000000, 0981729490, 'dangvanthuan@gmail.com', 'da nang', 5, 4, 2),
(3, 'Dat', '1998/02/27', '206267422', 6000000, 0981729480, 'vandat@gmail.com', 'hue', 3, 3, 3),
(4, 'Nhan', '1999/03/10', '206267433', 9000000, 0981729477, 'hiennhan@gmail.com', 'quang ngai', 4, 1, 4);

insert into dichVuDiKem values
(1, 'massage', 50000, 1, 'on'),
(2, 'karaoke', 100000, 2, 'on'),
(3, 'thức ăn', 20000, 10, 'on'),
(4, 'thuê xe', 150000, 12, 'on');

insert into loaiKH values
(1, 'Diamond'),
(2, 'Platinium'),
(3, 'Gold'),
(4, 'Silver'),
(5, 'Member');

insert into khachHang values
(1, 'KH1', '2000/10/10', '200987654', 0987654321, 'kh1@gmail.com', 'da nang', 1),
(2, 'KH2', '1999/05/05', '200987655', 0987654567, 'kh2@gmail.com', 'HN', 1),
(3, 'KH3', '2001/09/07', '200987656', 0987654312, 'kh3@gmail.com', 'Binh Thuan', 5),
(4, 'KH4', '1997/11/25', '200987657', 0987654123, 'kh4@gmail.com', 'Ca Mau', 1);

insert into loaiDichVu values 
(1, 'Villa'),
(2, 'House'),
(3, 'Room');

insert into dichVu values
(1, 1, 200, 3, 20, 1000000, 'on'),
(2, 2, 100, 2, 10, 500000, 'on'),
(3, 3, 500, 1, 05, 100000, 'on'),
(4, 2, 100, 1, 10, 500000, 'on');

insert into hopDong values
(1, '2020/10/10', '2020/10/20', 500000, 1000000, 1, 1, 1),
(2, '2023/10/08', '2023/10/25', 300000, 4000000, 2, 4, 2),
(3, '2022/10/20', '2022/10/23', 200000, 2000000, 3, 3, 2),
(4, '2021/10/27', '2021/11/20', 600000, 3000000, 4, 2, 3),
(5, '2021/10/27', '2021/11/20', 600000, 3000000, 1, 1, 3);

insert into hopDongChiTiet values
(1, 1, 1, 2),
(2,2,3,3),
(3,3,4,1);

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

select *, count(idKH) as soLan
from khachHang
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

select idKH, hoVaTen, tenLoaiKH, idHD, ngayLamHD, ngayKetThuc, tenLoaiDichVu, tongTien 
from khachHang inner join loaiKH on khachHang.id_loaiKH = loaiKH.idLoaiKH
inner join hopDong on khachHang.idKH = hopDong.id_kH
inner join dichVu on dichVu.idDichVu = hopDong.id_dichVu
inner join loaiDichVu on loaiDichVu.idLoaiDichVu = dichVu.id_loaiDichVu;

