package com.company;



public class Hammer extends Tool {
    String material1 = "Wood";
   String material2 = "concrete";


    public Hammer(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }

    @Override
    public String makeSound(MadeOf madeOf, String material1, String material2) {
        if (madeOf.getMaterial().equals(material1)) {
            return "Wood splitter";
        } else if (madeOf.getMaterial().equals(material2)){
            return "Rock crusher";
        }else{
            return "Silence";
        }
    }



    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf, material1, material2));
    }



    @Override
    public void printEmit(Tool tool) {
        System.out.println(emits(tool));
    }
}