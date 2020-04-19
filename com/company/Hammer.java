package com.company;



public class Hammer extends Tool {
    String material1 = "Wood";
    String material2 = "concrete";
    String message1 = "Wood splitter";
    String message2 = "Rock crusher";

   public Hammer(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }

    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf, material1, material2, message1, message2));
    }

    @Override
    public void printEmit(Tool tool) {
        System.out.println(emits(tool));
    }
}