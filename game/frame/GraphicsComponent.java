package game.frame;

import static game.Constants.FRAME_DIMENSIONS;
import static game.Constants.HIGHLIGHT_COLOR;
import static game.Constants.POINT_X_OFFSET;
import static game.Constants.POINT_Y_OFFSET;
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
import javax.swing.Timer;

public class GraphicsComponent extends JComponent {

    private int[][] gameGrid;
    private Point highlightedTile;

    public GraphicsComponent() {
        super();
        initializeGameGrid();
        new Timer(1, (e) -> repaint()).start();
        highlightedTile = new Point(10, 10);
    }

    public void paintComponent(Graphics g0) {
        super.paintComponent(g0);
        Graphics2D g = (Graphics2D) g0;
        g.clearRect(0, 0, (int) FRAME_DIMENSIONS.getWidth(), (int) FRAME_DIMENSIONS.getHeight());
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
        g.setColor(HIGHLIGHT_COLOR);
        g.fillRoundRect(highlightedTile.x * (TILE_PADDING * 2 + TILE_SIZE) + TILE_PADDING + TILE_X_OFFSET,
                highlightedTile.y * (TILE_PADDING * 2 + TILE_SIZE) + TILE_PADDING + TILE_Y_OFFSET, TILE_SIZE,
                TILE_SIZE, TILE_BORDER_RADIUS, TILE_BORDER_RADIUS);
    }

    private void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
        FontMetrics metrics = g.getFontMetrics(font);
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        g.setFont(font);
        g.drawString(text, x, y);
    }

    public boolean highlightTiles(MouseEvent e) {
        Point mousePos = new Point(e.getPoint().x + POINT_X_OFFSET, e.getPoint().y + POINT_Y_OFFSET);
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[i].length; j++) {
                int x1 = i * (TILE_PADDING * 2 + TILE_SIZE) + TILE_PADDING + TILE_X_OFFSET;
                int x2 = x1 + TILE_SIZE;
                int y1 = j * (TILE_PADDING * 2 + TILE_SIZE) + TILE_PADDING + TILE_Y_OFFSET;
                int y2 = y1 + TILE_SIZE;
                if (mousePos.x > x1 && mousePos.x < x2 && mousePos.y > y1 && mousePos.y < y2) {
                    highlightedTile = new Point(i, j);
                    return true;
                }
            }
        }
        highlightedTile = new Point(10, 10);
        return false;
    }

}
