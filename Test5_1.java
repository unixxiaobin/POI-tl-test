package org.example.test5;


import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.*;
import com.deepoove.poi.data.Tables.TableBuilder;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import com.deepoove.poi.policy.TableRenderPolicy;
import org.example.util.ToPDf;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test5_1 {
    public static void main(String[] args) throws Exception {
        String resource = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test5\\应收账款转让协议.docx";
        String out = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test5\\应收账款转让协议_out_1.docx";
        String target = "D:\\idea_workspace\\poi-demos\\poi-tl-test\\src\\main\\java\\org\\example\\test5\\应收账款转让协议_out_1.pdf";

        Map<String, Object> datas = new HashMap<String, Object>();
        List renderData = new ArrayList();

//        RowRenderData row0 = Rows.of("序号", "基础交易合同名称", "基础交易合同编号","债务人名称","转让方名称","发票编号","发票金额","转让应收账款金额","应收账款到期日").center().bgColor("4472C4").create();
        RowRenderData row0 = Rows.of("序号", "基础交易合同名称", "基础交易合同编号","债务人名称","转让方名称","发票编号","发票金额","转让应收账款金额","应收账款到期日").textFontSize(8).create();
        renderData.add(row0);

        for (int j = 1; j < 11 ; j++ ){
            RowRenderData row = Rows.of(""+j, "ht_"+j, "123","债务人名称","转让方名称","98653","986987.32","12345687.99","2021-12-15").textFontSize(8).create();
            renderData.add(row);
        }
        TableRenderData tableRenderData1 = Tables.of(row0).width(14.63f, new double[] { 0.63f,2.0f,2.0f,2.0f,1.0f, 1.0f, 1.0f, 2.0f, 2.0f }).create();
        tableRenderData1.setRows(renderData);
        int t = renderData.size();
        RowRenderData row = Rows.of("发票金额合计:986589", "",  "", "","人民币（小写）:789653.21","","","","").textFontSize(8).create();
        tableRenderData1.addRow(row);
        RowRenderData row1 = Rows.of("转让应收账款合计金额: 986589", "",  "", "","人民币（小写）:1789653.21","","","","").textFontSize(8).create();
        RowRenderData row2 = Rows.of("转让应收账款合计金额: 986589", "",  "", "","人民币（大写）:壹二参","","","","").textFontSize(8).create();
        tableRenderData1.addRow(row1).addRow(row2);

        MergeCellRule rule = MergeCellRule.builder()
                .map(MergeCellRule.Grid.of(1, 1), MergeCellRule.Grid.of(t-1, 1))
                .map(MergeCellRule.Grid.of(1, 2), MergeCellRule.Grid.of(t-1, 2))
                .map(MergeCellRule.Grid.of(1, 3), MergeCellRule.Grid.of(t-1, 3))
                .map(MergeCellRule.Grid.of(1, 4), MergeCellRule.Grid.of(t-1, 4))
                .map(MergeCellRule.Grid.of(t, 0), MergeCellRule.Grid.of(t, 3))
                .map(MergeCellRule.Grid.of(t, 4), MergeCellRule.Grid.of(t, 8))
                .map(MergeCellRule.Grid.of(t+1, 0), MergeCellRule.Grid.of(t+2, 3))
                .map(MergeCellRule.Grid.of(t+1, 4), MergeCellRule.Grid.of(t+1, 8))
                .map(MergeCellRule.Grid.of(t+2, 4), MergeCellRule.Grid.of(t+2, 8))
                .build();
        tableRenderData1.setMergeRule(rule);
        datas.put("table1", tableRenderData1);
        datas.put("churangfang", "20211115Test");
        datas.put("jiezhoufang", "Test Recv");
        datas.put("biaohao", "T_202111150006");



        Configure config = Configure.builder().bind("table1", new TableRenderPolicy()).build();
        XWPFTemplate compile = XWPFTemplate.compile(resource, config);
        XWPFTemplate render = compile.render(datas);
        render.writeAndClose(new FileOutputStream(out));


        ToPDf toPDf = new ToPDf();
        toPDf.word2pdf(out,target);

    }
}
