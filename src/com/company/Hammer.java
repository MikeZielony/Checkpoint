package com.company;



public class Hammer extends Tool {

    public Hammer(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }

    @Override
    public String makeSound(MadeOf madeOf) {
        if (madeOf.getMaterial().equals("Wood")) {
            return "Wood splitter";
        } else if (madeOf.getMaterial().equals("concrete")){
            return "Rock crusher";
        }else{
            return "Silence";
        }
    }

    @Override
    public String emits() {
        return "Bang";
    }

    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf));


    }
}