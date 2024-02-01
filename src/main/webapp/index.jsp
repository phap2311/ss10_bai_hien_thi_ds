<%@ page import="java.util.List" %>
<%@ page import="com.example.ss10_display_list.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        img {
            width: 50px;
            height: 50px;
        }
    </style>
    <title>Danh sách khách hàng</title>
</head>
<body>
<h2>Danh sách khách hàng</h2>
<%
    List<Customer>list = new ArrayList<>();
    list.add(new Customer("Bùi trần thanh dụng", "1994-08-20", "Quảng Ngãi", "https://bloganchoi.com/wp-content/uploads/2022/05/hinh-avatar-doi-dep-2022-6-696x696.jpg"));
    list.add(new Customer("Lương Văn Đạt", "2000-08-21", "Hà Tĩnh", "https://www.tnmt.edu.vn/wp-content/uploads/2023/11/hinh-nen-con-trai-1.jpg"));
    list.add(new Customer("Nguyễn Trúc Vi", "2005-08-25", "Quảng Nam", "https://haycafe.vn/wp-content/uploads/2021/11/avatar-fb-co-be-gai.jpg"));
    list.add(new Customer("Nguyễn Văn Hải Nhật", "2003-02-02", "Quảng Trị", "https://moc247.com/wp-content/uploads/2023/10/suu-tam-50-anh-avatar-ngau-cho-nam-dep-buon-an-tuong-nhat_2.jpg"));
    list.add(new Customer("Lê Đăng Pháp", "1998-01-23", "Quảng Trị", "https://haycafe.vn/wp-content/uploads/2021/11/Anh-avatar-dep-chat-lam-hinh-dai-dien.jpg"));
    request.setAttribute("ds", list);
%>
    <table border="1px">
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>

        <c:forEach items="${ds}" var="c">
            <tr>
                <td>${c.nameCustomer}</td>
                <td>${c.birthday}</td>
                <td>${c.addressCustomer}</td>
                <td>
                    <img src="${c.imgCustomer}">
                </td>
            </tr>
        </c:forEach>
    </table>





</body>
</html>