package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Drop;
import com.mygdx.game.GameScreen;
import com.mygdx.game.MainMenuScreen;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Kikoriki - collecting vegetables";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Drop(), config);
	}
}
