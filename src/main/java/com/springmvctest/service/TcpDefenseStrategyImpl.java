package com.springmvctest.service;

import com.springmvctest.pojo.DefenseCommand;
import com.springmvctest.pojo.DefenseStrategy;
import com.springmvctest.pojo.TcpDefenseStrategy;

import java.util.ArrayList;
import java.util.List;

public class TcpDefenseStrategyImpl implements DefenseStrategyService {
    private DefenseStrategy strategy;

    private List<DefenseCommand> commandsToDeploy = new ArrayList<>();

    public TcpDefenseStrategyImpl(TcpDefenseStrategy strategy){
        this.strategy = strategy;
    }

    @Override
    public String deploy() {
        for(final DefenseCommand command: commandsToDeploy){

        }

        return null;
    }

    @Override
    public String translate() {
        return null;
    }
}
