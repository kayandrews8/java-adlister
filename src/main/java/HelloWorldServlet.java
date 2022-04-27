import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/Hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
        String name = request.getParameter("name");

        request.setAttribute("name", name);
        RequestDispatcher view = request.getRequestDispatcher("/hello.jsp");
        view.forward(request,response);
    }
}
