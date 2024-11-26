package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class parkMap extends JFrame  {
    private JFrame frame;
    private JPanel panel;
    private JPanel BCirclePanel;
    private JPanel RCirclePanel;
    private JPanel BCquarePanel;
    private ArrayList<Info> info;

    public parkMap(LocationSystem locationSystem)  {


        Point point = locationSystem.getCoords(Info.getID());
        frame = new JFrame();
        frame.setSize(600, 600);

        JPanel BCirclePanel = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawOval(point.x, point.y, 2, 2);
                g.setColor(Color.BLUE);
                g.drawString("Name : " + Keeper.getName() + "Phone Number : " + Keeper.getPhoneNumber(), point.x, point.y);
            }
        };


        JPanel RCirclePanel = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawOval(point.x, point.y, 3, 3);
                g.setColor(Color.RED);
                g.drawString("Name : " + Lion.getName() + "Age : " + Lion.getAge(), point.x, point.y);
            }
        };

        JPanel BSquarePanel = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawRect(point.x, point.y, 3, 3);
                g.setColor(Color.BLACK);
                g.drawString("Name : " + Drone.getName() + "Radio frequency : " + Drone.getRadiofreq(), point.x, point.y);

            }
        };

        add(BCirclePanel);
        add(RCirclePanel);
        add(BSquarePanel);



    }







}
