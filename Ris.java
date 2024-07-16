import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;

public class Ris extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw1(g);
    }

    private void draw1(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fill3DRect(0, 0, 1000, 1000, true);
        g.setColor(Color.black);
        g.fillArc(449, 259, 103, 50, 0, 180);   //Шапка
        g.fillRoundRect(449, 279, 103, 8, 8, 8);

        int[] x = {338, 401, 401};
        int[] y = {343, 408, 343};
        g.fillPolygon(x, y, 3);
        g.fillRoundRect(336, 329, 79, 17, 17, 17);
        g.fillRoundRect(399, 329, 17, 81, 17, 17);

        int[] x1 = {338, 401, 401};
        int[] y1 = {473, 538, 473};
        g.fillPolygon(x1, y1, 3);
        g.fillRoundRect(336, 459, 79, 17, 17, 17);
        g.fillRoundRect(399, 459, 17, 81, 17, 17);

        int[] x2 = {338, 401, 401};
        int[] y2 = {603, 668, 603};
        g.fillPolygon(x2, y2, 3);
        g.fillRoundRect(336, 589, 79, 17, 17, 17);
        g.fillRoundRect(399, 589, 17, 81, 17, 17);

        int[] x3 = {664, 601, 601};
        int[] y3 = {343, 408, 343};
        g.fillPolygon(x3, y3, 3);
        g.fillRoundRect(587, 329, 79, 17, 17, 17);
        g.fillRoundRect(586, 329, 17, 81, 17, 17);

        int[] x4 = {664, 601, 601};
        int[] y4 = {473, 538, 473};
        g.fillPolygon(x4, y4, 3);
        g.fillRoundRect(587, 459, 79, 17, 17, 17);
        g.fillRoundRect(586, 459, 17, 81, 17, 17);

        int[] x5 = {664, 601, 601};
        int[] y5 = {603, 668, 603};
        g.fillPolygon(x5, y5, 3);
        g.fillRoundRect(587, 589, 79, 17, 17, 17);
        g.fillRoundRect(586, 589, 17, 81, 17, 17);


        g.fillRoundRect(469, 718, 66, 80, 10, 10);
        g.fillRoundRect(426, 294, 150, 415, 40, 40);

        g.setColor(Color.white); //Козырек
        g.fillOval(437, 305, 126, 126);
        g.setColor(Color.black);
        g.fillOval(438, 323, 124, 124);

        g.setColor(Color.white); //Козырек
        g.fillOval(437, 435, 126, 126);
        g.setColor(Color.black);
        g.fillOval(438, 453, 124, 124);

        g.setColor(Color.white); //Козырек
        g.fillOval(437, 565, 126, 126);
        g.setColor(Color.black);
        g.fillOval(438, 583, 124, 124);

        g.fillRect(431, 337, 9, 340);
        g.fillRect(561, 342, 9, 330);


        g.setColor(Color.red);
        g.fillOval(451, 329, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(451, 459, 100, 100);
        g.setColor(Color.green);
        g.fillOval(451, 590, 100, 100);


    }
}
