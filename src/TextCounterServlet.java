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
        request.setCharacterEncoding("UTF-8");//żeby pobrać tekst z polskimi znakami
        String text = request.getParameter("ta");


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.println("<p><i>"+text+"</i></p>");
        writer.println("<h2>Ilość słów: " + TextCounter.countWords(text)+"</h2>");
        writer.println("<h2>Ilość znaków: " + TextCounter.countChars(text)+"</h2>");
        writer.println("<h2>Ilość znaków (bez spacji): " + TextCounter.countCharsWithoutSpaces(text)+"</h2>");
        writer.println("<h2>Palindrom: " + TextCounter.checkPalindrome(text)+"</h2>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
