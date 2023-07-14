# Chat-Voice
# Xây dựng chương trình chat VOIP bằng RMI
Chat VoIP: sẽ sử dụng Sever (Máy chủ) để quản lý các Client (máy khách) khi tham gia vào ứng dụng chat. Đây là một nền tảng và giao thức độc lập được sử dụng để gửi, nhận giữa các Client và Server là một người quản lý và phân luồng cho thông tin đi đúng người gửi và nhận
Mô hình được phổ biến nhất và được chấp nhận rộng rãi trong các hệ thống phân tán là mô hình client/server. Trong mô hình này sẽ có một tập các tiến trình mà mỗi tiến trình đóng vai trò như là một trình quản lý tài nguyên cho một tập hợp các tài nguyên cho trước và một tập hợp các tiến trình client trong đó mỗi tiến trình thực hiện một tác vụ nào đó cần truy xuất tới tài nguyên phần cứng hoặc phần mềm dùng chung. Bản thân các trình quản lý tài nguyên cần phải truy xuất tới các tài nguyên dùng chung được quản lý bởi một tiến trình khác, vì vậy một số tiến trình vừa là tiến trình client vừa là tiến trình server. Các tiến trình phát ra các yêu cầu tới các server bất kỳ khi nào chúng cần truy xuất tới một trong các tài nguyên của các server. Nếu yêu cầu là đúng đắn thì server sẽ thực hiện hành động được yêu cầu và gửi một đáp ứng trả lời tới tiến trình client.
Mô hình truyền tin client/server hướng tới việc cung cấp dịch vụ. Quá trình trao đổi dữ liệu bao gồm:
Truyền một yêu cầu từ tiến trình client tới tiến trình server
Yêu cầu được server xử lý
Truyền đáp ứng cho client

# Giới thiệu bài toán
- Yêu cầu của bài toán: Xây dựng chương trình Chat VoIP sử dụng java socket
- Sử dụng giao thức  SIP, TCP/IP. 
- Server chịu trách nhiệm quản lý các Client, bật tắt server để các client tham gia vào, hiện thông thông báo khi client ra vào server.
- Client là một người khác khi vào server sẽ có chức năng như sau: đăng nhập, đăng ký, gửi tin nhắn, gửi vocie, gửi icon, gửi ảnh.
 - Yêu cầu giao diện:đơn giản thân thiện dễ nhìn

# Chức năng

# Phía khách hàng (Client):
- Đăng Kí Tài Khoản.
- Đăng Nhập.
- Gửi tin nhắn
- Gửi voice
- Gửi icon
- Gửi ảnh
- Thoát.
# Phía Máy Chủ (Server):
- Quản lý Client
- Quản lý các thông báo khi client ra vào phòng chat
- Bật tắt server
