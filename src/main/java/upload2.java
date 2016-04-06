import java.io.*;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.util.Iterator;
import java.util.List;

public class upload2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            request.setCharacterEncoding("UTF-8");

            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (isMultipart) {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List items = upload.parseRequest(request);

                //Process the uploaded items
                Iterator iter = items.iterator();

                while(iter.hasNext()){
                    FileItem item = (FileItem)iter.next();
                    if(item.isFormField()){
                        String name =item.getFieldName();
                        String value = item.getString("UTF-8");
                        System.out.println("name = " + name + " ; value = " + value);
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("upload successed!");
    }
}
