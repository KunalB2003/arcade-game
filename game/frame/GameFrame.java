package game.frame;

import static game.Constants.FRAME_DIMENSIONS;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    private GraphicsComponent gc;

    public GameFrame(String title) {
        super(title);
        
        setSize(FRAME_DIMENSIONS);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addGraphicsComponent();
    }

    private void addGraphicsComponent() {
        gc = new GraphicsComponent();
        add(gc);
        gc.setSize(FRAME_DIMENSIONS);
    }

}
