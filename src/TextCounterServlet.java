import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/textCounter")
public class TextCounterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("ta");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.println(text);
        writer.println("Ilość słów: " + TextCounter.countWords(text));
        writer.println("Ilość znaków: " + TextCounter.countChars(text));
        writer.println("Ilość znaków (bez spacji): " + TextCounter.countCharsWithoutSpaces(text));
        writer.println("Palindrom: " + TextCounter.checkPalindrome(text));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
