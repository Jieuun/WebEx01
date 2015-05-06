package sds.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TableServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");

		String row = request.getParameter("r");
		String col = request.getParameter("c");

		int nRow;
		if (row != null) {
			nRow = Integer.parseInt(row);
		} else {
			nRow = 3;
		}

		int nCol;
		if (col != null) {
			nCol = Integer.parseInt(col);
		} else {
			nCol = 3;
		}

		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.println("<table border = '1px' cellspacing = '0' cellpadding='10px' >");

		for (int i = 0; i < nRow; i++) {
			out.print("<tr>");

			for (int j = 0; j < nCol; j++) {
				out.print("<td>셀(" + i + "," +j+")</td>");
			}
			out.print("</tr>");
		}

		out.print("</table>");
	}

}
