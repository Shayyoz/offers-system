package com.shayyoz.offersystem.model.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OfferState {
    NONE("NONE"),
    CREATED("CREATED"),
    WAIT_FOR_APPROVAL("WAIT_FOR_APPROVAL"),
    APPROVED("APPROVED"),
    SUBMITTED("SUBMITTED");

    OfferState(String value){this.value = value;}
    private String value;
    @Override
    @JsonValue
    public String toString(){ return String.valueOf(this.value);}

}
