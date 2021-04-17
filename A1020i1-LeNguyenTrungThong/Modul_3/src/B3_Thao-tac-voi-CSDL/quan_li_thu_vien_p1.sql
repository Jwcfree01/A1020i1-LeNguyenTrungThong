drop database if exists quan_li_thu_vien_p1;
create database quan_li_thu_vien_p1;
use quan_li_thu_vien_p1;

create table theLoai(
	idTheLoai int primary key,
    nameTheLoai varchar(50)
);

create table sach (
	idSach int primary key,
    nameSach varchar(50),
    NXB varchar(30),
    namXB int (10),
    soLanXB int,
    tacGia varchar(50),
    gia double,
    img text,
    id_theLoai int,
    foreign key (id_theLoai) references theLoai(idTheLoai)
);

create table theMuon(
	idTheMuon int primary key,
    ngayMuon date,
    ngayTra date,
    sachMuon varchar(50)
);

create table sinhVien(
	idSinhVien int primary key,
    nameSinhVien varchar(50),
    dateOfBirth date,
    address varchar(200),
    email varchar(50),
    phone int(11),
    img text,
    id_theMuon int,
    foreign key(id_theMuon) references theMuon(idTheMuon)
);

create table theMuonAndSach(
	id_theMuon int,
    id_sach int,
    primary key (id_theMuon, id_sach),
    foreign key (id_theMuon) references theMuon(idTheMuon),
    foreign key (id_sach) references sach(idSach)
);

insert into theLoai values
(1, 'sach giao khoa'),
(2, 'truyen'),
(3, 'sach tham khao');

insert into sach values
(1, 'toan', 'kim dong', 1992, 3, 'Kim Khanh', 20000, 'ok', 1),
(2, 'anh', 'kim dong', 1992, 4, 'Kim Khanh', 40000, 'ok', 1),
(3, 'van', 'kim dong', 1992, 7, 'Kim Khanh', 70000, 'ok', 1),
(4, 'doraemon', 'fujaki', 1994, 8, 'oqua', 30000, 'ok', 2),
(5, 'conan', 'kawa', 1996, 10, 'naruto', 10000, 'ok', 3);

insert into theMuon values
(1, '2000/10/10', '2000/10/30', 'toan'),
(2, '2000/10/5', '2000/10/15', 'anh'),
(3, '2000/09/10', '2000/10/30', 'doraemon'),
(4, '2000/06/20', '2000/06/30', 'doraemon'),
(5, '2000/07/25', '2000/07/17', 'conan');

insert into sinhVien values
(1, 'thong', '2000/04/14', 'quang nam', 'letrungthong@gmail.com', 0981729499, 'ok', 1),
(2, 'thuan', '1997/03/18', 'da nang', 'thuan@gmail.com', 0981729490, 'ok', 2),
(3, 'dat', '1990/10/20', 'hue', 'dat@gmail.com', 0981729491, 'ok', 3),
(4, 'nhan', '1999/10/25', 'quang ngai', 'nhan@gmail.com', 0981729492, 'ok', 4),
(5, 'thang', '1999/03/07', 'binh dinh', 'thang@gmail.com', 0981729493, 'ok', 5);

select idSinhVien, nameSinhVien, idTheMuon, ngayMuon, ngayTra, sachMuon, tacGia, namXB from sinhVien inner join theMuon
on sinhvien.id_theMuon = theMuon.idTheMuon
inner join sach 
on sach.idSach = theMuon.idTheMuon;

-- tính tổng số tiền mua sách trong thư viện 

select idSach, nameSach, gia, sum(gia) as total from sach
group by gia
