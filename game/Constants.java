package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

public final class Constants {

    public Constants() {
    }

    public static final String GAME_NAME = "TBD";

    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_HEIGHT = 800;

    public static final int SCORE_TEXT_X_BOUNDS = 600;
    public static final int SCORE_TEXT_Y_BOUNDS = 80;

    public static final int TILE_X_OFFSET = 15;
    public static final int TILE_Y_OFFSET = 80;
    public static final int TILE_PADDING = 5;
    public static final int TILE_SIZE = 100;
    public static final int TILE_BORDER_RADIUS = 30;

    public static final Color HIGHLIGHT_COLOR_PASS = new Color(165, 232, 221, 100);
    public static final Color HIGHLIGHT_COLOR_FAIL = new Color(204, 123, 110, 100);
    public static final Color HIGHLIGHT_ADJACENT_COLOR_1 = new Color(123, 130, 209, 100);

    public static final int POINT_X_OFFSET = -10;
    public static final int POINT_Y_OFFSET = -31;

    public static final int ACTIVE_HORIZONTAL_PIECE_Y = 670;
    public static final int ACTIVE_VERTICAL_PIECE_Y = 645;
    
    public static final Dimension FRAME_DIMENSIONS = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
    public static final Rectangle SCORE_TEXT_RECT = new Rectangle(SCORE_TEXT_X_BOUNDS, SCORE_TEXT_Y_BOUNDS);

}
