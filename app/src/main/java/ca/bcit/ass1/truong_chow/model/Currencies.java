package ca.bcit.ass1.truong_chow.model;

import java.io.Serializable;

public class Currencies implements Serializable {

    private String code;

    private String name;

    private String symbol;

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public String getSymbol(){
        return this.symbol;
    }
}
