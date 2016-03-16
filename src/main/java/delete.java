import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Created by chm on 12/14/15.
 */
public class delete extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("delete doGet");
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("delete doPost : ");
        String filename = request.getParameter("filename");
        String filepath = "/home/chm/apk/upload/"+filename;
        File file = new File(filepath);
        System.out.println("delete doPost : filename = " + file.getName() );

        if(file.exists()){
            file.delete();
        }
    }
}
