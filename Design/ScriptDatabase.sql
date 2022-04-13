/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2017                    */
/* Created on:     4/13/2022 4:18:39 PM                         */
/*==============================================================*/


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
   MANL                 int                  identity,
   MAHDNCC              int                  not null,
   SOLUONG              int                  null,
   GIA                  money                null,
   constraint PK_CTHDNCC primary key (MANL, MAHDNCC)
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
   MAHD                 int                  identity,
   MAGIAMGIA            int                  not null,
   MANV                 int                  null,
   MAKH                 int                  null,
   NGAYLAP              datetime             null,
   TONGTIEN             money                null,
   constraint PK_HOADONKHACHHANG primary key (MAHD)
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
   MAKH                 int                  identity,
   TENKH                nvarchar(255)        null,
   SDT                  char(11)             null,
   TONGDIEM             int                  null,
   constraint PK_KHACHHANG primary key (MAKH)
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
   SDT                  char(11)             null,
   constraint PK_NHACUNGCAP primary key (MANCC)
)
go

/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN (
   MANV                 int                  identity,
   MACN                 int                  null,
   NGAYVL               datetime             null,
   CCCD                 char(13)             null,
   constraint PK_NHANVIEN primary key (MANV)
)
go

