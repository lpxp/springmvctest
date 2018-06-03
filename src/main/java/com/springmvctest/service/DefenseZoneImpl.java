package com.springmvctest.service;

import com.springmvctest.pojo.DefenseStrategy;
import com.springmvctest.pojo.DefenseZone;

import java.util.ArrayList;
import java.util.List;

public class DefenseZoneImpl implements DefenseZoneService{
    private DefenseStrategyService service;

    private List<DefenseStrategy> strategyList = new ArrayList<>();
    private DefenseZone zone;
    public DefenseZoneImpl(DefenseZone zone){
        this.zone = zone;
    }

    @Override
    public String deploy(List<DefenseStrategy> strategyList) {
        String deployState = "";
        for (final DefenseStrategy strategy : strategyList) {
            service = DefenseStrategyServiceFactory.createDefenseStrategyImpl(strategy.getClass().toString());
            service.deploy();
        }

        return deployState;
    }

    @Override
    public void save() {

    }

    public void removeZone(){

    }

    public void addStrategy(DefenseStrategy strategy){
        this.strategyList.add(strategy);
    }

    public void removeStrategy(DefenseStrategy strategy){
        this.strategyList.remove(strategy);
    }
}
