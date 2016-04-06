import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Lenovo on 2016/4/4.
 */
public class uploadSimpForm extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
        System.out.println("name = " + request.getParameter("name")+ " ; sex = " + request.getParameter("sex"));
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException{
        System.out.println("name = " + request.getParameter("name") + " ; sex = " + request.getParameter("sex"));
    }
}
