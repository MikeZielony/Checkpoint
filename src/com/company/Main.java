package com.company;

public class Main {

    public static void main(String[] args) {
	Tool hammer = new Hammer("hammer", "Metal");
	Tool drill = new Drill("drill", "Plastic");
	Tool brush = new Brush("brush", "hair");
	Sound sound = new Sound();
	MadeOf madeOf = new MadeOf("Wood");
	MadeOf madeOf1 = new MadeOf("concrete");
	MadeOf madeOf2 = new MadeOf("wall");
	MadeOf madeOf3 = new MadeOf("car");
	MadeOf madeOf4 = new MadeOf("metal");





        hammer.printSound(madeOf);
        hammer.printSound(madeOf1);
        hammer.printSound(madeOf2);

        drill.printSound(madeOf);
        drill.printSound(madeOf2);

        brush.printSound(madeOf3);
        brush.printSound(madeOf4);

        hammer.printEmit(hammer);
        hammer.printEmit(drill);
        hammer.printEmit(brush);

        sound.printEmit(hammer);
        sound.printEmit(drill);
        sound.printEmit(brush);





    }
}
