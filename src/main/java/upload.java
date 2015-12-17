import java.io.PrintWriter;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by chm on 12/7/15.
 */
public class upload extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
        try {
            request.setCharacterEncoding("UTF-8");
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = upload.parseRequest(request);

            String fileName="";
            File savefile ;
            String apkPath = "/home/chm/apk/upload/";

            for (FileItem item : items) {
                if (!item.isFormField()) {
                    fileName = apkPath + item.getName();
                    savefile = new File(fileName);
                    item.write(savefile);
                }
            }
        }catch(Exception e){
          e.printStackTrace();
        }

        PrintWriter out = null;
        try {
            out = response.getWriter();
        }catch (Exception e){
            e.printStackTrace();
        }
        out.println("upload successed!");
    }
}
