package game.frame;

import static game.Constants.*;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    public GameFrame(String title) {
        super(title);
        setSize(FRAME_DIMENSIONS);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
