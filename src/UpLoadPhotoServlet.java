import org.apache.commons.codec.binary.Base64;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/12/11.
 */
public class UpLoadPhotoServlet extends HttpServlet {

    private static final long seriaVerID=1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        //获取文件名字
        String name=req.getParameter("name");
        //获取文件
        String img=req.getParameter("img");
        //将图片格式化处理
        byte[] bytes=Base64.decodeBase64(img);
                //new BASE64Decoder().decodeBuffer(img);
        //写到内存的文件夹下，该文件夹必须存在
        FileOutputStream fos=new FileOutputStream("G:/APPWebService/PackageTmp/Image/"+name);
        fos.write(bytes);
        fos.flush();
        fos.close();

        PrintWriter writer=resp.getWriter();
        writer.print("上传成功" );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
