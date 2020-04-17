package com.company;

public class Brush extends Tool {
    String material1 = "car";
    String material2 = "metal";
    String message1 = "What the hell You think you're doing!?";
    String message2 = "Paint job";

    public Brush(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }

    @Override
    public String makeSound(MadeOf madeOf, String material1, String material2, String message1, String message2) {
        if (madeOf.getMaterial().equals(material1)) {
            return message1;
        } else if (madeOf.getMaterial().equals(material2)){
            return message2;
        }else{
            return "Silence";
        }
    }

    @Override
    public String emits(Tool tool) {
        return "Slosh, slosh...";
    }



    @Override
    public void printEmit(Tool tool) {
        System.out.println(emits(tool));

    }

    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf, material1, material2, message1, message2));
    }

}
