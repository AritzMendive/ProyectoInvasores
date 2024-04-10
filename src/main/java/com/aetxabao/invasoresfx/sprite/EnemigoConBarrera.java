package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.sprite.weaponry.AShot;
import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

import static com.aetxabao.invasoresfx.game.EnemySpawner.vy;

public class EnemigoConBarrera extends EnemyShip{
    private int choques;

    public EnemigoConBarrera(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
        choques = 0;
    }

    @Override
    public void update() {

        if (x >= gameRect.right - width && xSpeed > 0) {
            xSpeed = -xSpeed;
            choques++;
        } else if (x <= gameRect.left && xSpeed < 0) {
            xSpeed = -xSpeed;
            choques++;
        }


        if (choques >= 2) {
            y += height;
            choques = 0;
        }
        x += xSpeed;
        updateFrame();
    }
}