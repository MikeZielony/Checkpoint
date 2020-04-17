package com.company;

public class Main {

    public static void main(String[] args) {
	Tool hammer = new Hammer("Wood", "Metal");
	MadeOf madeOf = new MadeOf("Wood");
	MadeOf madeOf1 = new MadeOf("concrete");
	MadeOf madeOf2 = new MadeOf("ete");

        System.out.println(hammer.emits());


        hammer.printSound(madeOf);
        hammer.printSound(madeOf1);
        hammer.printSound(madeOf2);

    }
}
