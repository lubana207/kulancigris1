package com.example.lh_urundetayleri;

import android.content.Context;

import java.io.Serializable;

public class lh_girismci implements Serializable {
    private String lh_girismciismi;
    private String lh_girismcisoyisim;
    private String lh_girismcicinsiyati;
    private String lh_girissekli;
    Context context;

    public lh_girismci(Context context) {
        this.context = context;
    }

    public lh_girismci(String lh_girismciismi, String lh_girismcisoyisim, String lh_girissekli) {
        this.lh_girismciismi = lh_girismciismi;
        this.lh_girismcisoyisim = lh_girismcisoyisim;
        this.lh_girissekli = lh_girissekli;

    }

    public String getLh_girismciismi() {
        return lh_girismciismi;
    }

    public void setLh_girismciismi(String lh_girismciismi) {
        this.lh_girismciismi = lh_girismciismi;
    }

    public String getLh_girismcisoyisim() {
        return lh_girismcisoyisim;
    }

    public void setLh_girismcisoyisim(String lh_girismcisoyisim) {
        this.lh_girismcisoyisim = lh_girismcisoyisim;
    }

    public String getLh_girismcicinsiyati() {
        return lh_girismcicinsiyati;
    }

    public void setLh_girismcicinsiyati(String lh_girismcicinsiyati) {
        this.lh_girismcicinsiyati = lh_girismcicinsiyati;
    }

    public String getLh_girissekli() {
        return lh_girissekli;
    }

    public void setLh_girissekli(String lh_girissekli) {
        this.lh_girissekli = lh_girissekli;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}

