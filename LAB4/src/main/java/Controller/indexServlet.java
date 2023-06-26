package Controller;

import Model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/index")
public class indexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        User[] user=new User[]{
                new User("Haichuong","123",true),
                new User("Haichuong2","123",false),
                new User("Haichuong3","123",true),
        };
        List<User> users=Arrays.asList(user);
        req.setAttribute("mes","Quản Lý Người Sử Dụng");
        req.setAttribute("form",users.get(1));
        req.setAttribute("item",users);
       getServletContext().getRequestDispatcher("/WEB-INF/views/bai2/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
