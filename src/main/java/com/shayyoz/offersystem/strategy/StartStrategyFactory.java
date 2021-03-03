package com.shayyoz.offersystem.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StartStrategyFactory {
    private Map<StartStrategyName, StartStrategy> startStrategies;

    @Autowired
    public StartStrategyFactory(Set<StartStrategy> strategySet) {
        createStrategy(strategySet);
    }

    public StartStrategy findStrategy(StartStrategyName strategyName) {
        return startStrategies.get(strategyName);
    }
    private void createStrategy(Set<StartStrategy> strategySet) {
        startStrategies = new HashMap<StartStrategyName, StartStrategy>();
        strategySet.forEach(
                strategy -> startStrategies.put(strategy.getStrategyName(), strategy));
    }
}
