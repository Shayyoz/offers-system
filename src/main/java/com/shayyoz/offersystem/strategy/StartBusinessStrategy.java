package com.shayyoz.offersystem.strategy;

import com.shayyoz.offersystem.model.dto.Offer;
import com.shayyoz.offersystem.model.dto.StartRequest;
import com.shayyoz.offersystem.model.dto.StartResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class StartBusinessStrategy implements StartStrategy{
    @Override
    public StartResponse start(StartRequest request) {
        return StartResponse.builder().offer(Offer.builder().id(UUID.randomUUID().toString()).build()).build();
    }

    @Override
    public StartStrategyName getStrategyName() {
        return StartStrategyName.BUSINESS;
    }
}
