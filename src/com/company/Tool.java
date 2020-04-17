package com.company;

import com.company.interfaces.PrintSound;

public abstract class Tool implements PrintSound {
    String typeOfTool = "";
    String madeOf = "";

    public Tool(String typeOfTool, String madeOf) {
        this.typeOfTool = typeOfTool;
        this.madeOf = madeOf;
    }

    public abstract String makeSound(MadeOf madeOf);
    public abstract String emits();
}