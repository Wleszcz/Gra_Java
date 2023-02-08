package wiktor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JPanel  implements ActionListener {


    int width;
    int height;
    int frameRate;

    Point mouse;


    Timer timer;

    public Window (int width,int height){
        this.width = width;
        this.height = height;
        updateMouseInfo();

        setSize(width, height);

        setFramerate(60);
        timer = new Timer(1000/frameRate, this);
        timer.start();

        setBackground(Color.BLACK);
        setLayout(null);
        setFocusable(true);
        setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        updateMouseInfo();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    private void setFramerate(int Rate) {
        frameRate=Rate;
    }

    private void updateMouseInfo() {
        mouse= MouseInfo.getPointerInfo().getLocation();
    }
}
