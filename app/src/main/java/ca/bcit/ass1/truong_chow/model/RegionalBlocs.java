package ca.bcit.ass1.truong_chow.model;

import java.io.Serializable;
import java.util.List;

public class RegionalBlocs implements Serializable {

    private String acronym;

    private String name;

    private List<String> otherAcronyms;

    private List<String> otherNames;

    public void setAcronym(String acronym){
        this.acronym = acronym;
    }
    public String getAcronym(){
        return this.acronym;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setOtherAcronyms(List<String> otherAcronyms){
        this.otherAcronyms = otherAcronyms;
    }
    public List<String> getOtherAcronyms(){
        return this.otherAcronyms;
    }
    public void setOtherNames(List<String> otherNames){
        this.otherNames = otherNames;
    }
    public List<String> getOtherNames(){
        return this.otherNames;
    }
}
