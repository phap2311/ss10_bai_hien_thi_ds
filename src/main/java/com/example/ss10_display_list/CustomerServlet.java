package com.example.ss10_display_list;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
//        List<Customer> list = new ArrayList<>();
//        list.add(new Customer("Bùi trần thanh dụng", "1994-08-20", "Quảng Ngãi", "https://bloganchoi.com/wp-content/uploads/2022/05/hinh-avatar-doi-dep-2022-6-696x696.jpg"));
//        list.add(new Customer("Lương Văn Đạt", "2000-08-21", "Hà Tĩnh", "https://www.tnmt.edu.vn/wp-content/uploads/2023/11/hinh-nen-con-trai-1.jpg"));
//        list.add(new Customer("Nguyễn Trúc Vi", "2005-08-25", "Quảng Nam", "https://haycafe.vn/wp-content/uploads/2021/11/avatar-fb-co-be-gai.jpg"));
//        list.add(new Customer("Nguyễn Văn Hải Nhật", "2003-02-02", "Quảng Trị", "https://moc247.com/wp-content/uploads/2023/10/suu-tam-50-anh-avatar-ngau-cho-nam-dep-buon-an-tuong-nhat_2.jpg"));
//        list.add(new Customer("Lê Đăng Pháp", "1998-01-23", "Quảng Trị", "https://haycafe.vn/wp-content/uploads/2021/11/Anh-avatar-dep-chat-lam-hinh-dai-dien.jpg"));
//        req.setAttribute("ds", list);
//        dispatcher.forward(req, resp);
//    }
}
