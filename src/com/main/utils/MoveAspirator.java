package com.main.utils;

import com.main.entities.Aspirator;
import com.main.entities.Instructions;
import com.main.entities.Orientation;
import com.main.entities.Room;

public class MoveAspirator {

    //function to make the aspirator move depending on the instructions given by the user and
    //making sure that the aspirator does not go beyond the room
    public void moveAspirator(Room r,Aspirator a, Instructions ins){
        String instructions = ins.getInstructions();
        if(instructions != null){
            for (int i = 0; i < instructions.length(); i++) {
                String orientation = a.getOrientation().toString();

                if (instructions.charAt(i) == 'D') {

                    if (orientation.equals("N")) {
                        orientation = "E";
                    } else if (orientation.equals("E")) {
                        orientation = "S";
                    } else if (orientation.equals("S")) {
                        orientation = "W";
                    } else if (orientation.equals("W")) {
                        orientation = "N";
                    }

                } else if (instructions.charAt(i) == 'G') {
                    if (orientation.equals("N")) {
                        orientation = "W";
                    } else if (orientation.equals("W")) {
                        orientation = "S";
                    } else if (orientation.equals("S")) {
                        orientation = "E";
                    } else if (orientation.equals("E")) {
                        orientation = "N";
                    }

                } else if (instructions.charAt(i) == 'A') {
                    int x = r.getX();
                    int y = r.getY();
                    int x1 = a.getX();
                    int y1 = a.getY();
                    if (orientation.equals("N")) {
                        if (y1 < y) {
                            y1++;
                        }
                    } else if (orientation.equals("E")) {
                        if (x1 < x) {
                            x1++;
                        }
                    } else if (orientation.equals("S")) {
                        if (y1 > 0) {
                            y1--;
                        }
                    } else if (orientation.equals("W")) {
                        if (x1 > 0) {
                            x1--;
                        }
                    }
                }
                a.setOrientation(Orientation.valueOf(orientation));
            }

        }

        System.out.println("La position finale de l'aspirateur est : x = " + a.getX() + " y = " + a.getY() + " orientation = " + a.getOrientation());

    }

}
