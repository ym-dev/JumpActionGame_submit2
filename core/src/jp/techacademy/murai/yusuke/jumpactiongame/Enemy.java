package jp.techacademy.murai.yusuke.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by oamac on 2017/02/04.
 */

public class Enemy extends Sprite {
    // 横幅、高さ
    public static final float BOMB_WIDTH = 0.8f;
    public static final float BOMB_HEIGHT = 0.8f;

    // 状態
    public static final int BOMB_EXIST = 0;
    public static final int BOMB_NONE = 1;

    int mState;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(BOMB_WIDTH, BOMB_HEIGHT);
        mState = BOMB_EXIST;
    }

    public void get() {
        mState = BOMB_NONE;
        setAlpha(0);
    }
}
