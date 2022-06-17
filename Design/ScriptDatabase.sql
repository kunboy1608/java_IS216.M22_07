/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2017                    */
/* Created on:     6/17/2022 8:39:24 PM                         */
/*==============================================================*/
USE [cafe_java]
go
create or alter function DangNhap(@username char(255), @password char(32))
returns tinyint 
BEGIN
DECLARE
@type tinyint
	select @type = [TYPE] from [dbo].[ACCOUNT] where USERNAME=@username and PASSWORD=@password and ISLOCKED = 0
	return @type;
END;
go
-----------------------------------------------------------------------------------------------
alter table HoaDonKhachHang
	drop constraint FK_HD_NV
go
alter table HoaDonKhachHang
	drop constraint FK_HoaDonKhachHang_MaGG
go
alter table HoaDonKhachHang
	drop constraint FK_HD_MaGG
go
alter table CTHD
	drop constraint FK_CTHD_MaHD
go
alter table CTHD
	drop constraint FK_CTHD_MaDU
go
alter table NhanVien
	drop constraint FK_NhanVien
go
if exists (select 1
            from  sysobjects
           where  id = object_id('ACCOUNT')
            and   type = 'U')
   drop table ACCOUNT
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CHINHANH')
            and   type = 'U')
   drop table CHINHANH
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CTHD')
            and   type = 'U')
   drop table CTHD
go

if exists (select 1
            from  sysobjects
           where  id = object_id('DOUONG')
            and   type = 'U')
   drop table DOUONG
go

if exists (select 1
            from  sysobjects
           where  id = object_id('GIAMGIA')
            and   type = 'U')
   drop table GIAMGIA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('HOADONKHACHHANG')
            and   type = 'U')
   drop table HOADONKHACHHANG
go

if exists (select 1
            from  sysobjects
           where  id = object_id('KHACHHANG')
            and   type = 'U')
   drop table KHACHHANG
go

if exists (select 1
            from  sysobjects
           where  id = object_id('NHANVIEN')
            and   type = 'U')
   drop table NHANVIEN
go

/*==============================================================*/
/* Table: ACCOUNT                                               */
/*==============================================================*/
create table ACCOUNT (
   USERNAME             char(255)            not null,
   PASSWORD             char(32)             null,
   ISLOCKED             bit                  null,
   TYPE                 tinyint              null,
   constraint PK_ACCOUNT primary key (USERNAME)
)
go

/*==============================================================*/
/* Table: CHINHANH                                              */
/*==============================================================*/
create table CHINHANH (
   MACN                 int                  identity,
   TENCN                nvarchar(255)        null,
   DIACHI               nvarchar(255)        null,
   constraint PK_CHINHANH primary key (MACN)
)
go

/*==============================================================*/
/* Table: CTHD                                                  */
/*==============================================================*/
create table CTHD (
   MAHD                 int                  not null,
   MADU                 int                  not null,
   SOLUONG              int                  null,
   GIA                  money                null,
   constraint PK_CTHD primary key (MAHD, MADU)
)
go

/*==============================================================*/
/* Table: DOUONG                                                */
/*==============================================================*/
create table DOUONG (
   MADU                 int                  identity,
   TENDU                nvarchar(255)        null,
   GIA                  money                null,
   HINHANH              image                null,
   GHICHU               nvarchar(255)        null,
   constraint PK_DOUONG primary key (MADU)
)
go

/*==============================================================*/
/* Table: GIAMGIA                                               */
/*==============================================================*/
create table GIAMGIA (
   MAGIAMGIA            int                  identity,
   GIATRI               int                  null,
   TOIDA                money                null,
   NGAYBATDAU           datetime             null,
   NGAYKETTHUC          datetime             null,
   constraint PK_GIAMGIA primary key (MAGIAMGIA)
)
go

/*==============================================================*/
/* Table: HOADONKHACHHANG                                       */
/*==============================================================*/
create table HOADONKHACHHANG (
   MAHD                 int                  not null,
   MAGIAMGIA            int                  identity,
   SDTKH                char(11)             not null,
   MANV                 int                  null,
   NGAYLAP              datetime             null,
   TONGTIEN             money                null,
   constraint PK_HOADONKHACHHANG primary key (MAHD)
)
go

