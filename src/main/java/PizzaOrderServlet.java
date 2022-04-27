import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        RequestDispatcher view = request.getRequestDispatcher("pizza-order.jsp");
        view.forward(request,response);
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response){
        String name = request.getParameter("crust");
        request.setAttribute("crust",name);
        String sauce = request.getParameter("sauce");
        request.setAttribute("sauce",sauce);
        String size = request.getParameter("size");
        request.setAttribute("size",size);
        String address = request.getParameter("address");
        request.setAttribute("address",address);


    }

}
