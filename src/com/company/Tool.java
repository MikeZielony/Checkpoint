package com.company;

import com.company.interfaces.PrintEmit;
import com.company.interfaces.PrintSound;

public abstract class Tool implements PrintSound, PrintEmit {
    String typeOfTool = "";
    String madeOf = "";
    String material1 = "";
    String material2 = "";

    public String getTypeOfTool() {
        return typeOfTool;
    }

    public Tool(String typeOfTool, String madeOf) {
        this.typeOfTool = typeOfTool;
        this.madeOf = madeOf;
    }

    public abstract String makeSound(MadeOf madeOf, String material1,String material2);

    public String emits(Tool tool) {
        if(tool.getTypeOfTool().equals("hammer")) {
            return "Bang";
        }else if (tool.getTypeOfTool().equals("drill")) {
            return "Whirr";
        }else{
            return "Slosh, slosh...";
        }
    }


}
