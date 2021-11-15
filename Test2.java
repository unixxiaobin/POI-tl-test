package org.example.test2;

import com.deepoove.poi.XWPFTemplate;
import org.example.util.ToPDf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) throws Exception {

        String source = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test2\\商票质押合同_out.docx";
        String target = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test2\\商票质押合同_out.pdf";
        XWPFTemplate template = XWPFTemplate.compile("D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test2\\商票质押合同.docx").render(
                new HashMap<String, Object>(){{
                    put("bianhao", "20211110");
                    put("zhiquanren", "阳光股份有限公司");
                    put("zhiquanren_legal", "林BOSS");
                    put("zhiquanren_adress", "上海市杨浦区杨树浦路1062号");
                    put("chuzhiren", "中国银联");
                    put("chuzhiren_legal", "中国银联BOSS");
                    put("chuzhiren_adress", "上海市浦东新区锦绣路998号含笑路36号\n");
                }});
        template.writeAndClose(new FileOutputStream(source));


        ToPDf toPDf = new ToPDf();
        toPDf.word2pdf(source,target);
    }
}
