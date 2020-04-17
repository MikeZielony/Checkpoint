package com.company;

public class Brush extends Tool {
    public Brush(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }

    @Override
    public String makeSound(MadeOf madeOf) {
        if (madeOf.getMaterial().equals("car")) {
            return "What the hell you are doing";
        } else if (madeOf.getMaterial().equals("metal")){
            return "Paint job";
        }else{
            return "Silence";
        }
    }

    @Override
    public String emits() {
        return "Slosh, slosh...";
    }

    @Override
    public void printEmit(Tool tool) {

    }

    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf));

    }
}
