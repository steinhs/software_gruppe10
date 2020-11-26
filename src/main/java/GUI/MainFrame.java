package GUI;

import model.Parkeringsplass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener {

    JButton leieKnapp, utleieKnapp, profilKnapp, instillingerKnapp, leieSokeKnapp;
    JPanel leiePanel, utleiePanel, profilPanel, instillingerPanel, mainPanel, leiePanelSokResultat;
    JTextField sokeFeltLeie;
    JComboBox<String> sorteringsMetoderDropdown;
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
        sokeFeltLeie = new JTextField();
        sokeFeltLeie.setBounds(490, 30, 300,50);
        sokeFeltLeie.setFont(new Font("Helvetica", Font.PLAIN, 22));


        //Lage knapper.
        leieKnapp = new JButton("Leie");   //Knapp for leie.
        leieKnapp.setFocusable(false);
        leieKnapp.addActionListener(this);
        leieKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        leieKnapp.setBackground(bakgrunnFarge2);
        leieKnapp.setForeground(fontFarge1);
        leieKnapp.setBorder(null);

        utleieKnapp = new JButton("Utleie");   //Knapp for utleie.
        utleieKnapp.setFocusable(false);
        utleieKnapp.addActionListener(this);
        utleieKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        utleieKnapp.setBackground(bakgrunnFarge2);
        utleieKnapp.setForeground(fontFarge1);
        utleieKnapp.setBorder(null);

        profilKnapp = new JButton("Profil");   //Knapp for å sjekke profil.
        profilKnapp.setFocusable(false);
        profilKnapp.addActionListener(this);
        profilKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        profilKnapp.setBackground(bakgrunnFarge2);
        profilKnapp.setForeground(fontFarge1);
        profilKnapp.setBorder(null);

        instillingerKnapp = new JButton("Instillinger");   //Knapp for å sjekke innstillinger.
        instillingerKnapp.setFocusable(false);
        instillingerKnapp.addActionListener(this);
        instillingerKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        instillingerKnapp.setBackground(bakgrunnFarge2);
        instillingerKnapp.setForeground(fontFarge1);
        instillingerKnapp.setBorder(null);

        leieSokeKnapp = new JButton("Søk");   //Knapp for å søke.
        leieSokeKnapp.setFocusable(false);
        leieSokeKnapp.addActionListener(this);
        leieSokeKnapp.setFont(new Font("Helvetica", Font.BOLD, 28));
        leieSokeKnapp.setBackground(bakgrunnFarge2);
        leieSokeKnapp.setForeground(fontFarge1);
        leieSokeKnapp.setBounds(810,30, 86, 50);

        //Lage Ikon til applikasjonen. (fant ingen bra ikoner så ga opp på det :c)
        ImageIcon image1 = new ImageIcon("src/imgs/icon4.png");
        this.setIconImage(image1.getImage());

        //Lage dropdownmeny for sortering
        String[] sorteringsMetoder = {"Pris(Lav)", "Pris(Høy)", "Alfabetisk"};
        sorteringsMetoderDropdown = new JComboBox<>(sorteringsMetoder);
        sorteringsMetoderDropdown.addActionListener(this);
        sorteringsMetoderDropdown.setFocusable(false);
        sorteringsMetoderDropdown.setBounds(370, 30, 100, 50);

        //Paneler
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
        leiePanel.setLayout(null);

        leiePanelSokResultat = new JPanel();
        leiePanelSokResultat.setBounds(400,200,480,430);
        leiePanelSokResultat.setLayout(null);

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

        leiePanel.add(sorteringsMetoderDropdown);
        leiePanel.add(sokeFeltLeie);
        leiePanel.add(leieSokeKnapp);

        footnote.add(leieKnapp);
        footnote.add(utleieKnapp);
        footnote.add(profilKnapp);
        footnote.add(instillingerKnapp);
        footnote.setLayout(new GridLayout(1,4));

        //Legger til alle knapper og labels og panels til framen.
        this.add(tittelPanel);
        this.add(mainPanel);
        this.add(footnote);
        this.add(leiePanelSokResultat);
        this.add(leiePanel);
        this.add(utleiePanel);
        this.add(profilPanel);
        this.add(instillingerPanel);

        //Gjør GUI synelig.

        leiePanelSokResultat.setVisible(false);
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
            leiePanelSokResultat.setVisible(false);
            leiePanel.setVisible(true);
            utleiePanel.setVisible(false);
            profilPanel.setVisible(false);
            instillingerPanel.setVisible(false);

            System.out.println("login.");
        }
        if(e.getSource()==utleieKnapp) {
            mainPanel.setVisible(false);
            leiePanelSokResultat.setVisible(false);
            leiePanel.setVisible(false);
            utleiePanel.setVisible(true);
            profilPanel.setVisible(false);
            instillingerPanel.setVisible(false);

            System.out.println("utleie!");
        }
        if(e.getSource()==profilKnapp) {
            mainPanel.setVisible(false);
            leiePanelSokResultat.setVisible(false);
            leiePanel.setVisible(false);
            utleiePanel.setVisible(false);
            profilPanel.setVisible(true);
            instillingerPanel.setVisible(false);

            System.out.println("profil!");
        }
        if(e.getSource()==instillingerKnapp) {
            mainPanel.setVisible(false);
            leiePanelSokResultat.setVisible(false);
            leiePanel.setVisible(false);
            utleiePanel.setVisible(false);
            profilPanel.setVisible(false);
            instillingerPanel.setVisible(true);

            System.out.println("innstillinger!");
        }

        if(e.getSource()==leieSokeKnapp) {
            ArrayList<Parkeringsplass> sokResultat = Parkeringsplass.sokEtterParkeringsPlassOgSorter(sorteringsMetoderDropdown.getSelectedIndex(), sokeFeltLeie.getText());

            JLabel[] labels = new JLabel[sokResultat.size()];
            JButton[] buttons = new JButton[sokResultat.size()];

            leiePanelSokResultat.removeAll();
            leiePanelSokResultat.repaint();

            for (int i = 0; i < sokResultat.size(); i++) {

                labels[i]=new JLabel(String.format("Sted: %s, Pris: %.2f", sokResultat.get(i).getAdresse().getSted(), sokResultat.get(i).getPris().getPrisPerTime()));
                buttons[i]=new JButton("Lei " + i);


                buttons[i].setBounds(360, (100*i)+25, 80, 50);
                buttons[i].setFocusable(false);
                buttons[i].setFont(new Font("Helvetica", Font.BOLD, 12));
                buttons[i].setBackground(bakgrunnFarge2);
                buttons[i].setForeground(fontFarge1);

                labels[i].setFont(new Font("Helvetica", Font.BOLD, 26));
                labels[i].setForeground(fontFarge1);
                labels[i].setBounds(30, (100*i),480,100);
                labels[i].add(buttons[i]);
                labels[i].setHorizontalAlignment(JLabel.LEFT);

                leiePanelSokResultat.setBorder(BorderFactory.createLineBorder(fontFarge1,2));
                leiePanelSokResultat.add(labels[i]);

            }

            leiePanelSokResultat.setVisible(true);
        }
    }
}
