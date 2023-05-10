package game.frame;

import static game.Constants.SCORE_TEXT_RECT;
import static game.Constants.TILE_BORDER_RADIUS;
import static game.Constants.TILE_PADDING;
import static game.Constants.TILE_SIZE;
import static game.Constants.TILE_X_OFFSET;
import static game.Constants.TILE_Y_OFFSET;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;

public class GraphicsComponent extends JComponent {

    private int[][] gameGrid;
    private Point highlighedTile;

    public GraphicsComponent() {
        super();
        initializeGameGrid();
    }

    public void paintComponent(Graphics g0) {
        super.paintComponent(g0);
        Graphics2D g = (Graphics2D) g0;

        // Score
        drawScore(g);

        // Grid
        drawGrid(g);

        // Highlight
        drawHighlight(g);

        // Active Piece
        // New Game
        // ?
    }

    private void initializeGameGrid() {
        gameGrid = new int[5][5];
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[i].length; j++) {
                gameGrid[i][j] = 0;
            }
        }
    }

    private void drawScore(Graphics2D g) {
        drawCenteredString(g, "Score Display", SCORE_TEXT_RECT, g.getFont());
    }

    private void drawGrid(Graphics2D g) {
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[i].length; j++) {
                g.drawRoundRect(i * (TILE_PADDING * 2 + TILE_SIZE) + TILE_PADDING + TILE_X_OFFSET,
                        j * (TILE_PADDING * 2 + TILE_SIZE) + TILE_PADDING + TILE_Y_OFFSET, TILE_SIZE,
                        TILE_SIZE, TILE_BORDER_RADIUS, TILE_BORDER_RADIUS);
            }
        }
    }

    private void drawHighlight(Graphics2D g) {

    }

    private void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
        FontMetrics metrics = g.getFontMetrics(font);
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        g.setFont(font);
        g.drawString(text, x, y);
    }

    public void highlightTiles(MouseEvent e) {
        highlighedTile = new Point((e.getX() - TILE_X_OFFSET - TILE_X_OFFSET) / TILE_X_OFFSET, 1);
        System.out.println(highlighedTile);
    }

}
