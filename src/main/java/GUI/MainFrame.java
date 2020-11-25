package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    JButton leieKnapp, utleieKnapp, profilKnapp, instillingerKnapp;

    MainFrame() {

        //Lage en frame og modifisere den.
        this.setTitle("Park&Disembark");   //Setter en tittel til den.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Stopper applikasjonen når framen lukkes.
        this.setResizable(false); //Setter framen til å ikke være resizeable.
        this.setSize(1280, 800);   //Setter størrelsen på framen.
        this.setLocationRelativeTo(null);  //Åpner framen midt på skjermen.
        this.getContentPane().setBackground(new Color(187,222,214));   //Setter bakgrunnsfargen.
        this.setLayout(null);

        //Lage tekstfelt.


        //Lage knapper.
        leieKnapp = new JButton("Leie");   //Knapp for å leie.
        leieKnapp.setFocusable(false);
        leieKnapp.addActionListener(this);
        leieKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        leieKnapp.setBackground(new Color(250,227,217));
        leieKnapp.setForeground(new Color(255,182,185));
        leieKnapp.setBorder(null);

        utleieKnapp = new JButton("Utleie");   //Knapp for å leie.
        utleieKnapp.setFocusable(false);
        utleieKnapp.addActionListener(this);
        utleieKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        utleieKnapp.setBackground(new Color(250,227,217));
        utleieKnapp.setForeground(new Color(255,182,185));
        utleieKnapp.setBorder(null);

        profilKnapp = new JButton("Profil");   //Knapp for å leie.
        profilKnapp.setFocusable(false);
        profilKnapp.addActionListener(this);
        profilKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        profilKnapp.setBackground(new Color(250,227,217));
        profilKnapp.setForeground(new Color(255,182,185));
        profilKnapp.setBorder(null);

        instillingerKnapp = new JButton("Instillinger");   //Knapp for å leie.
        instillingerKnapp.setFocusable(false);
        instillingerKnapp.addActionListener(this);
        instillingerKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        instillingerKnapp.setBackground(new Color(250,227,217));
        instillingerKnapp.setForeground(new Color(255,182,185));
        instillingerKnapp.setBorder(null);

        //Lage Ikon til applikasjonen. (fant ingen bra ikoner så ga opp på det :c)
        ImageIcon image1 = new ImageIcon("src/imgs/icon4.png");
        this.setIconImage(image1.getImage());

        //Paneler til velkomsts/login skjerm.
        JPanel tittelPanel = new JPanel();
        tittelPanel.setBackground(new Color(187,222,214));
        tittelPanel.setBounds(0,0,1280,100);
        tittelPanel.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(187,222,214));
        mainPanel.setBounds(0,100,1280,550);

        JPanel footnote = new JPanel();
        footnote.setBackground(new Color(250,227,217));
        footnote.setBounds(0,650,1280,120);

        //Lage noen labels.
        JLabel label1 = new JLabel();
        label1.setText("Park & Disembark");
        label1.setForeground(new Color (97,192,191));
        label1.setFont(new Font("Sans-Serif", Font.BOLD, 60));
        label1.setVerticalAlignment(JLabel.BOTTOM);
        label1.setHorizontalAlignment(JLabel.CENTER);

        //Legger til labels og knapper til panels og endre layout.
        tittelPanel.add(label1);
        footnote.add(leieKnapp);
        footnote.add(utleieKnapp);
        footnote.add(profilKnapp);
        footnote.add(instillingerKnapp);
        footnote.setLayout(new GridLayout(1,4));

        //Legger til alle knapper og labels og panels til framen.
        this.add(tittelPanel);
        this.add(mainPanel);
        this.add(footnote);

        //Gjør GUI synelig.
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==leieKnapp) {
            System.out.println("leie!");
        }
        if(e.getSource()==utleieKnapp) {
            System.out.println("utleie!");
        }
        if(e.getSource()==profilKnapp) {
            System.out.println("profil!");
        }
        if(e.getSource()==instillingerKnapp) {
            System.out.println("innstillinger!");
        }
    }
}
