/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2017                    */
/* Created on:     4/22/2022 1:17:33 PM                         */
/*==============================================================*/
USE [cafe_java]
go
create or alter function DangNhap(@username char(255), @password char(32))
returns tinyint 
BEGIN
DECLARE
@type tinyint
	select @type = [TYPE] from [dbo].[ACCOUNT] where USERNAME=@username and PASSWORD=@password
	return @type;
END;
GO
create or alter function DangNhap(@username char(255), @password char(32))
returns tinyint 
BEGIN
DECLARE
@type tinyint
	select @type = [TYPE] from [dbo].[ACCOUNT] where USERNAME=@username and PASSWORD=@password and ISLOCKED = 0
	return @type;
END;
GO
USE [master]
GO
DROP LOGIN [TKNHANVIENCF]
GO
CREATE LOGIN [TKNHANVIENCF] WITH PASSWORD=N'4418eca54d2798b6d699ba0a0ddb7381', DEFAULT_DATABASE=[master], CHECK_EXPIRATION=OFF, CHECK_POLICY=ON
GO
USE [cafe_java]
GO
DROP USER [TKNHANVIENCF]
GO
CREATE USER [TKNHANVIENCF] FOR LOGIN [TKNHANVIENCF]
GO
--grant select on [dbo].[ACCOUNT] to [TKNHANVIENCF]
grant select on [dbo].[CHINHANH] to [TKNHANVIENCF]
grant select, insert on [dbo].[CTHD] to [TKNHANVIENCF]
grant select on [dbo].[CTHDNCC] to [TKNHANVIENCF]
grant select on [dbo].[DOUONG] to [TKNHANVIENCF]
grant select on [dbo].[GIAMGIA] to [TKNHANVIENCF]
grant select, insert on [dbo].[HOADONKHACHHANG] to [TKNHANVIENCF]
grant select on [dbo].[HOADONNCC] to [TKNHANVIENCF]
grant select, insert, update on [dbo].[KHACHHANG] to [TKNHANVIENCF]
grant select on [dbo].[NGUYENLIEU] to [TKNHANVIENCF]
grant select on [dbo].[NHACUNGCAP] to [TKNHANVIENCF]
grant select on [dbo].[NHANVIEN] to [TKNHANVIENCF]
GO
-----------------------------------------------------------------------------------------------
USE [master]
GO
DROP LOGIN [TKKHACHCF]
GO
CREATE LOGIN [TKKHACHCF] WITH PASSWORD=N'aa0b4cde11bb878734748ebd33ba4f9e', DEFAULT_DATABASE=[master], CHECK_EXPIRATION=OFF, CHECK_POLICY=ON
GO
USE [cafe_java]
GO
DROP USER [TKKHACHCF]
GO
CREATE USER [TKKHACHCF] FOR LOGIN [TKKHACHCF]
GO
grant select on [dbo].[DOUONG] to [TKKHACHCF]
GO


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
           where  id = object_id('CTHDNCC')
            and   type = 'U')
   drop table CTHDNCC
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
           where  id = object_id('HOADONNCC')
            and   type = 'U')
   drop table HOADONNCC
go

if exists (select 1
            from  sysobjects
           where  id = object_id('KHACHHANG')
            and   type = 'U')
   drop table KHACHHANG
go

if exists (select 1
            from  sysobjects
           where  id = object_id('NGUYENLIEU')
            and   type = 'U')
   drop table NGUYENLIEU
go

if exists (select 1
            from  sysobjects
           where  id = object_id('NHACUNGCAP')
            and   type = 'U')
   drop table NHACUNGCAP
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
/* Table: CTHDNCC                                               */
/*==============================================================*/
create table CTHDNCC (
   MANL                 int                  not null,
   MANCC                int                  not null,
   SOLUONG              int                  null,
   GIA                  money                null,
   constraint PK_CTHDNCC primary key (MANCC, MANL)
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
   MAGIAMGIA            int                  identity,
   SDTKH                char(11)             not null,
   MAHD                 int                  not null,
   MANV                 int                  null,
   NGAYLAP              datetime             null,
   TONGTIEN             money                null,
   constraint PK_HOADONKHACHHANG primary key (MAGIAMGIA, SDTKH, MAHD)
)
go

