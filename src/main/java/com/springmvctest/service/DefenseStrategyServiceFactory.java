package com.springmvctest.service;

import com.springmvctest.pojo.DefenseStrategy;
import com.springmvctest.pojo.TcpDefenseStrategy;

public class DefenseStrategyServiceFactory {

    private final static String TcpDefenseStrategyClassName = TcpDefenseStrategyImpl.class.toString();
    public static DefenseStrategyService createDefenseStrategyImpl(String className){

        if (className == TcpDefenseStrategyClassName){
                return new TcpDefenseStrategyImpl();
        }else if(className == UdpDefenseStrategyImpl.class.toString())
        {
            return new UdpDefenseStrategyImpl();
        }
        else
        {
            return null;
        }
    }


}
