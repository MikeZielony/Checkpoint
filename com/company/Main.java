package com.company;

public class Main {

    public static void main(String[] args) {

        Tool hammer = new Hammer("hammer", "Metal");
        Tool drill = new Drill("drill", "Plastic");
        Tool brush = new Brush("brush", "hair");

        Sound sound = new Sound();

        MadeOf Wood = new MadeOf("Wood");
        MadeOf concrete = new MadeOf("concrete");
        MadeOf wall = new MadeOf("wall");
        MadeOf car = new MadeOf("car");
        MadeOf metal = new MadeOf("metal");





        hammer.printSound(Wood);
        hammer.printSound(concrete);
        hammer.printSound(wall);

        drill.printSound(Wood);
        drill.printSound(wall);

        brush.printSound(car);
        brush.printSound(metal);

        sound.printEmit(hammer);
        sound.printEmit(drill);
        sound.printEmit(brush);





    }
}


