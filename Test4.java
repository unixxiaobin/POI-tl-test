package org.example.test4;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import org.example.util.ToPDf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test4 {
    public static void main(String[] args) throws Exception {
        String resource = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test4\\应收账款转让通知书.docx";
        String out1 = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test4\\应收账款转让通知书_out1.docx";
        String target = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test4\\应收账款转让通知书_out1.pdf";
        TableC4 data = new TableC4();
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

        data.setBianhao("20211110");
        data.setZhaiwuren("工行股份有限公司");
        data.setZhuanrangfang("中国银联");
        data.setShourangfang( "中国银联BOSS");
        data.setHao("00001");
        data.setHuming("Test");
        data.setZhanghu("6225 8898 9898 8786");
        data.setKaihuhang("中国工商银行");

        LoopRowTableRenderPolicy hackLoopTableRenderPolicy = new LoopRowTableRenderPolicy();
        Configure config = Configure.builder().bind("detail", hackLoopTableRenderPolicy).build();
        XWPFTemplate.compile(resource, config).render(data).writeAndClose(new FileOutputStream(out1));

        ToPDf toPDf = new ToPDf();
        toPDf.word2pdf(out1,target);
    }
}
