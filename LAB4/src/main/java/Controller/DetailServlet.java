package Controller;

import Model.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Item item=new Item("Mercedes","https://assets.oneweb.mercedes-benz.com/iris/iris.jpg?COSY-EU-100-1713d0VXq0hdqtyO67PobzIr3eWsrrCsdRRzwQZv9IZbMw3SGtGyMtsd2vtcUfp8cXGEuiRJ0l34AOB2NQnbApj7bI5ux52QC31vTkzNBTnm7jA6IhKV5Kh%25vqCBlyLRznyYax7oxrH1KMun8wsOcoiZU7pM4FGTJTg906V6PDBGlSeWAhItsd5kdcUfSA1XGEvTSJ0lL6qOB2abRbApHYpI5usoJQC3UC1kzNGtNm7j0O3hKVB%25t%25vqA8TyLRiO6Yax4JOroYhfldsbbAp7oMIkb1ECQmIFUrkzNUU6m7jscWhKVzsM%25vq7UcyLRKOyYaxvODrH1peKn8wiA2oiZ45gM4zuA1YtEWpTuP6CPDAFIT9ZxeedNtjD%259j6hVNpLpIZIGwC7Ux0wPfejr9j&imgt=P27&bkgnd=9&pov=BE140&uni=cs&im=Crop,rect=(0,0,1450,750),gravity=Center;Resize,width=300",420.0,300.0,new Date());
        req.setAttribute("item",item);
        getServletContext().getRequestDispatcher("/WEB-INF/views/bai3/detail.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
