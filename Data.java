package org.example.test5;

import java.util.List;

public class Data {

    private String churangfang;
    private String jiezhoufang;
    private String biaohao;

    private List<Piao> piao;
    private String fapiaoheji;
    private String yishouheji;
    private String yishouhejiDa;

    public String getChurangfang() {
        return churangfang;
    }

    public void setChurangfang(String churangfang) {
        this.churangfang = churangfang;
    }

    public String getJiezhoufang() {
        return jiezhoufang;
    }

    public void setJiezhoufang(String jiezhoufang) {
        this.jiezhoufang = jiezhoufang;
    }

    public String getBiaohao() {
        return biaohao;
    }

    public void setBiaohao(String biaohao) {
        this.biaohao = biaohao;
    }

    public List<Piao> getPiao() {
        return piao;
    }

    public void setPiao(List<Piao> piao) {
        this.piao = piao;
    }

    public String getFapiaoheji() {
        return fapiaoheji;
    }

    public void setFapiaoheji(String fapiaoheji) {
        this.fapiaoheji = fapiaoheji;
    }

    public String getYishouheji() {
        return yishouheji;
    }

    public void setYishouheji(String yishouheji) {
        this.yishouheji = yishouheji;
    }

    public String getYishouhejiDa() {
        return yishouhejiDa;
    }

    public void setYishouhejiDa(String yishouhejiDa) {
        this.yishouhejiDa = yishouhejiDa;
    }
}

class Piao{
    private String xuhao;
    private String hetonghao;
    private String bianhao;
    private String zainame;
    private String zname;
    private String fphao;
    private String fpamt;
    private String yinamt;
    private String daoqiri;

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

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getZainame() {
        return zainame;
    }

    public void setZainame(String zainame) {
        this.zainame = zainame;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getFphao() {
        return fphao;
    }

    public void setFphao(String fphao) {
        this.fphao = fphao;
    }

    public String getFpamt() {
        return fpamt;
    }

    public void setFpamt(String fpamt) {
        this.fpamt = fpamt;
    }

    public String getYinamt() {
        return yinamt;
    }

    public void setYinamt(String yinamt) {
        this.yinamt = yinamt;
    }

    public String getDaoqiri() {
        return daoqiri;
    }

    public void setDaoqiri(String daoqiri) {
        this.daoqiri = daoqiri;
    }
}
