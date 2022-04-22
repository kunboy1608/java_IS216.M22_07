create or alter function DangNhap(@username char(255), @password char(32))
returns tinyint 
BEGIN
DECLARE
@type tinyint
	select @type = [TYPE] from [dbo].[ACCOUNT] where USERNAME=@username and PASSWORD=@password
	return @type;
END;