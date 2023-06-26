package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;

@WebServlet({"/chunhat","/chuvi","/dientich"})
public class HcnServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/views/hcn/form-chu-nhat.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String chieudai=req.getParameter("chieudai");
        String chieurong=req.getParameter("chieurong");
        if(req.getRequestURI().contains("chuvi")){
            Double cd=Double.parseDouble(chieudai);
            Double cr=Double.parseDouble(chieurong);
            Double chuvi=(cd+cr)*2;
            req.setAttribute("result","Chu Vi hcn là : "+chuvi);
        }else{
            Double cd=Double.parseDouble(chieudai);
            Double cr=Double.parseDouble(chieurong);
            Double dt=cd*cr;
            req.setAttribute("result","Diện tích hcn là : "+dt);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/views/hcn/form-chu-nhat.jsp").forward(req,resp);
    }
}
