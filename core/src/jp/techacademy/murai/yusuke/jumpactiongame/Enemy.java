package jp.techacademy.murai.yusuke.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by oamac on 2017/02/04.
 */

public class Enemy extends GameObject {
    // 横幅、高さ
    public static final float BOMB_WIDTH = 0.8f;
    public static final float BOMB_HEIGHT = 0.8f;

    // 状態
    public static final int BOMB_EXIST = 0;
    public static final int BOMB_NONE = 1;

    // タイプ（通常と動くタイプ）
    public static final int BOMB_TYPE_STATIC = 0;
    public static final int BOMB_TYPE_MOVING = 1;
    // 速度
    public static final float BOMB_VELOCITY = 2.5f;



    int mState;
    int mType;

/*    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(BOMB_WIDTH, BOMB_HEIGHT);
        mState = BOMB_EXIST;
    }*/
    public Enemy(int type, Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(BOMB_WIDTH, BOMB_HEIGHT);
        mType = type;
        if (mType == BOMB_TYPE_MOVING) {
            velocity.x = BOMB_VELOCITY;
        }
    }
    // 座標を更新する
    public void update(float deltaTime) {
        if (mType == BOMB_TYPE_MOVING) {
            setX(getX() + velocity.x * deltaTime);

            if (getX() < BOMB_WIDTH / 2) {
                velocity.x = -velocity.x;
                setX(BOMB_WIDTH / 2);
            }
            if (getX() > GameScreen.WORLD_WIDTH - BOMB_WIDTH / 2) {
                velocity.x = -velocity.x;
                setX(GameScreen.WORLD_WIDTH - BOMB_WIDTH / 2);
            }
        }

    }

    public void get() {
        mState = BOMB_NONE;
        setAlpha(0);
    }
}
