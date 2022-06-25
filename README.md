# java_IS216.M22_07
* Thông tin môn học*

* Môn: Lập trình Java
* Mã lớp: IS216.M22
* Năm học: HK2 2021-2022
* Giảng viên: 
	* Mai Xuân Hùng
	* Nguyễn Minh Nhựt
* Thành viên
	* <a href="https://github.com/kunboy1608">Nhóm trưởng: Hoàng Đình Phú</a>
	* <a href="https://github.com/quine247">Thành viên: Đỗ Thảo Quyên</a>
	* <a href="https://github.com/ddawng-8">Thành viên: Nguyễn Hải Đăng</a>

*Giới thiệu đồ án*
	*Tên đề tài: Xây dựng hệ thống quản lý cửa hàng Cafe

Tóm tắt chức năng
* Admin: Thêm sửa xóa các mục sau:	
	* Hóa đơn khách hàng, chi tiết hóa đơn		
	* Danh sách khách hàng, nhân viên		
	* Giảm giá		
	* Danh sách các chi nhánh
	* Danh sách đồ uống
	* Tài khoản(Account)		
* Quản lý sẽ được cấp mục sau:	
	* Hóa đơn khách hàng, chi tiết hóa đơn(Chỉ xem, cập nhập và xóa hóa đơn)
	* Danh sách khách hàng(thêm, xóa, sửa)
	* Hóa đơn khách hàng, chi tiết hóa đơn(sửa, xóa)
	* Danh sách nhân viên, khách hàng(thêm, xóa, sửa)
	* Giảm giá(thêm, xóa, sửa)
	* Danh sách các chi nhánh(thêm, xóa, sửa)
	* Danh sách đồ uống(thêm, xóa, sửa)
	* Tài khoản(Account)		
* Nhân viên sẽ được cấp mục sau:	
	* Hóa đơn khách hàng, chi tiết hóa đơn(thêm, xóa, sửa)
	* Danh sách khách hàng(thêm, xóa, sửa)		
	* Chi tiết hóa đơn, hóa đơn khách hàng sẽ được tự động tính khi nhân viên yêu cầu chức năng thanh toán
	* Tạo account tương ứng cho quản lý sẽ chỉ được lựa chọn các nhân viên chưa có tài khoản và
	tự động phân quyền theo các role đã được định sẵn

* Chức năng bonus
	* Chi tiết hóa đơn, hóa đơn khách hàng sẽ được in khi nhân viên yêu cầu chức năng thanh toán
	* Nhân viên trong cửa hành thực hiện chức năng trao đổi với khách hàng qua ChatBox
	* Khách hàng gọi món qua gia diện
	* Phân quyền người truy cập

* Yêu cầu hệ thống
	* SQL Server 2019
	* JDK 17
* Hình ảnh xem trước:

<img alt="Login Frame" scr="img/login.png"/>

<img alt="Sale Frame" scr="img/sale.png"/>

<img alt="Home Frame" scr="img/homepage.png"/>
