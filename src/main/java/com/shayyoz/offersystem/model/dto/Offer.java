package com.shayyoz.offersystem.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shayyoz.offersystem.model.domain.OfferState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Offer {
    @JsonProperty("id")
    private String id;
    private OfferState state;
}
