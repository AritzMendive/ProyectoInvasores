package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.image.Image;
import java.util.List;

import static com.aetxabao.invasoresfx.game.EnemySpawner.vy;

public class EnemigoConBarrera extends EnemyShip {

    public EnemigoConBarrera(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
    }


    @Override
    public void update() {
        if (x > gameRect.right - width - xSpeed || x + xSpeed < gameRect.left) {
            xSpeed = -xSpeed;
            y += vy;
            vy = -vy;
        }
        x += xSpeed;
    }
}