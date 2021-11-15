package org.example.test1;

import com.deepoove.poi.XWPFTemplate;
import org.example.util.ToPDf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) throws Exception {
        XWPFTemplate template = XWPFTemplate.compile("D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test1\\签收回执.docx").render(
                new HashMap<String, Object>(){{
                    put("shourangfang", "阳光金融服务有限公司");
                    put("yingshouzhangkuantongzhishubianhao", "8896989569898556568896989");
                }});
        template.writeAndClose(new FileOutputStream("D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test1\\签收回执_out.docx"));

        InputStream is = new FileInputStream("D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test1\\签收回执_out.docx");
        OutputStream os = new FileOutputStream("D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test1\\签收回执_out.pdf");

        String source = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test1\\签收回执_out.docx";
        String targe = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test1\\签收回执_out.pdf";

        ToPDf toPDf = new ToPDf();
        toPDf.word2pdf(source,targe);
        //        doc2pdf(is,os);
    }



}
