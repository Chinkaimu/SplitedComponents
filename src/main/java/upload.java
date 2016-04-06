import java.io.*;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.util.List;

public class upload extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
        try {
            request.setCharacterEncoding("UTF-8");
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = upload.parseRequest(request);
            System.out.println(request.getParameter("userid"));
            System.out.println(request.getParameter("filelabel"));

            String fileName="";
            File savefile ;
            String apkPath = "D:/temp/";

            for (FileItem item : items) {
                if (!item.isFormField()) {
                    fileName = apkPath + item.getName();
                    System.out.println("fileName = " + fileName);
                    savefile = new File(fileName);
                    item.write(savefile);
                }else if(item.isFormField()){
                    String name = item.getFieldName();
                    String value = item.getString("UTF-8");
                    System.out.println("name = " + name + " ; value = " + value);
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
