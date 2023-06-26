package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/success")
public class Success extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String marry=req.getParameter("marry");
        String mr;
        if(marry!=null){
            mr="Đã có gia đình";
        }else {
            mr="Độc thân";
        }
        req.setAttribute("maried",mr);
        getServletContext().getRequestDispatcher("/WEB-INF/views/dangky/success.jsp").forward(req,resp);
    }
}
