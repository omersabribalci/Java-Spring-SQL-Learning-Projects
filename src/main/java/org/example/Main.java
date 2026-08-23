package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Wall wall1 = new Wall("Left");
        Wall wall2 = new Wall("Right");
        Wall wall3 = new Wall("Front");
        Wall wall4 = new Wall("Back");
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Double Bed", 4, 1, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, false, 5);
        Wardrobe wardrobe = new Wardrobe(2, 2, 20);
        Carpet carpet = new Carpet(1, 2, PaintColor.RED);
        Bedroom bedroom = new Bedroom("Omer's Bedroom", wall1, wall2, wall3, wall4, ceiling, carpet, bed, lamp, wardrobe);

        bedroom.createBedroom();
    }
}