/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
create table KHACHHANG (
   SDTKH                char(11)             not null,
   TENKH                nvarchar(255)        null,
   GIOITINH             bit                  null,
   TONGDIEM             int                  null,
   constraint PK_KHACHHANG primary key (SDTKH)
)
go

/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN (
   MANV                 int                  identity,
   MACN                 int                  null,
   TENNV                nvarchar(256)        null,
   GIOITINH             int                  null,
   NGAYVL               datetime             null,
   CCCD                 char(13)             null,
   constraint PK_NHANVIEN primary key (MANV)
)
go
insert into ChiNhanh values(N'UIT',N'Khu phố 6, Linh Trung, Thủ Đức, TP.HCM')
insert into ChiNhanh values(N'Trung tâm',N'Quận 1, TP.HCM')
insert into ChiNhanh values(N'Miền Bắc',N'Thanh Xuân, Hà Nội')
go
insert into NhanVien values('1','Do Thao Quyen','1','01-04-2022','098765432101')
insert into NhanVien values('2','Hoang Dinh Phu','1','01-05-2022','098765432102')
insert into NhanVien values('3','Nguyen Hai Dang','1','01-06-2022','098765432103')
insert into NhanVien values('1','Jennie','1','01-07-2022','098765432104')
insert into NhanVien values('2','Rose','1','01-08-2022','098765432105')
go
insert into KhachHang values('0602186042',N'Nguyễn Trường Giang','0','0')
insert into KhachHang values('0878143236',N'Võ Như Phước','0','0')
insert into KhachHang values('0806254206',N'Trương Tấn Sang','0','0')
insert into KhachHang values('0446692130',N'Trần Huy Thắng','0','0')
insert into KhachHang values('0102243354',N'Đặng Duy Đạt','0','0')
insert into KhachHang values('0194031273',N'Ngô Văn Khải','0','0')
insert into KhachHang values('0923131757',N'Đỗ Lê Anh Khoa','0','0')
insert into KhachHang values('0687355295',N'Hoàng Đình Phú','0','0')
insert into KhachHang values('0395638524',N'Lê Nguyễn Minh Trung','0','0')
insert into KhachHang values('0714556336',N'Phan Thế Tuấn','0','0')
insert into KhachHang values('0348877502',N'Trần Nguyễn Quỳnh Anh','1','0')
insert into KhachHang values('0424614536',N'Đinh Hoàng Linh Đan','1','0')
insert into KhachHang values('0467206811',N'Nguyễn Hải Đăng','0','0')
insert into KhachHang values('0217292379',N'Võ Thành Đô','0','0')
insert into KhachHang values('0295597424',N'Hoàng Thái Dương','0','0')
insert into KhachHang values('0629967094',N'Nguyễn Thị Hồng Hải','1','0')
insert into KhachHang values('0908859367',N'Nguyễn Đạt Huy Hoàng','0','0')
insert into KhachHang values('0181992439',N'Phan Trần Khánh Hưng','0','0')
insert into KhachHang values('0867206793',N'Phạm Như Long','0','0')
insert into KhachHang values('0712566967',N'Phạm Hồ Lượng','0','0')
insert into KhachHang values('0366444758',N'Nguyễn Nhật Minh','0','0')
insert into KhachHang values('0525286507',N'Trương Nguyên Ngọc','0','0')
insert into KhachHang values('0520705771',N'Nguyễn Hữu Thắng','0','0')
insert into KhachHang values('0131308269',N'Đỗ Thảo Quyên','1','0')
insert into KhachHang values('0580032772',N'Đinh Quang Ân','0','0')
insert into KhachHang values('0540523541',N'Nguyễn Đăng Khoa','0','0')
insert into KhachHang values('0561408517',N'Phan Thị Linh','1','0')
insert into KhachHang values('0388783798',N'Đào Minh Tuấn','0','0')
insert into KhachHang values('0980955367',N'Trang Kỳ Anh','1','0')
insert into KhachHang values('0963942803',N'Trần Gia Băng','0','0')
insert into KhachHang values('0556397160',N'Nguyễn Hải Đăng','0','0')
insert into KhachHang values('0360080563',N'Quan Huỳnh Quang Dương','0','0')
insert into KhachHang values('0919899948',N'Dương Ngọc Hải','0','0')
insert into KhachHang values('0393504228',N'Nguyễn Quang Huy','0','0')
insert into KhachHang values('0994939058',N'Nguyễn Tiến Nhân','0','0')
insert into KhachHang values('0348944580',N'Khưu Minh Phong','0','0')
insert into KhachHang values('0911885989',N'Trần Gia Phong','0','0')
insert into KhachHang values('0945748827',N'Võ Thanh Phương','0','0')
insert into KhachHang values('0614565239',N'Nguyễn Tú Quyên','1','0')
insert into KhachHang values('0306783756',N'Phạm Phú Tuấn','0','0')
insert into KhachHang values('0617559418',N'Phạm Hoàng Ân','0','0')
insert into KhachHang values('0398638686',N'Nguyễn Phúc Minh Khang','0','0')
insert into KhachHang values('0764893918',N'Trần Quốc Phong','0','0')
insert into KhachHang values('0124382395',N'Hoàng Văn Lộc','0','0')
insert into KhachHang values('0540263861',N'Huỳnh Văn Sơn','0','0')
insert into KhachHang values('0731088578',N'Nguyễn Hoài Nhân','0','0')
insert into KhachHang values('0353533709',N'Lê Nguyễn Minh Trung','0','0')
insert into KhachHang values('0469997696',N'Đỗ Việt Bách','0','0')
insert into KhachHang values('0879822356',N'Trịnh Huỳnh Đăng','0','0')
insert into KhachHang values('0817685226',N'Vương Đức Đạt','0','0')
insert into KhachHang values('0860946021',N'Võ Thành Đô','0','0')
insert into KhachHang values('0370624504',N'Trương Nguyễn Trường Duy','0','0')
insert into KhachHang values('0283568253',N'Bành Hoàng Giang','0','0')
insert into KhachHang values('0644200321',N'Đỗ Hải','0','0')
insert into KhachHang values('0519274423',N'Nguyễn Nhựt Hào','0','0')
insert into KhachHang values('0613438101',N'Lê Duy Hoàng','0','0')
insert into KhachHang values('0479439492',N'Nguyễn Huy Hoàng','0','0')
insert into KhachHang values('0231374253',N'Trần Cao Huy Hoàng','0','0')
insert into KhachHang values('0629298861',N'Phan Trần Khánh Hưng','0','0')
insert into KhachHang values('0387111073',N'Nguyễn Huy Khoa','0','0')
insert into KhachHang values('0802057692',N'Phạm Hồ Lượng','0','0')
insert into KhachHang values('0682646892',N'Trương Nguyên Ngọc','0','0')
insert into KhachHang values('0271566428',N'Huỳnh Kim Phát','0','0')
insert into KhachHang values('0446883612',N'Đặng Hoàng Phong','0','0')
insert into KhachHang values('0344246169',N'Nguyễn Quang Thái','0','0')
insert into KhachHang values('0747466498',N'Nguyễn Thừa An Thái','0','0')
insert into KhachHang values('0814305196',N'Nguyễn Tấn Thịnh','0','0')
insert into KhachHang values('0154392948',N'Đặng Quốc Trung','0','0')
insert into KhachHang values('0141465040',N'Trần Thị Thanh Tuyền','1','0')
insert into KhachHang values('0800310826',N'Nguyễn Công Vũ','0','0')
insert into KhachHang values('0637304753',N'Trần Thanh Vũ','0','0')
insert into KhachHang values('0899842607',N'Lê Thị Thanh Hương','1','0')
insert into KhachHang values('0575262086',N'Đỗ Thảo Quyên','1','0')
insert into KhachHang values('0557451850',N'Nguyễn Duy Tài','0','0')
insert into KhachHang values('0352494457',N'Đỗ Quỳnh Chi','1','0')
insert into KhachHang values('0624794302',N'Đặng Nghiệp Cường','0','0')
insert into KhachHang values('0262579777',N'Nguyễn Minh Cường','0','0')
insert into KhachHang values('0979187421',N'Nguyễn Đạt','0','0')
insert into KhachHang values('0457026239',N'Nguyễn Hiền Đức','0','0')
insert into KhachHang values('0268122787',N'Nguyễn Hữu Hiệu','0','0')
insert into KhachHang values('0162937163',N'Trần Thanh Hiếu','0','0')
insert into KhachHang values('0212382227',N'Trịnh Gia Huy','0','0')
insert into KhachHang values('0966865660',N'Nguyễn Anh Khoa','0','0')
insert into KhachHang values('0351879616',N'Nguyễn Đăng Khoa','0','0')
insert into KhachHang values('0887176417',N'Phạm Ngọc Nguyên','1','0')
insert into KhachHang values('0724181182',N'Nguyễn Hoàng Nhật','0','0')
insert into KhachHang values('0159516428',N'Võ Phạm Thùy Nhung','0','0')
insert into KhachHang values('0948943533',N'Võ Hoàng Phúc','0','0')
insert into KhachHang values('0357942556',N'Trần Văn Quang','0','0')
insert into KhachHang values('0230035689',N'Nguyễn Tô Đức Tài','0','0')
insert into KhachHang values('0303010381',N'Nguyễn Hữu Thắng','0','0')
insert into KhachHang values('0528752426',N'Lê Công Thành','0','0')
insert into KhachHang values('0164065813',N'Trần Thu Thảo','1','0')
insert into KhachHang values('0666891069',N'Võ Thanh Tú','1','0')
insert into KhachHang values('0959861383',N'Lâm Võ Khánh My','1','0')
insert into KhachHang values('0891780936',N'Võ Nữ Diễm Trang','1','0')
insert into KhachHang values('0499270374',N'Nguyễn Bảo Anh','1','0')
insert into KhachHang values('0246068703',N'Nguyễn Vân Anh','1','0')
insert into KhachHang values('0536554190',N'Hoàng Gia Quốc Bình','0','0')
insert into KhachHang values('0919912001',N'Nguyễn Hải Đăng','0','0')
insert into KhachHang values('0917884778',N'Lê Quang Đông','0','0')
insert into KhachHang values('0207717467',N'Nông Tiến Dũng','0','0')
insert into KhachHang values('0615458787',N'Quan Huỳnh Quang Dương','0','0')
insert into KhachHang values('0902483934',N'Lê Hoàng Duyên','1','0')
insert into KhachHang values('0680171850',N'Dương Ngọc Hải','0','0')
insert into KhachHang values('0878549680',N'Hoàng Thị Hòa','1','0')
insert into KhachHang values('0324228778',N'Nguyễn Quang Huy','0','0')
insert into KhachHang values('0660443787',N'Trần Ngọc Linh','0','0')
insert into KhachHang values('0456452117',N'Trần Hoài Nam','0','0')
insert into KhachHang values('0292967322',N'Đinh Thị Ánh Nguyệt','1','0')
insert into KhachHang values('0952614630',N'Nguyễn Tiến Nhân','0','0')
insert into KhachHang values('0777684744',N'Tôn Nữ Thảo Nhi','1','0')
insert into KhachHang values('0934216544',N'Trương Ý Nhi','1','0')
insert into KhachHang values('0169627344',N'Phạm Thanh Nhựt','0','0')
insert into KhachHang values('0624940728',N'Trần Ngọc Mỹ Phương','1','0')
insert into KhachHang values('0130477429',N'Võ Thanh Phương','1','0')
insert into KhachHang values('0748838750',N'Nguyễn Tú Quyên','1','0')
insert into KhachHang values('0298504045',N'Đoàn Tú Quỳnh','1','0')
insert into KhachHang values('0943907886',N'Trương Nguyễn Quang Thái','0','0')
insert into KhachHang values('0530250439',N'Chu Quyết Thắng','0','0')
insert into KhachHang values('0161778936',N'Nguyễn Ngọc Thảo','1','0')
insert into KhachHang values('0973277412',N'Nguyễn Đức Thuần','0','0')
insert into KhachHang values('0134800312',N'Võ Thị Hà Trang','1','0')
insert into KhachHang values('0212941859',N'Nguyễn Quốc Trung','0','0')
insert into KhachHang values('0524604687',N'Đỗ Mạnh Tuấn','0','0')
go
insert into GiamGia values('10','0','04-30-2022','05-01-2022')
insert into GiamGia values('30','50000','05-05-2022','05-05-2022')
go
insert into Account values('098765432101','25d55ad283aa400af464c76d713c07ad','0','3')
insert into Account values('098765432102','25d55ad283aa400af464c76d713c07ad','0','2')
insert into Account values('098765432103','25d55ad283aa400af464c76d713c07ad','0','2')
insert into Account values('098765432104','25d55ad283aa400af464c76d713c07ad','0','2')
insert into Account values('098765432105','25d55ad283aa400af464c76d713c07ad','0','2')
go
insert into DoUong values(N'Bạc xỉu đá','25000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\1.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Bạc xỉu nóng','25000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\2.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Cappuchino','40000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\3.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Latte','40000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\4.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Expresso','30000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\5.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Caramel Machiato','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\6.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Americano','40000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\7.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Mocha','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\8.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Hot Chocolate','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\9.jpg', Single_Blob) as img),'')
insert into DoUong values(N'Ice Chocolate','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'D:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\10.jpg', Single_Blob) as img),'')
go
go
alter table NhanVien
	add constraint FK_NhanVien foreign key(MaCN)
		references ChiNhanh(MaCN)
go
alter table HoaDonKhachHang
	add constraint FK_HoaDonKhachHang_MaGG foreign key(MaGiamGia)
		references GiamGia(MaGiamGia)
go
alter table HoaDonKhachHang
	add constraint FK_HD_MaGG foreign key(SDTKH)
		references KhachHang(SDTKH)
go
alter table HoaDonKhachHang
	add constraint FK_HD_NV foreign key(MaNV)
		references NHANVIEN(MaNV)
go
alter table CTHD
	add constraint FK_CTHD_MaHD foreign key(MaHD)
		references HoaDonKhachHang(MaHD)
go
alter table CTHD
	add constraint FK_CTHD_MaDU foreign key(MaDU)
		references DoUong(MaDU)
go
GO
DROP USER [TKNHANVIENCF]
GO
DROP LOGIN [TKNHANVIENCF]
GO
CREATE LOGIN [TKNHANVIENCF] WITH PASSWORD=N'4418eca54d2798b6d699ba0a0ddb7381'
GO
CREATE USER [TKNHANVIENCF] FOR LOGIN [TKNHANVIENCF]
GO
grant select on [dbo].[CHINHANH] to [TKNHANVIENCF]
go
grant select, insert on [dbo].[CTHD] to [TKNHANVIENCF]
go
grant select on [dbo].[DOUONG] to [TKNHANVIENCF]
go
grant select on [dbo].[GIAMGIA] to [TKNHANVIENCF]
go
grant select, insert on [dbo].[HOADONKHACHHANG] to [TKNHANVIENCF]
go
grant select, insert, update on [dbo].[KHACHHANG] to [TKNHANVIENCF]
go
grant select on [dbo].[NHANVIEN] to [TKNHANVIENCF]
go
--grant select on [dbo].[ACCOUNT] to [TKNHANVIENCF]
GO
-----------------------------------------------------------------------------------------------
DROP USER [TKKHACHCF]
GO
DROP LOGIN [TKKHACHCF]
GO
CREATE LOGIN [TKKHACHCF] WITH PASSWORD=N'aa0b4cde11bb878734748ebd33ba4f9e'
GO
CREATE USER [TKKHACHCF] FOR LOGIN [TKKHACHCF]
GO
grant select on [dbo].[DOUONG] to [TKKHACHCF]
GO