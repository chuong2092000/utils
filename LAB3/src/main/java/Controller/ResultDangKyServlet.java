package Controller;

import Model.NhanVien;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/result-dangky")
public class ResultDangKyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        try {
//           DateConverter dateConverter=new DateConverter();
//           dateConverter.setPattern("yyyy/MM/dd");
//            ConvertUtils.register(dateConverter,Date.class);
            NhanVien  nhanVien=new NhanVien();
            BeanUtils.populate(nhanVien,req.getParameterMap());
            req.setAttribute("bean",nhanVien);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/views/BeanUtil/result-dangky.jsp").forward(req,resp);
    }

}
