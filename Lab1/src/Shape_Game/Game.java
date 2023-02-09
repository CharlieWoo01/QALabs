package Shape_Game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {

    public static Shape shape;

    ArrayList<Shape> Shape = new ArrayList<Shape>(3);

    public static void main(String args[]) {
        Game game = new Game();
    }
    Game() {
        JFrame frame = new JFrame();
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        Shape.add(new Shape(10, 20, 30, 40, SHAPE_TYPE.OVAL));
        Shape.add(new Shape(50, 60, 70, 80, SHAPE_TYPE.RECTANGLE));
        Shape.add(new Shape(100, 200, 150, 250, SHAPE_TYPE.THREEDRECTANGLE));

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
        for (int i = 0; i < Shape.size(); i++) {
//            b[i].move();
            Shape.get(i).move();
        }
        this.repaint();

    }

    public void paint(Graphics g) {
        g.fillRect(0, 0, 300, 300);
        for (int i = 0; i < Shape.size(); i++) {

            if(Shape.get(i).getChapeType() == SHAPE_TYPE.RECTANGLE) {
                g.fillRect(Shape.get(i).x, Shape.get(i).y, Shape.get(i).w, Shape.get(i).h);
            }
            else if(Shape.get(i).getChapeType() == SHAPE_TYPE.ROUNDRECTANGLE) {
                g.fill3DRect(Shape.get(i).x, Shape.get(i).y, Shape.get(i).w, Shape.get(i).h, true);
            }
            else if(Shape.get(i).getChapeType() == SHAPE_TYPE.ROUNDRECTANGLE) {
                g.fillRect(Shape.get(i).x, Shape.get(i).y, Shape.get(i).w, Shape.get(i).h);
            }
            else if(Shape.get(i).getChapeType() == SHAPE_TYPE.OVAL) {
                g.fillOval(Shape.get(i).x, Shape.get(i).y, Shape.get(i).w, Shape.get(i).h);
            }
            else if(Shape.get(i).getChapeType() == SHAPE_TYPE.ARC) {
                g.fillArc(Shape.get(i).x, Shape.get(i).y, Shape.get(i).w, Shape.get(i).h, 0, 0);
            }
            else {
                g.fillOval(Shape.get(i).x, Shape.get(i).y, Shape.get(i).w, Shape.get(i).h);
            }

            g.setColor(Color.red);
            g.fillOval(Shape.get(i).x, Shape.get(i).y, Shape.get(i).w, Shape.get(i).h);

        }
    }
}
