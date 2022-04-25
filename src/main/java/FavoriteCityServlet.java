import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/favCity")
public class FavoriteCityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String html = "<form method='POST'";
        html+="<label for='search'>Favorite City</label>";
        html += "<input name='fav-city' id='fav-city' placeholder='Enter city name'>";
        html += "<br>";
        html += "<button>Submit</button>";
        html += "</form>";

        response.getWriter().println(html);
    }


    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String favCity = request.getParameter("fav-city");
        response.sendRedirect("/favCity/is?fav-city=" + favCity);
    }
}
