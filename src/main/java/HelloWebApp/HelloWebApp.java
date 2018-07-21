package HelloWebApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWebApp", urlPatterns = {"hello"}, loadOnStartup = 1)
public class HelloWebApp extends HttpServlet {
    @java.lang.Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
                super.doGet(req, resp);
    }

    @java.lang.Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
                super.doPost(req, resp);
                String name = req.getParameter("name");
                if (name == null) name = "WebApp";
                req.setAttribute("user",name);
                req.getRequestDispatcher("respone.jsp").forward(req,resp);
    }
}
