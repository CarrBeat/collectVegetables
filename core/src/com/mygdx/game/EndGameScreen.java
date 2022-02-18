package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class EndGameScreen implements Screen {
    final Drop game;
    OrthographicCamera camera;
    Texture background;
    int collectedVegetables;
    EndGameScreen(final Drop gam, int collectedVegetables){
        game = gam;
        this.collectedVegetables = collectedVegetables;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        if (this.collectedVegetables >= 50){
            background = new Texture("pictures/goodend.png");
        } else {
            background = new Texture("pictures/badend.png");
        }
        game.batch.draw(background, 0, 0);
        game.batch.end();
        if (Gdx.input.isTouched()) {
            game.setScreen(new MainMenuScreen(game));
            dispose();
        }

    }
    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
