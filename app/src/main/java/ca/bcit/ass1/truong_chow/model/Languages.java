package ca.bcit.ass1.truong_chow.model;

import java.io.Serializable;

public class Languages implements Serializable {

    private String iso639_1;

    private String iso639_2;

    private String name;

    private String nativeName;

    public void setIso639_1(String iso639_1){
        this.iso639_1 = iso639_1;
    }
    public String getIso639_1(){
        return this.iso639_1;
    }
    public void setIso639_2(String iso639_2){
        this.iso639_2 = iso639_2;
    }
    public String getIso639_2(){
        return this.iso639_2;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setNativeName(String nativeName){
        this.nativeName = nativeName;
    }
    public String getNativeName(){
        return this.nativeName;
    }
}
