package org.example.test5;


import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import org.example.util.ToPDf;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) throws Exception {
        String resource = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test5\\应收账款转让协议.docx";
        String out = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test5\\应收账款转让协议_out.docx";
        String target = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test5\\应收账款转让协议_out.pdf";
        Data data = new Data();

        data.setChurangfang("杭州水泥有限公司");
        data.setJiezhoufang("恒大地产");
        data.setBiaohao("987654321");
        data.setFapiaoheji("9876549.98");
        data.setYishouheji("891236598.98");
        data.setYishouhejiDa("捌玖壹贰叁陆伍玖捌点玖捌");

        List piao = new ArrayList<Piao>();
        data.setPiao(piao);
     for (int i = 1; i< 100;i++){
         Piao p = new Piao();
         p.setXuhao(String.valueOf(i));
         p.setHetonghao("ht_"+i);
         p.setBianhao("123");
         p.setZainame("债务人名称");
         p.setZname("转让方名称");
         p.setFphao("98653");
         p.setFpamt("986987.32");
         p.setYinamt("12345687.99");
         p.setDaoqiri("2021-12-15");
         piao.add(p);
     }


        LoopRowTableRenderPolicy hackLoopTableRenderPolicy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("piao", hackLoopTableRenderPolicy).build();
        XWPFTemplate compile = XWPFTemplate.compile(resource, config);
        XWPFTemplate render = compile.render(data);
        render.writeAndClose(new FileOutputStream(out));

        ToPDf toPDf = new ToPDf();
        toPDf.word2pdf(out,target);

    }
}
