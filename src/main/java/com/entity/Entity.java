package com.entity;

import java.awt.image.BufferedImage;

import com.tile.Tile;

public class Entity {

    public int worldX, worldY;
    public int speed;

    Tile myTile;
    EntityType myType;

    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    public String direction;

    public Tile getMyTile() {
        return myTile;
    }

    public boolean isOfType(EntityType otherType) {
        if (myType == otherType) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
