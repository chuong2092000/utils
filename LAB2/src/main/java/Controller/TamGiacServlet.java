package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet({"/tamgiac","/chuvi","/dientich"})
public class TamGiacServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/views/tamgiac/tam-giac.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String canha=req.getParameter("canha");
        String canhb=req.getParameter("canhb");
        String canhc=req.getParameter("canhc");
        if(req.getRequestURI().contains("chuvi")){
            Double a=Double.parseDouble(canha);
            Double b=Double.parseDouble(canhb);
            Double c=Double.parseDouble(canhc);
            if( (a + b > c) && (a + c > b) && (b + c > a) ) {
                Double cv=(a+b+c);
                req.setAttribute("result","chu vi tam giác : "+cv);
            }else{
                req.setAttribute("result","Không thỏa điều kiện");

            }
        }else {
            Double a = Double.parseDouble(canha);
            Double b = Double.parseDouble(canhb);
            Double c = Double.parseDouble(canhc);
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                Double cv = (a + b + c);
                Double dt = Math.sqrt(cv * (a + b - c) * (a + c - b) * (b + c - a)) / 4;
                req.setAttribute("result", "diện tích tam giác : " + dt);
            } else {
                req.setAttribute("result", "Không thỏa điều kiện");

            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/views/tamgiac/tam-giac.jsp").forward(req,resp);
    }
}
