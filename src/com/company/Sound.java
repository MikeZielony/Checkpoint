package com.company;

import com.company.interfaces.PrintEmit;

public class Sound implements PrintEmit {

    public Sound() {
    }

    public String emits(Tool tool) {
        if(tool.getTypeOfTool().equals("hammer")) {
            return "Bang";
        }else if (tool.getTypeOfTool().equals("drill")) {
            return "Whirr";
        }else{
            return "Slosh, slosh...";
        }
    }

    @Override
    public void printEmit(Tool tool) {
        System.out.println(emits(tool));
    }
}

