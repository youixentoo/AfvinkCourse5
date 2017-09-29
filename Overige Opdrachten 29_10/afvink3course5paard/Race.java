package com.maventest.afvink3course5paard;

/**
 * Race class Class Race maakt gebruik van de class Paard
 *
 * @author Martijn van der Bruggen
 * @version alpha - aanroep van cruciale methodes ontbreekt (c) 2009 Hogeschool
 * van Arnhem en Nijmegen
 *
 * Note: deze code is bewust niet op alle punten generiek dit om nog onbekende
 * constructies te vermijden.
 *
 * Updates 2010: verduidelijking van opdrachten in de code MvdB 2011:
 * verbetering leesbaarheid code MvdB 2012: verbetering layout code en
 * aanpassing commentaar MvdB 2013: commentaar aangepast aan nieuwe opdracht
 * MvdB
 *
 *************************************************
 * Afvinkopdracht: werken met methodes en objecten
 * ************************************************ Opdrachten zitten verwerkt
 * in de code 1) Declaratie constante 2) Declaratie van Paard (niet
 * instantiering) 3) Declareer een button 4) Zet breedte en hoogte van het frame
 * 5) Teken een finish streep 6) Creatie van 4 paarden 7) Pauzeer 8) Teken 4
 * paarden 9) Plaats tekst op de button 10) Start de race, methode aanroep
 *
 * Dit bestand is a rotzooi, gebruik "RewriteRace" Ik ga dit bestand misschien
 * ooit fixen
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class Race extends JFrame implements ActionListener {

    /**
     * declaratie van variabelen
     */
    private final int lengte = 250;
    private Paard h1 = new Paard("One", Color.red);
    private Paard h2 = new Paard("Two", Color.blue);
    private Paard h3 = new Paard("Three", Color.green);
    private Paard h4 = new Paard("Four", Color.yellow);
    private Paard h5 = new Paard("Five", Color.MAGENTA);

    private int PD1, PD2, PD3, PD4, PD5 = 10;

    private JButton button;
    private JPanel panel;

    private boolean Done = false;

    /**
     * Applicatie - main functie voor runnen applicatie
     *
     * @param args
     */
    public static void main(String[] args) {
        //checkExit();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createFrame();
            }
        });
    }

    private static void createFrame() {
        Race frame = new Race();
        frame.setSize(400, 140);
        frame.createGUI();
        frame.setVisible(true);
    }

    /**
     * Loop de race
     */
    private void startRace(Graphics g) {
        int usless = 0;
        panel.setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(lengte + 10, 0, 3, 200);

        /**
         * Loop tot een paard over de finish is
         */
        Thread Gameloop = new Thread(){
            public void run(){
                while (h1.getAfstand() < lengte && h2.getAfstand() < lengte && h3.getAfstand() < lengte && h4.getAfstand() < lengte && h5.getAfstand() < lengte) {

                    PD1 = h1.getAfstand();
                    PD2 = h2.getAfstand();
                    PD3 = h3.getAfstand();
                    PD4 = h4.getAfstand();
                    PD5 = h5.getAfstand();

                    h1.competition();
                    h2.competition();
                    h3.competition();
                    h4.competition();
                    h5.competition();
                    
                    pauzeer(100);

                    tekeningnen(g);

                    /**
                     * Kijk welk paard gewonnen heeft
                     */
                    if (h1.getAfstand() > lengte){JOptionPane.showMessageDialog(null, h1.getNaam() + " heeft gewonnen!");}
                    if (h2.getAfstand() > lengte){JOptionPane.showMessageDialog(null, h2.getNaam() + " heeft gewonnen!");}
                    if (h3.getAfstand() > lengte){JOptionPane.showMessageDialog(null, h3.getNaam() + " heeft gewonnen!");}
                    if (h4.getAfstand() > lengte){JOptionPane.showMessageDialog(null, h4.getNaam() + " heeft gewonnen!");}
                    if (h5.getAfstand() > lengte){JOptionPane.showMessageDialog(null, h5.getNaam() + " heeft gewonnen!");}
                    
                }
            }
            /**
            * Pauzeer gedurende x millisecondes
            */
            public void pauzeer(int msec) {
                try {
                    Thread.sleep(msec);
                }catch (InterruptedException e){System.out.println("Pauze interruptie");}
            }
            
        };
        Gameloop.start();
    }

    /**
     * Creatie van de GUI
     */
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);
        button = new JButton();
        button.setText("Run");
        window.add(button);
        button.addActionListener(this);
    }

    /**
     * Actie indien de button geklikt i
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        startRace(paper);
    }

    /**
     * Teken het paard
     */
    private void tekenPaard(Graphics g, Paard h, int StartAfstand) {
        g.setColor(h.getKleur());
        g.fillRect(10, 20 * h.getPaardNummer(), h.getAfstand(), 5);
        g.setColor(Color.WHITE);
        g.fillRect(0, 20 * h.getPaardNummer(), StartAfstand, 5);
    }


    public void tekeningnen(Graphics g) {
        tekenPaard(g, h1, PD1);
        //System.out.println(String.valueOf(PD1));
        tekenPaard(g, h2, PD2);
        tekenPaard(g, h3, PD3);
        tekenPaard(g, h4, PD4);
        tekenPaard(g, h5, PD5);
    }

    private void reset() {
        System.out.println(h1.getPaardNummer());
        dispose();
        createFrame();

    }

}
