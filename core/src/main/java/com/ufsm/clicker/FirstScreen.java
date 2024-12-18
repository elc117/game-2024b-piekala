package com.ufsm.clicker;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.audio.Sound;

public class FirstScreen implements Screen {
    private Texture background;
    private Texture buttonImage;
    private SpriteBatch batch;
    private BitmapFont font;
    private Sound clickSound;

    private float buttonX, buttonY;
    private int clickCount;

    @Override
    public void show() {
        background   = new Texture( "forest.jpg" );
        buttonImage  = new Texture( "dinosaur.png" );
        clickSound   = Gdx.audio.newSound( Gdx.files.internal( "success.mp3" ) );

        batch        = new SpriteBatch();
        font         = new BitmapFont();

        float buttonWidth  = Gdx.graphics.getWidth()  / 10f;
        float buttonHeight = Gdx.graphics.getHeight() / 10f;

        buttonX = ( Gdx.graphics.getWidth()  - buttonWidth  ) / 2f;
        buttonY = ( Gdx.graphics.getHeight() - buttonHeight ) / 2f;

        clickCount = 0;

        Gdx.input.setInputProcessor( new ClickListener() );
    }

    @Override
    public void render( float delta ) {
        Gdx.gl.glClearColor( 0, 0, 0, 1 );
        Gdx.gl.glClear( Gdx.gl.GL_COLOR_BUFFER_BIT );

        batch.begin();
        batch.draw( background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight() );

        float buttonWidth  = Gdx.graphics.getWidth()  / 10f;
        float buttonHeight = Gdx.graphics.getHeight() / 10f;
        batch.draw( buttonImage, buttonX, buttonY );

        font.draw( batch, "Clicks: " + clickCount, 20, Gdx.graphics.getHeight() - 20 );
        batch.end();
    }

    @Override
    public void resize( int width, int height ) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void dispose() {
        background.dispose();
        buttonImage.dispose();
        batch.dispose();
        font.dispose();
        clickSound.dispose();
    }

    private class ClickListener extends com.badlogic.gdx.InputAdapter {
        @Override
        public boolean touchDown( int screenX, int screenY, int pointer, int button ) {
            screenY = Gdx.graphics.getHeight() - screenY;

            if ( screenX >= buttonX && screenX <= buttonX + buttonImage.getWidth() &&
                 screenY >= buttonY && screenY <= buttonY + buttonImage.getHeight() ) {
                clickCount++;
                clickSound.play();
            }

            return true;
        }
    }
}
