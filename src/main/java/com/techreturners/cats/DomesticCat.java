package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    public String getSetting(){
        return "domestic";
    }

    public int getAverageHeight(){
        return 23;
    }

    public String eat(){
        return "Purrrrrrr";
    }

    public String eat(boolean random){
        return "It will do I suppose";
    }
}