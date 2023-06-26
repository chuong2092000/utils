package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
@MultipartConfig
@WebServlet("/result-upload")
public class ResultUpload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File dir=new File(getServletContext().getRealPath("/file"));
        if(!dir.exists()){
            dir.mkdirs();
        }
//        Part photo = req.getPart
//        File Hinhanh=new File(dir,photo.getsubmittedname());
        req.getRequestDispatcher("/WEB-INF/views/Upload/result.jsp").forward(req,resp);


    }
}
