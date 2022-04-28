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

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String address = request.getParameter("address");
        String[] toppings = request.getParameterValues("toppings");

        request.setAttribute("crust",name);
        request.setAttribute("sauce",sauce);
        request.setAttribute("size",size);
        request.setAttribute("address",address);
        request.setAttribute("toppings",toppings);
        request.getRequestDispatcher("pizza-order.jsp").forward(request,response);

    }

}
