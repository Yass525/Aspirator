package com.main.entities;

import java.util.Objects;

public class Room {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean positives(int x, int y){
        return (x > 0 && y > 0);
    }
}
