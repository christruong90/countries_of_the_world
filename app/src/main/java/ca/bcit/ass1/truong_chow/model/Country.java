package ca.bcit.ass1.truong_chow.model;

import java.io.Serializable;
import java.util.List;

public class Country implements Serializable {

    private String name;

    private List<String> topLevelDomain;

    private String alpha2Code;

    private String alpha3Code;

    private List<String> callingCodes;

    private String capital;

    private List<String> altSpellings;

    private String region;

    private String subregion;

    private int population;

    private List<Double> latlng;

    private String demonym;

    private double area;

    private String gini;

    private List<String> timezones;

    private List<String> borders;

    private String nativeName;

    private String numericCode;

    private List<Currencies> currencies;

    private List<Languages> languages;

    private Translations translations;

    private String flag;

    private List<RegionalBlocs> regionalBlocs;

    private String cioc;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setTopLevelDomain(List<String> topLevelDomain){
        this.topLevelDomain = topLevelDomain;
    }
    public List<String> getTopLevelDomain(){
        return this.topLevelDomain;
    }
    public void setAlpha2Code(String alpha2Code){
        this.alpha2Code = alpha2Code;
    }
    public String getAlpha2Code(){
        return this.alpha2Code;
    }
    public void setAlpha3Code(String alpha3Code){
        this.alpha3Code = alpha3Code;
    }
    public String getAlpha3Code(){
        return this.alpha3Code;
    }
    public void setCallingCodes(List<String> callingCodes){
        this.callingCodes = callingCodes;
    }
    public List<String> getCallingCodes(){
        return this.callingCodes;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public String getCapital(){
        return this.capital;
    }
    public void setAltSpellings(List<String> altSpellings){
        this.altSpellings = altSpellings;
    }
    public List<String> getAltSpellings(){
        return this.altSpellings;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public String getRegion(){
        return this.region;
    }
    public void setSubregion(String subregion){
        this.subregion = subregion;
    }
    public String getSubregion(){
        return this.subregion;
    }
    public void setPopulation(int population){
        this.population = population;
    }
    public int getPopulation(){
        return this.population;
    }
    public void setLatlng(List<Double> latlng){
        this.latlng = latlng;
    }
    public List<Double> getLatlng(){
        return this.latlng;
    }
    public void setDemonym(String demonym){
        this.demonym = demonym;
    }
    public String getDemonym(){
        return this.demonym;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return this.area;
    }
    public void setGini(String gini){
        this.gini = gini;
    }
    public String getGini(){
        return this.gini;
    }
    public void setTimezones(List<String> timezones){
        this.timezones = timezones;
    }
    public List<String> getTimezones(){
        return this.timezones;
    }
    public void setBorders(List<String> borders){
        this.borders = borders;
    }
    public List<String> getBorders(){
        return this.borders;
    }
    public void setNativeName(String nativeName){
        this.nativeName = nativeName;
    }
    public String getNativeName(){
        return this.nativeName;
    }
    public void setNumericCode(String numericCode){
        this.numericCode = numericCode;
    }
    public String getNumericCode(){
        return this.numericCode;
    }
    public void setCurrencies(List<Currencies> currencies){
        this.currencies = currencies;
    }
    public List<Currencies> getCurrencies(){
        return this.currencies;
    }
    public void setLanguages(List<Languages> languages){
        this.languages = languages;
    }
    public List<Languages> getLanguages(){
        return this.languages;
    }
    public void setTranslations(Translations translations){
        this.translations = translations;
    }
    public Translations getTranslations(){
        return this.translations;
    }
    public void setFlag(String flag){
        this.flag = flag;
    }
    public String getFlag(){
        return this.flag;
    }
    public void setRegionalBlocs(List<RegionalBlocs> regionalBlocs){
        this.regionalBlocs = regionalBlocs;
    }
    public List<RegionalBlocs> getRegionalBlocs(){
        return this.regionalBlocs;
    }
    public void setCioc(String cioc){
        this.cioc = cioc;
    }
    public String getCioc(){
        return this.cioc;
    }
}
