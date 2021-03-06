import model.PointAndClick;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by User on 27.05.2017.
 */
public class SudokuServlet extends HttpServlet{

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession(true);


        PointAndClick pointAndClick = (PointAndClick) session.getAttribute("sudokuBoard");

        if (pointAndClick == null) {
            pointAndClick = new PointAndClick();
            session.setAttribute("sudokuBoard", pointAndClick);
        }

        if (req.getParameter("x") != null && req.getParameter("y") != null) {
            int x = Integer.parseInt(req.getParameter("x"));
            int y = Integer.parseInt(req.getParameter("y"));

            pointAndClick.setSudokuBoard(x, y);
        }

        req.setAttribute("sudokuBoard", pointAndClick);
        req.getRequestDispatcher("/sudoku.jsp").forward(req, resp);


    }
}
