package com.company;

public class Drill extends Tool  {
    String material1 = "Wood";
    String material2 = "wall";

    public Drill(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }



    @Override
    public String makeSound(MadeOf madeOf, String material1, String material2) {
        if (madeOf.getMaterial().equals(material1)) {
            return "Furniture stapler";
        } else if (madeOf.getMaterial().equals(material2)){
            return "Picture hanger";
        }else{
            return "Silence";
        }
    }

    @Override
    public String emits(Tool tool) {
        return null;
    }


    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf, material1, material2));


    }



    @Override
    public void printEmit(Tool tool) {

    }
}
