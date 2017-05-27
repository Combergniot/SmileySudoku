import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 27.05.2017.
 */
public class KotkiServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        String name = req.getParameter("name");
        resp.setContentType("text/html");

        req.setAttribute("name", name);
        req.getRequestDispatcher("/kotki.jsp").forward(req, resp);


    }
}
