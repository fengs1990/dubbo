package com.fengs.dubbo.impl;

import com.fengs.dubbo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {


    public List<String> getList(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("data_%d",id-1));
        demo.add(String.format("data_%d",id));
        demo.add(String.format("data_%d",id+1));
        return demo;
    }
}
