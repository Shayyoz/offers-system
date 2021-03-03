package com.shayyoz.offersystem.service.impl;

import com.shayyoz.offersystem.model.domain.FlowType;
import com.shayyoz.offersystem.model.dto.StartRequest;
import com.shayyoz.offersystem.model.dto.StartResponse;
import com.shayyoz.offersystem.service.StartService;
import com.shayyoz.offersystem.strategy.StartStrategyFactory;
import com.shayyoz.offersystem.strategy.StartStrategyName;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StartServiceImpl implements StartService {
    @Autowired
    private StartStrategyFactory strategyFactory;

    private static final Map<FlowType, StartStrategyName> flowsAdaptor = new HashMap<>();
    static {
        flowsAdaptor.put(FlowType.BUSINESS, StartStrategyName.IMMEDIATE);
        flowsAdaptor.put(FlowType.IMMEDIATE, StartStrategyName.IMMEDIATE);
        flowsAdaptor.put(FlowType.MULTI_CHANNEL, StartStrategyName.NO_LEGACY_CHECK);
    }

    @Override
    public StartResponse start(FlowType flowType, StartRequest request) {
        return strategyFactory.findStrategy(flowsAdaptor.get(flowType)).start(request);
    }
}
