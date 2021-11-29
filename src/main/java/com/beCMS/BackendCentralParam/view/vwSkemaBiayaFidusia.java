package com.beCMS.BackendCentralParam.view;

import java.util.Date;

public class vwSkemaBiayaFidusia {
  
    private Integer id;
    private String namaSkema;
    

    public vwSkemaBiayaFidusia(Integer id, String namaSkema) {
        this.id = id;
        this.namaSkema = namaSkema;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

}