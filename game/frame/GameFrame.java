package game.frame;

import static game.Constants.FRAME_DIMENSIONS;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements MouseListener, MouseMotionListener, MouseWheelListener {
    
    private GraphicsComponent gc;
    private MouseEvent lastMouseEvent;

    public GameFrame(String title) {
        super(title);
        setSize(FRAME_DIMENSIONS);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
        addGraphicsComponent();
        lastMouseEvent = null;
    }

    private void addGraphicsComponent() {
        gc = new GraphicsComponent();
        add(gc);
        gc.setSize(FRAME_DIMENSIONS);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        lastMouseEvent = e;
        gc.highlightTiles(e);
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        gc.rotation += e.getWheelRotation();
        if (gc.rotation == -1) {
            gc.rotation = 3;
        }
        gc.rotation %= 4;
        mouseMoved(lastMouseEvent);
    }

}
