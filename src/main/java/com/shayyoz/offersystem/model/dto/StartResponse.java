package com.shayyoz.offersystem.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StartResponse {
    private Offer offer;
}
