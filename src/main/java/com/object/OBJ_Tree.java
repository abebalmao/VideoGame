package com.object;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.tile.Tile;

public class OBJ_Tree extends SuperObject {

    public OBJ_Tree(Tile tile) {
        myTile = tile;

        // DESCRIPTIVE VARIABLES
        name = "Tree1";
        contextMenuInteractionString = "Chop down";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/object/Tree1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        isInteractable = true;
        hasCollision = true;
    }

    @Override
    public String toString() {
        return name;
    }
}
