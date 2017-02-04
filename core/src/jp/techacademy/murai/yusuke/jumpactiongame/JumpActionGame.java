package jp.techacademy.murai.yusuke.jumpactiongame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpActionGame extends Game {


	// publicにして外からアクセスできるようにする
	public SpriteBatch batch;
	public ActivityRequestHandler mRequestHandler;
	public Sound jump1_sound;
	public Sound jump2_sound;
	public Sound bomb_sound;
	public Sound goal_sound;
	public Sound star_sound;
	public Sound gameover_sound;






	public JumpActionGame(ActivityRequestHandler requestHandler) {
		super();
		mRequestHandler = requestHandler;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();

		// GameScreenを表示する
		setScreen(new GameScreen(this));

		jump1_sound = Gdx.audio.newSound(Gdx.files.internal("se_jump_long.mp3"));
		jump2_sound = Gdx.audio.newSound(Gdx.files.internal("jump04.mp3"));
		bomb_sound = Gdx.audio.newSound(Gdx.files.internal("bomb_s.mp3"));
		goal_sound = Gdx.audio.newSound(Gdx.files.internal("Goal.mp3"));
		star_sound = Gdx.audio.newSound(Gdx.files.internal("star.mp3"));
		gameover_sound = Gdx.audio.newSound(Gdx.files.internal("Gameover1.mp3"));

	}



	/*	SpriteBatch batch;
	Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}*/

}