/*==============================================================*/
/* Table: HOADONNCC                                             */
/*==============================================================*/
create table HOADONNCC (
   MAHDNCC              int                  identity,
   MANV                 int                  not null,
   MANCC                int                  not null,
   NGAYLAP              datetime             null,
   NGAYTHANHTOAN        datetime             null,
   TONGTIEN             money                null,
   NO                   money                null,
   GHICHU               nvarchar(255)        null,
   constraint PK_HOADONNCC primary key (MAHDNCC)
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
/* Table: NGUYENLIEU                                            */
/*==============================================================*/
create table NGUYENLIEU (
   MANL                 int                  identity,
   TENNL                nvarchar(255)        null,
   GHICHU               nvarchar(255)        null,
   constraint PK_NGUYENLIEU primary key (MANL)
)
go

/*==============================================================*/
/* Table: NHACUNGCAP                                            */
/*==============================================================*/
create table NHACUNGCAP (
   MANCC                int                  identity,
   TENNCC               nvarchar(255)        null,
   DIACHI               nvarchar(255)        null,
   SDTNCC               char(11)             null,
   constraint PK_NHACUNGCAP primary key (MANCC)
)
go

/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN (
   MANV                 int                  identity,
   MACN                 int                  null,
   TENNV                nvarchar(256)        null,
   GIOITINH             bit                  null,
   NGAYVL               datetime             null,
   CCCD                 char(13)             null,
   constraint PK_NHANVIEN primary key (MANV)
)
go
insert into NhaCungCap values('TocoToco','Quan 2','0941824764')
insert into NhaCungCap values('Bobapop','Quan 3','0571595703')
insert into NhaCungCap values('HighLand','Quan 4','0122741935')
insert into NhaCungCap values('Milano','Quan 5','0955302388')
insert into NhaCungCap values('Gong Cha','Quan 6','0993471688')
insert into NhaCungCap values('Phúc Long','Quan 7','0962830272')
insert into NhaCungCap values('DingTea','Quan 8','0634726529')
insert into NhaCungCap values('The Alley','Quan 9','0771614446')
insert into NhaCungCap values('','Quan 10','0864756155')
insert into NhaCungCap values('','Quan 11','0991087487')
go
insert into NguyenLieu values('Bột Cafe','Tránh nơi có độ ẩm cao')
insert into NguyenLieu values('Sữa tươi không đường','Bảo quản lạnh')
insert into NguyenLieu values('Sữa đặc','')
insert into NguyenLieu values('Đá viên','Bảo quản ở nhiệt độ thấp')
insert into NguyenLieu values('Bột cacao','Bảo quản nơi khô thoáng')
insert into NguyenLieu values('Bột macha','Bảo quản nơi khô thoáng')
insert into NguyenLieu values('Kem tươi','Bảo quản ở nhiệt độ thấp')
insert into NguyenLieu values('Đường','')
insert into NguyenLieu values('Sốt Caramel','')
insert into NguyenLieu values('Bột quế','')
insert into NguyenLieu values('Mật ong','Bảo quản nơi thoáng mát, không có ánh sáng')
insert into NguyenLieu values('Sữa tươi có đường','Bảo quản lạnh')
go
insert into ChiNhanh values('UIT','Khu phố 6, Linh Trung, Thủ Đức, TP.HCM')
insert into ChiNhanh values('Trung tâm','Quận 1, TP.HCM')
insert into ChiNhanh values('Miền Bắc','Thanh Xuân, Hà Nội')
go
insert into NhanVien values('1','Do Thao Quyen','1','01-04-2022','098765432101')
insert into NhanVien values('2','Hoang Dinh Phu','1','01-05-2022','098765432102')
insert into NhanVien values('3','Nguyen Hai Dang','1','01-06-2022','098765432103')
insert into NhanVien values('1','Jennie','1','01-07-2022','098765432104')
insert into NhanVien values('2','Rose','1','01-08-2022','098765432105')
go
insert into KhachHang values('0602186042','Nguyễn Trường Giang','0','0')
insert into KhachHang values('0878143236','Võ Như Phước','0','0')
insert into KhachHang values('0806254206','Trương Tấn Sang','0','0')
insert into KhachHang values('0446692130','Trần Huy Thắng','0','0')
insert into KhachHang values('0102243354','Đặng Duy Đạt','0','0')
insert into KhachHang values('0194031273','Ngô Văn Khải','0','0')
insert into KhachHang values('0923131757','Đỗ Lê Anh Khoa','0','0')
insert into KhachHang values('0687355295','Hoàng Đình Phú','0','0')
insert into KhachHang values('0395638524','Lê Nguyễn Minh Trung','0','0')
insert into KhachHang values('0714556336','Phan Thế Tuấn','0','0')
insert into KhachHang values('0348877502','Trần Nguyễn Quỳnh Anh','1','0')
insert into KhachHang values('0424614536','Đinh Hoàng Linh Đan','1','0')
insert into KhachHang values('0467206811','Nguyễn Hải Đăng','0','0')
insert into KhachHang values('0217292379','Võ Thành Đô','0','0')
insert into KhachHang values('0295597424','Hoàng Thái Dương','0','0')
insert into KhachHang values('0629967094','Nguyễn Thị Hồng Hải','1','0')
insert into KhachHang values('0908859367','Nguyễn Đạt Huy Hoàng','0','0')
insert into KhachHang values('0181992439','Phan Trần Khánh Hưng','0','0')
insert into KhachHang values('0867206793','Phạm Như Long','0','0')
insert into KhachHang values('0712566967','Phạm Hồ Lượng','0','0')
insert into KhachHang values('0366444758','Nguyễn Nhật Minh','0','0')
insert into KhachHang values('0525286507','Trương Nguyên Ngọc','0','0')
insert into KhachHang values('0520705771','Nguyễn Hữu Thắng','0','0')
insert into KhachHang values('0131308269','Đỗ Thảo Quyên','1','0')
insert into KhachHang values('0580032772','Đinh Quang Ân','0','0')
insert into KhachHang values('0540523541','Nguyễn Đăng Khoa','0','0')
insert into KhachHang values('0561408517','Phan Thị Linh','1','0')
insert into KhachHang values('0388783798','Đào Minh Tuấn','0','0')
insert into KhachHang values('0980955367','Trang Kỳ Anh','1','0')
insert into KhachHang values('0963942803','Trần Gia Băng','0','0')
insert into KhachHang values('0556397160','Nguyễn Hải Đăng','0','0')
insert into KhachHang values('0360080563','Quan Huỳnh Quang Dương','0','0')
insert into KhachHang values('0919899948','Dương Ngọc Hải','0','0')
insert into KhachHang values('0393504228','Nguyễn Quang Huy','0','0')
insert into KhachHang values('0994939058','Nguyễn Tiến Nhân','0','0')
insert into KhachHang values('0348944580','Khưu Minh Phong','0','0')
insert into KhachHang values('0911885989','Trần Gia Phong','0','0')
insert into KhachHang values('0945748827','Võ Thanh Phương','0','0')
insert into KhachHang values('0614565239','Nguyễn Tú Quyên','1','0')
insert into KhachHang values('0306783756','Phạm Phú Tuấn','0','0')
insert into KhachHang values('0617559418','Phạm Hoàng Ân','0','0')
insert into KhachHang values('0398638686','Nguyễn Phúc Minh Khang','0','0')
insert into KhachHang values('0764893918','Trần Quốc Phong','0','0')
insert into KhachHang values('0124382395','Hoàng Văn Lộc','0','0')
insert into KhachHang values('0540263861','Huỳnh Văn Sơn','0','0')
insert into KhachHang values('0731088578','Nguyễn Hoài Nhân','0','0')
insert into KhachHang values('0353533709','Lê Nguyễn Minh Trung','0','0')
insert into KhachHang values('0469997696','Đỗ Việt Bách','0','0')
insert into KhachHang values('0879822356','Trịnh Huỳnh Đăng','0','0')
insert into KhachHang values('0817685226','Vương Đức Đạt','0','0')
insert into KhachHang values('0860946021','Võ Thành Đô','0','0')
insert into KhachHang values('0370624504','Trương Nguyễn Trường Duy','0','0')
insert into KhachHang values('0283568253','Bành Hoàng Giang','0','0')
insert into KhachHang values('0644200321','Đỗ Hải','0','0')
insert into KhachHang values('0519274423','Nguyễn Nhựt Hào','0','0')
insert into KhachHang values('0613438101','Lê Duy Hoàng','0','0')
insert into KhachHang values('0479439492','Nguyễn Huy Hoàng','0','0')
insert into KhachHang values('0231374253','Trần Cao Huy Hoàng','0','0')
insert into KhachHang values('0629298861','Phan Trần Khánh Hưng','0','0')
insert into KhachHang values('0387111073','Nguyễn Huy Khoa','0','0')
insert into KhachHang values('0802057692','Phạm Hồ Lượng','0','0')
insert into KhachHang values('0682646892','Trương Nguyên Ngọc','0','0')
insert into KhachHang values('0271566428','Huỳnh Kim Phát','0','0')
insert into KhachHang values('0446883612','Đặng Hoàng Phong','0','0')
insert into KhachHang values('0344246169','Nguyễn Quang Thái','0','0')
insert into KhachHang values('0747466498','Nguyễn Thừa An Thái','0','0')
insert into KhachHang values('0814305196','Nguyễn Tấn Thịnh','0','0')
insert into KhachHang values('0154392948','Đặng Quốc Trung','0','0')
insert into KhachHang values('0141465040','Trần Thị Thanh Tuyền','1','0')
insert into KhachHang values('0800310826','Nguyễn Công Vũ','0','0')
insert into KhachHang values('0637304753','Trần Thanh Vũ','0','0')
insert into KhachHang values('0899842607','Lê Thị Thanh Hương','1','0')
insert into KhachHang values('0575262086','Đỗ Thảo Quyên','1','0')
insert into KhachHang values('0557451850','Nguyễn Duy Tài','0','0')
insert into KhachHang values('0352494457','Đỗ Quỳnh Chi','1','0')
insert into KhachHang values('0624794302','Đặng Nghiệp Cường','0','0')
insert into KhachHang values('0262579777','Nguyễn Minh Cường','0','0')
insert into KhachHang values('0979187421','Nguyễn Đạt','0','0')
insert into KhachHang values('0457026239','Nguyễn Hiền Đức','0','0')
insert into KhachHang values('0268122787','Nguyễn Hữu Hiệu','0','0')
insert into KhachHang values('0162937163','Trần Thanh Hiếu','0','0')
insert into KhachHang values('0212382227','Trịnh Gia Huy','0','0')
insert into KhachHang values('0966865660','Nguyễn Anh Khoa','0','0')
insert into KhachHang values('0351879616','Nguyễn Đăng Khoa','0','0')
insert into KhachHang values('0887176417','Phạm Ngọc Nguyên','1','0')
insert into KhachHang values('0724181182','Nguyễn Hoàng Nhật','0','0')
insert into KhachHang values('0159516428','Võ Phạm Thùy Nhung','0','0')
insert into KhachHang values('0948943533','Võ Hoàng Phúc','0','0')
insert into KhachHang values('0357942556','Trần Văn Quang','0','0')
insert into KhachHang values('0230035689','Nguyễn Tô Đức Tài','0','0')
insert into KhachHang values('0303010381','Nguyễn Hữu Thắng','0','0')
insert into KhachHang values('0528752426','Lê Công Thành','0','0')
insert into KhachHang values('0164065813','Trần Thu Thảo','1','0')
insert into KhachHang values('0666891069','Võ Thanh Tú','1','0')
insert into KhachHang values('0959861383','Lâm Võ Khánh My','1','0')
insert into KhachHang values('0891780936','Võ Nữ Diễm Trang','1','0')
insert into KhachHang values('0499270374','Nguyễn Bảo Anh','1','0')
insert into KhachHang values('0246068703','Nguyễn Vân Anh','1','0')
insert into KhachHang values('0536554190','Hoàng Gia Quốc Bình','0','0')
insert into KhachHang values('0919912001','Nguyễn Hải Đăng','0','0')
insert into KhachHang values('0917884778','Lê Quang Đông','0','0')
insert into KhachHang values('0207717467','Nông Tiến Dũng','0','0')
insert into KhachHang values('0615458787','Quan Huỳnh Quang Dương','0','0')
insert into KhachHang values('0902483934','Lê Hoàng Duyên','1','0')
insert into KhachHang values('0680171850','Dương Ngọc Hải','0','0')
insert into KhachHang values('0878549680','Hoàng Thị Hòa','1','0')
insert into KhachHang values('0324228778','Nguyễn Quang Huy','0','0')
insert into KhachHang values('0660443787','Trần Ngọc Linh','0','0')
insert into KhachHang values('0456452117','Trần Hoài Nam','0','0')
insert into KhachHang values('0292967322','Đinh Thị Ánh Nguyệt','1','0')
insert into KhachHang values('0952614630','Nguyễn Tiến Nhân','0','0')
insert into KhachHang values('0777684744','Tôn Nữ Thảo Nhi','1','0')
insert into KhachHang values('0934216544','Trương Ý Nhi','1','0')
insert into KhachHang values('0169627344','Phạm Thanh Nhựt','0','0')
insert into KhachHang values('0624940728','Trần Ngọc Mỹ Phương','1','0')
insert into KhachHang values('0130477429','Võ Thanh Phương','1','0')
insert into KhachHang values('0748838750','Nguyễn Tú Quyên','1','0')
insert into KhachHang values('0298504045','Đoàn Tú Quỳnh','1','0')
insert into KhachHang values('0943907886','Trương Nguyễn Quang Thái','0','0')
insert into KhachHang values('0530250439','Chu Quyết Thắng','0','0')
insert into KhachHang values('0161778936','Nguyễn Ngọc Thảo','1','0')
insert into KhachHang values('0973277412','Nguyễn Đức Thuần','0','0')
insert into KhachHang values('0134800312','Võ Thị Hà Trang','1','0')
insert into KhachHang values('0212941859','Nguyễn Quốc Trung','0','0')
insert into KhachHang values('0524604687','Đỗ Mạnh Tuấn','0','0')
go
insert into GiamGia values('10','0','04-30-2022','05-01-2022')
insert into GiamGia values('30','50000','05-05-2022','05-05-2022')
go
insert into Account values('098765432101','25d55ad283aa400af464c76d713c07ad','0','2')
insert into Account values('098765432102','25d55ad283aa400af464c76d713c07ad','0','2')
insert into Account values('098765432103','25d55ad283aa400af464c76d713c07ad','0','2')
insert into Account values('098765432104','25d55ad283aa400af464c76d713c07ad','0','2')
insert into Account values('098765432105','25d55ad283aa400af464c76d713c07ad','0','2')
go
insert into DoUong values('Bạc xỉu đá','25000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\1.jpg', Single_Blob) as img),'')
insert into DoUong values('Bạc xỉu nóng','25000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\2.jpg', Single_Blob) as img),'')
insert into DoUong values('Cappuchino','40000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\3.jpg', Single_Blob) as img),'')
insert into DoUong values('Latte','40000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\4.jpg', Single_Blob) as img),'')
insert into DoUong values('Expresso','30000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\5.jpg', Single_Blob) as img),'')
insert into DoUong values('Caramel Machiato','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\6.jpg', Single_Blob) as img),'')
insert into DoUong values('Americano','40000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\7.jpg', Single_Blob) as img),'')
insert into DoUong values('Mocha','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\8.jpg', Single_Blob) as img),'')
insert into DoUong values('Hot Chocolate','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\9.jpg', Single_Blob) as img),'')
insert into DoUong values('Ice Chocolate','35000',(SELECT BulkColumn FROM Openrowset( Bulk 'E:\DaiHoc\HocKi6\LapTrinhJava\DoAn\Images\10.jpg', Single_Blob) as img),'')
go