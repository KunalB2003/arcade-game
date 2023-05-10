package game;

import java.awt.Dimension;
import java.awt.Rectangle;

public final class Constants {

    public Constants() {
    }

    public static final String GAME_NAME = "TBD Game Name";

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 800;

    private static final int SCORE_TEXT_X_BOUNDS = 600;
    private static final int SCORE_TEXT_Y_BOUNDS = 80;

    public static final int TILE_X_OFFSET = 15;
    public static final int TILE_Y_OFFSET = 80;
    public static final int TILE_PADDING = 5;
    public static final int TILE_SIZE = 100;
    public static final int TILE_BORDER_RADIUS = 30;






    
    public static final Dimension FRAME_DIMENSIONS = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
    public static final Rectangle SCORE_TEXT_RECT = new Rectangle(SCORE_TEXT_X_BOUNDS, SCORE_TEXT_Y_BOUNDS);

}
