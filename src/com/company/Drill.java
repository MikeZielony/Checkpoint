package com.company;

public class Drill extends Tool  {
    String material1 = "Wood";
    String material2 = "wall";
    String message1 ="Furniture stapler";
    String message2 ="Picture hanger";

    public Drill(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }




    @Override
    public String emits(Tool tool) {
        return null;
    }


    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf, material1, material2,message1, message2));


    }



    @Override
    public void printEmit(Tool tool) {

    }
}
