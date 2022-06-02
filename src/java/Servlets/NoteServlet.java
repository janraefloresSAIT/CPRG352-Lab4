package Servlets;

import Models.Note;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author janraeSAIT
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        Note note = new Note();
        String noteForm = request.getParameter("edit");

        if (noteForm == null) {
            String title = br.readLine();
            note.setTitle(title);
            request.setAttribute("title", note.getTitle());

            while (title != null) {
                String content = br.readLine();
                note.setContent(content);
                request.setAttribute("content", note.getContent());
                break;
            }
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        } else {
            String title = br.readLine();
            note.setTitle(title);
            request.setAttribute("title", note.getTitle());

            while (title != null) {
                String content = br.readLine();
                note.setContent(content);
                request.setAttribute("content", note.getContent());
                break;
            }
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title_input");
        String content = request.getParameter("content_input");
        
        Note note = new Note(title, content);

        if (title == null || title.equals("") || content == null || content.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        } else {
            request.setAttribute("title", note.getTitle());
            request.setAttribute("content", note.getContent());
        }

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }
}
