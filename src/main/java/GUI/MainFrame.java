package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    JButton leieKnapp, utleieKnapp, profilKnapp, instillingerKnapp;
    JPanel leiePanel, utleiePanel, profilPanel, instillingerPanel, mainPanel;
    Color bakgrunnFarge1 = new Color(203,241,245);
    Color bakgrunnFarge2 = new Color(166,227,233);
    Color fontFarge1 = new Color(113,201,206);

    MainFrame() {

        //Lage en frame og modifisere den.
        this.setTitle("Park&Disembark");   //Setter en tittel til den.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Stopper applikasjonen når framen lukkes.
        this.setResizable(false); //Setter framen til å ikke være resizeable.
        this.setSize(1280, 800);   //Setter størrelsen på framen.
        this.setLocationRelativeTo(null);  //Åpner framen midt på skjermen.
        this.getContentPane().setBackground(bakgrunnFarge1);   //Setter bakgrunnsfargen.
        this.setLayout(null);

        //Lage tekstfelt.
        JTextField sokeFeltLeie = new JTextField();
        sokeFeltLeie.setBounds(490, 120, 300,50);
        sokeFeltLeie.setFont(new Font("Helvetica", Font.PLAIN, 22));


        //Lage knapper.
        leieKnapp = new JButton("Leie");   //Knapp for å leie.
        leieKnapp.setFocusable(false);
        leieKnapp.addActionListener(this);
        leieKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        leieKnapp.setBackground(bakgrunnFarge2);
        leieKnapp.setForeground(fontFarge1);
        leieKnapp.setBorder(null);

        utleieKnapp = new JButton("Utleie");   //Knapp for å leie.
        utleieKnapp.setFocusable(false);
        utleieKnapp.addActionListener(this);
        utleieKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        utleieKnapp.setBackground(bakgrunnFarge2);
        utleieKnapp.setForeground(fontFarge1);
        utleieKnapp.setBorder(null);

        profilKnapp = new JButton("Profil");   //Knapp for å leie.
        profilKnapp.setFocusable(false);
        profilKnapp.addActionListener(this);
        profilKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        profilKnapp.setBackground(bakgrunnFarge2);
        profilKnapp.setForeground(fontFarge1);
        profilKnapp.setBorder(null);

        instillingerKnapp = new JButton("Instillinger");   //Knapp for å leie.
        instillingerKnapp.setFocusable(false);
        instillingerKnapp.addActionListener(this);
        instillingerKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        instillingerKnapp.setBackground(bakgrunnFarge2);
        instillingerKnapp.setForeground(fontFarge1);
        instillingerKnapp.setBorder(null);

        //Lage Ikon til applikasjonen. (fant ingen bra ikoner så ga opp på det :c)
        ImageIcon image1 = new ImageIcon("src/imgs/icon4.png");
        this.setIconImage(image1.getImage());

        //Paneler til velkomsts/login skjerm.
        JPanel tittelPanel = new JPanel();
        tittelPanel.setBackground(bakgrunnFarge1);
        tittelPanel.setBounds(0,0,1280,100);
        tittelPanel.setLayout(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setBackground(bakgrunnFarge1);
        mainPanel.setBounds(0,100,1280,550);

        JPanel footnote = new JPanel();
        footnote.setBackground(bakgrunnFarge1);
        footnote.setBounds(0,650,1280,120);

        //Panel for de forskjellige knappene.
        leiePanel = new JPanel();
        leiePanel.setBackground(bakgrunnFarge1);
        leiePanel.setBounds(0,100,1280,550);

        utleiePanel = new JPanel();
        utleiePanel.setBackground(new Color(129,219,167));
        utleiePanel.setBounds(0,100,1280,550);

        profilPanel = new JPanel();
        profilPanel.setBackground(new Color(117,145,223));
        profilPanel.setBounds(0,100,1280,550);

        instillingerPanel = new JPanel();
        instillingerPanel.setBackground(new Color(223,203,85));
        instillingerPanel.setBounds(0,100,1280,550);

        //Lage noen labels.
        JLabel tittelLabel = new JLabel();
        tittelLabel.setText("Park & Disembark");
        tittelLabel.setForeground(fontFarge1);
        tittelLabel.setFont(new Font("Sans-Serif", Font.BOLD, 60));
        tittelLabel.setVerticalAlignment(JLabel.BOTTOM);
        tittelLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel mainPanelBackgroundLabel = new JLabel();
        ImageIcon mainPanelBackground = new ImageIcon("src/imgs/backgroundthingy2.jpg");
        mainPanelBackgroundLabel.setIcon(mainPanelBackground);

        //Legger til labels og knapper til panels og endre layout.
        tittelPanel.add(tittelLabel);

        mainPanel.add(mainPanelBackgroundLabel);



        footnote.add(leieKnapp);
        footnote.add(utleieKnapp);
        footnote.add(profilKnapp);
        footnote.add(instillingerKnapp);
        footnote.setLayout(new GridLayout(1,4));

        //Legger til alle knapper og labels og panels til framen.
        this.add(tittelPanel);
        this.add(mainPanel);
        this.add(footnote);
        this.add(leiePanel);
        this.add(utleiePanel);
        this.add(profilPanel);
        this.add(instillingerPanel);

        //Gjør GUI synelig.
        leiePanel.setVisible(false);
        utleiePanel.setVisible(false);
        profilPanel.setVisible(false);
        instillingerPanel.setVisible(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==leieKnapp) {
            mainPanel.setVisible(false);
            leiePanel.setVisible(true);
            utleiePanel.setVisible(false);
            profilPanel.setVisible(false);
            instillingerPanel.setVisible(false);

            System.out.println("login.");
        }
        if(e.getSource()==utleieKnapp) {
            mainPanel.setVisible(false);
            leiePanel.setVisible(false);
            utleiePanel.setVisible(true);
            profilPanel.setVisible(false);
            instillingerPanel.setVisible(false);

            System.out.println("utleie!");
        }
        if(e.getSource()==profilKnapp) {
            mainPanel.setVisible(false);
            leiePanel.setVisible(false);
            utleiePanel.setVisible(false);
            profilPanel.setVisible(true);
            instillingerPanel.setVisible(false);

            System.out.println("profil!");
        }
        if(e.getSource()==instillingerKnapp) {
            mainPanel.setVisible(false);
            leiePanel.setVisible(false);
            utleiePanel.setVisible(false);
            profilPanel.setVisible(false);
            instillingerPanel.setVisible(true);

            System.out.println("innstillinger!");
        }
    }
}
