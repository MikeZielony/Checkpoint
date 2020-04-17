package com.company;

public class Main {

    public static void main(String[] args) {
	Tool hammer = new Hammer("Wood", "Metal");
	Tool drill = new Drill("Metal", "Plastic");
	MadeOf madeOf = new MadeOf("Wood");
	MadeOf madeOf1 = new MadeOf("concrete");
	MadeOf madeOf2 = new MadeOf("wall");

        System.out.println(hammer.emits());


        hammer.printSound(madeOf);
        hammer.printSound(madeOf1);
        hammer.printSound(madeOf2);

        drill.printSound(madeOf);
        drill.printSound(madeOf2);
        drill.printEmit(drill);




    }
}
