package org.example.test3;

import java.util.List;

public class TableC {

    public List<Detail> getDetail() {
        return detail;
    }

    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }

    private List<Detail> detail;


}

class Detail {
    public String xuhao;
    public String hetonghao;
    public String amt;
    public String riqi;

    public String getXuhao() {
        return xuhao;
    }

    public void setXuhao(String xuhao) {
        this.xuhao = xuhao;
    }

    public String getHetonghao() {
        return hetonghao;
    }

    public void setHetonghao(String hetonghao) {
        this.hetonghao = hetonghao;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }
}