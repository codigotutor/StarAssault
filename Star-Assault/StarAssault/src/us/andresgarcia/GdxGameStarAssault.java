package us.andresgarcia;

import us.andresgarcia.starassault.screens.GameScreen;

import com.badlogic.gdx.Game;

public class GdxGameStarAssault extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen());
	}
}
