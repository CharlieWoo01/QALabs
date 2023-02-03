package lab09;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {

    public static Ball ball;

    public static Ball b[] = new Ball[3];

    public static void main(String args[]) {
        Game game = new Game();
    }
    Game() {
        JFrame frame = new JFrame();
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        b[0] = new Ball(10, 20, 30, 40);
        b[1] = new Ball(50, 60, 70, 80);
        b[2] = new Ball(100, 200, 150, 250);


        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };

        t.schedule(tt, 0, 50);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
    }

    public void draw() {
        for (int i = 0; i < b.length; i++) {
            b[i].move();
        }
        this.repaint();

    }

    public void paint(Graphics g) {
        g.fillRect(0, 0, 300, 300);
        for (int i = 0; i < b.length; i++) {
            g.setColor(Color.red);
            g.fillOval(b[i].x, b[i].y, b[i].w, b[i].h );

        }
    }
}
