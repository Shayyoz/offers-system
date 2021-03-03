package com.shayyoz.offersystem.strategy;

public enum StartStrategyName {
    MULTI_CHANNEL_START ("MultiChannel"),
    BUSINESS("Business"),
    IMMEDIATE("Immediate"),
    NO_LEGACY_CHECK("noLegacyCheck");


    private String value;
    StartStrategyName(String value){ this.value = value;}

    @Override
    public String toString(){ return String.valueOf(this.value);}

    public static StartStrategyName fromValue(String value){
        for(StartStrategyName s : StartStrategyName.values()){
            if(s.value.equals(value)){
                return s;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" +  value + "'");
    }

}
