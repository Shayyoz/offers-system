package com.shayyoz.offersystem.service;


import com.shayyoz.offersystem.model.domain.FlowType;
import com.shayyoz.offersystem.model.dto.StartRequest;
import com.shayyoz.offersystem.model.dto.StartResponse;

public interface StartService {
    StartResponse start(FlowType flowType, StartRequest request);
}
