package org.example.test3;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        String resource = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test3\\应收账款转让通知书.docx";
        String out1 = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test3\\应收账款转让通知书_out1.docx";
//        String out2 = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test3\\应收账款转让通知书_out2.docx";
//        XWPFTemplate template = XWPFTemplate.compile(resource).render(
//                new HashMap<String, Object>(){{
//                    put("bianhao", "20211110");
//                    put("zhaiwuren", "工行有限公司");
//                    put("zhuanrangfang", "中国银联");
//                    put("shourangfang", "中国银联BOSS");
//                    put("hao", "00001");
//                    put("huming", "Test");
//                    put("zhanghu", "6225 8898 9898 8786");
//                    put("kaihuhang", "中国工商银行");
//                }});

        TableC data = new TableC();
        List<Detail> detailList= new ArrayList<>();
        Detail detail1 = new Detail();
        detail1.setXuhao("1");
        detail1.setAmt("8888.89");
        detail1.setHetonghao("HT_986589898");
        detail1.setRiqi("2021-09-18");
        Detail detail2 = new Detail();
        detail2.setXuhao("2");
        detail2.setAmt("11118.89");
        detail2.setHetonghao("HT_986589866");
        detail2.setRiqi("2021-01-18");
        Detail detail3 = new Detail();
        detail3.setXuhao("3");
        detail3.setAmt("8888.89");
        detail3.setHetonghao("HT_986589877");
        detail3.setRiqi("2021-10-18");
        detailList.add(detail1);
        detailList.add(detail2);
        detailList.add(detail3);
        data.setDetail(detailList);
//        template.writeAndClose(new FileOutputStream(out1));

        LoopRowTableRenderPolicy hackLoopTableRenderPolicy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("detail", hackLoopTableRenderPolicy).build();
        XWPFTemplate render = XWPFTemplate.compile(resource, config).render(data);
        render.writeAndClose(new FileOutputStream(out1));



    }
}
