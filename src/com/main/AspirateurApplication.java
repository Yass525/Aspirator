package com.main;

import com.main.entities.Aspirator;
import com.main.entities.Instructions;
import com.main.entities.Room;
import com.main.utils.Commands;
import com.main.utils.MoveAspirator;

public class AspirateurApplication {

    public static void main(String[] args) {

        //instantiate our entities
        Room r = new Room();
        Aspirator a = new Aspirator();
        Instructions ins = new Instructions();

        //instantiate our utils

        //Commands is where all the inputs are handled
        Commands commands = new Commands();
        //MoveAspirator is the main function that will make the aspirator move
        MoveAspirator moveAspirator = new MoveAspirator();

        //calling our functions to handle the inputs
        commands.roomInputs(r);
        commands.AspiratorInputs(a,r);
        commands.InstructionsInput(ins);

        //Calling the moveAspirator function
        moveAspirator.moveAspirator(r,a,ins);

    }
}
