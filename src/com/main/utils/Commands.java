package com.main.utils;

import com.main.entities.Aspirator;
import com.main.entities.Instructions;
import com.main.entities.Orientation;
import com.main.entities.Room;

import java.util.Scanner;

public class Commands {

    Scanner sc = new Scanner(System.in);

    //Here we handle the Dimension of the room
    public void roomInputs(Room r) {
        do {
            System.out.println("Entrer la taille de la pièce ( x puis y): avec x,y>0 ");
            r.setX(sc.nextInt());
            r.setY(sc.nextInt());
        } while (!r.positives(r.getX(), r.getY()));
    }

    //Here we handle the initial position of the aspirator while making sure the user does not pick a position outside the room
    //Also we verify a valid orientation
    public void AspiratorInputs(Aspirator a, Room r) {
        do {
            System.out.println("Entrer la position de l'aspirateur (x puis y): avec x,y>0 ");
            a.setX(sc.nextInt());
            a.setY(sc.nextInt());
        } while (a.getX() < 0 || a.getY() < 0 || a.getX() > r.getX() || a.getY() > r.getY());

        String o = "";
        do {
            System.out.println("Entrer l'orientation de l'aspirateur :(N, E, W, S) ");
            o = sc.next();
        } while (!o.matches("[NEWS]"));

        a.setOrientation(Orientation.valueOf(o));
    }

    //Here we handle the instructions that the user enter to move the aspirator , we make sure  that the user enters the correct pattern
    public void InstructionsInput(Instructions ins){
        do {
            System.out.println("Entrer les instructions de l'aspirateur :(A:Avancé, D:Rotation à droite, G:Rotation à gauche ");
            ins.setInstructions(sc.next());
        } while (!ins.getInstructions().matches("[ADG]+"));
    }

}
