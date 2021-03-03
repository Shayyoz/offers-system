package com.shayyoz.offersystem.model.domain;

public enum FlowType {
    MULTI_CHANNEL("MultiChannel"),
    BUSINESS("Business"),
    IMMEDIATE("Immediate");


    private String value;
    FlowType(String value){ this.value = value;}

    @Override
    public String toString(){ return String.valueOf(this.value);}

    public static FlowType fromValue(String value){
        for(FlowType s : FlowType.values()){
            if(s.value.equals(value)){
                return s;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" +  value + "'");
    }
}
