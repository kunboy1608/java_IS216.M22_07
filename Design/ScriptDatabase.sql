/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2017                    */
/* Created on:     3/31/2022 9:56:00 PM                         */
/*==============================================================*/

create database cafe_java

go

use cafe_java

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
            from  sysindexes
           where  id    = object_id('CTHD')
            and   name  = 'CTHD2_FK'
            and   indid > 0
            and   indid < 255)
   drop index CTHD.CTHD2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('CTHD')
            and   name  = 'CTHD_FK'
            and   indid > 0
            and   indid < 255)
   drop index CTHD.CTHD_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CTHD')
            and   type = 'U')
   drop table CTHD
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('CTHDNCC')
            and   name  = 'CTHDNCC2_FK'
            and   indid > 0
            and   indid < 255)
   drop index CTHDNCC.CTHDNCC2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('CTHDNCC')
            and   name  = 'CTHDNCC_FK'
            and   indid > 0
            and   indid < 255)
   drop index CTHDNCC.CTHDNCC_FK
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
            from  sysindexes
           where  id    = object_id('HOADONKHACHHANG')
            and   name  = 'GIAMGIA_FK'
            and   indid > 0
            and   indid < 255)
   drop index HOADONKHACHHANG.GIAMGIA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('HOADONKHACHHANG')
            and   name  = 'LAP_FK'
            and   indid > 0
            and   indid < 255)
   drop index HOADONKHACHHANG.LAP_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('HOADONKHACHHANG')
            and   name  = 'MUA_FK'
            and   indid > 0
            and   indid < 255)
   drop index HOADONKHACHHANG.MUA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('HOADONKHACHHANG')
            and   type = 'U')
   drop table HOADONKHACHHANG
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('HOADONNCC')
            and   name  = 'NHAP_FK'
            and   indid > 0
            and   indid < 255)
   drop index HOADONNCC.NHAP_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('HOADONNCC')
            and   name  = 'NHANHANG_FK'
            and   indid > 0
            and   indid < 255)
   drop index HOADONNCC.NHANHANG_FK
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
            from  sysindexes
           where  id    = object_id('NHANVIEN')
            and   name  = 'CO_FK'
            and   indid > 0
            and   indid < 255)
   drop index NHANVIEN.CO_FK
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
   MACN                 int                  not null,
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
   constraint PK_CTHD primary key (MAHD, MADU)
)
go

/*==============================================================*/
/* Index: CTHD_FK                                               */
/*==============================================================*/




create nonclustered index CTHD_FK on CTHD (MAHD ASC)
go

/*==============================================================*/
/* Index: CTHD2_FK                                              */
/*==============================================================*/




create nonclustered index CTHD2_FK on CTHD (MADU ASC)
go

/*==============================================================*/
/* Table: CTHDNCC                                               */
/*==============================================================*/
create table CTHDNCC (
   MANL                 int                  not null,
   MAHDNCC              int                  not null,
   TONG                 money                null,
   constraint PK_CTHDNCC primary key (MANL, MAHDNCC)
)
go

/*==============================================================*/
/* Index: CTHDNCC_FK                                            */
/*==============================================================*/




create nonclustered index CTHDNCC_FK on CTHDNCC (MANL ASC)
go

/*==============================================================*/
/* Index: CTHDNCC2_FK                                           */
/*==============================================================*/




create nonclustered index CTHDNCC2_FK on CTHDNCC (MAHDNCC ASC)
go

/*==============================================================*/
/* Table: DOUONG                                                */
/*==============================================================*/
create table DOUONG (
   MADU                 int                  not null,
   TENDU                nvarchar(255)        null,
   TONG                 money                null,
   HINHANH              image                null,
   GHICHU               nvarchar(255)        null,
   constraint PK_DOUONG primary key (MADU)
)
go

/*==============================================================*/
/* Table: GIAMGIA                                               */
/*==============================================================*/
create table GIAMGIA (
   MAGIAMGIA            int                  not null,
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
   MAGIAMGIA            int                  not null,
   MAHD                 int                  not null,
   MANV                 int                  null,
   MAKH                 int                  null,
   NGAYLAP              datetime             null,
   TONGTIEN             money                null,
   constraint PK_HOADONKHACHHANG primary key (MAGIAMGIA, MAHD)
)
go

/*==============================================================*/
/* Index: MUA_FK                                                */
/*==============================================================*/




create nonclustered index MUA_FK on HOADONKHACHHANG (MAKH ASC)
go

/*==============================================================*/
/* Index: LAP_FK                                                */
/*==============================================================*/




create nonclustered index LAP_FK on HOADONKHACHHANG (MANV ASC)
go

/*==============================================================*/
/* Index: GIAMGIA_FK                                            */
/*==============================================================*/




create nonclustered index GIAMGIA_FK on HOADONKHACHHANG (MAGIAMGIA ASC)
go

/*==============================================================*/
/* Table: HOADONNCC                                             */
/*==============================================================*/
create table HOADONNCC (
   MANV                 int                  not null,
   MANCC                int                  not null,
   MAHDNCC              int                  not null,
   NGAYLAP              datetime             null,
   NGAYTHANHTOAN        datetime             null,
   TONGTIEN             money                null,
   NO                   char(10)             null,
   GHICHU               nvarchar(255)        null,
   constraint PK_HOADONNCC primary key (MANV, MANCC, MAHDNCC)
)
go

/*==============================================================*/
/* Index: NHANHANG_FK                                           */
/*==============================================================*/




create nonclustered index NHANHANG_FK on HOADONNCC (MANV ASC)
go

/*==============================================================*/
/* Index: NHAP_FK                                               */
/*==============================================================*/




create nonclustered index NHAP_FK on HOADONNCC (MANCC ASC)
go

/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
create table KHACHHANG (
   MAKH                 int                  not null,
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
   MANL                 int                  not null,
   TENNL                nvarchar(255)        null,
   GHICHU               nvarchar(255)        null,
   constraint PK_NGUYENLIEU primary key (MANL)
)
go

/*==============================================================*/
/* Table: NHACUNGCAP                                            */
/*==============================================================*/
create table NHACUNGCAP (
   MANCC                int                  not null,
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
   MANV                 int                  not null,
   MACN                 int                  null,
   NGAYVL               datetime             null,
   CCCD                 char(13)             null,
   constraint PK_NHANVIEN primary key (MANV)
)
go

/*==============================================================*/
/* Index: CO_FK                                                 */
/*==============================================================*/




create nonclustered index CO_FK on NHANVIEN (MACN ASC)
go

