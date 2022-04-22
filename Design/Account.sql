USE [cafe_java]
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


