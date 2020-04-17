package com.company;

public class Drill extends Tool{
    public Drill(String typeOfTool, String madeOf) {
        super(typeOfTool, madeOf);
    }

    @Override
    public String makeSound(MadeOf madeOf) {
        if (madeOf.getMaterial().equals("Wood")) {
            return "Furniture stapler";
        } else if (madeOf.getMaterial().equals("wall")){
            return "Picture hanger";
        }else{
            return "Silence";
        }
    }

    @Override
    public String emits() {
        return "Whirr";
    }

    @Override
    public void printSound(MadeOf madeOf) {
        System.out.println(makeSound(madeOf));

    }

    @Override
    public void printEmit(Tool tool) {
        System.out.println(emits());
    }
}
