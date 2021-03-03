package com.shayyoz.offersystem.strategy;


import com.shayyoz.offersystem.model.dto.StartRequest;
import com.shayyoz.offersystem.model.dto.StartResponse;

public interface StartStrategy {
    StartResponse start(StartRequest request);
    StartStrategyName getStrategyName();
}
