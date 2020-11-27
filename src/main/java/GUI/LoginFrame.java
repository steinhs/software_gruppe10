package GUI;

import model.Bruker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener{

    //Global knapper
    JButton loginKnapp, registrerKnapp, registrerFormKnapp;
    JTextField fornavnTekstfelt, etternavnTekstfelt, emailTekstfelt, brukernavnTekstfelt, passordTekstfelt;
    JPanel registreringsPanel, loginRegisterPanel;
    JLabel fornavnLabel, etternavnLabel, emailLabel, brukernavnLabel, passordLabel;
    Color bakgrunnFarge1 = new Color(203,241,245);
    Color bakgrunnFarge2 = new Color(166,227,233);
    Color fontFarge1 = new Color(113,201,206);

    LoginFrame() {

        //Lage en frame og modifisere den.
        this.setTitle("Park&Disembark");   //Setter en tittel til den.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Stopper applikasjonen når framen lukkes.
        this.setResizable(false); //Setter framen til å ikke være resizeable.
        this.setSize(1280, 800);   //Setter størrelsen på framen.
        this.setLocationRelativeTo(null);  //Åpner framen midt på skjermen.
        this.getContentPane().setBackground(bakgrunnFarge1);   //Setter bakgrunnsfargen.

        //Lage tekstfelt.
        fornavnTekstfelt = new JTextField();
        fornavnTekstfelt.setBounds(160,28,250, 50);
        fornavnTekstfelt.setFont(new Font("Helvetica", Font.PLAIN, 22));

        etternavnTekstfelt = new JTextField();
        etternavnTekstfelt.setBounds(160, 28, 250,50);
        etternavnTekstfelt.setFont(new Font("Helvetica", Font.PLAIN, 22));

        emailTekstfelt = new JTextField();
        emailTekstfelt.setBounds(160, 28, 250,50);
        emailTekstfelt.setFont(new Font("Helvetica", Font.PLAIN, 22));

        brukernavnTekstfelt = new JTextField();
        brukernavnTekstfelt.setBounds(160, 28, 250,50);
        brukernavnTekstfelt.setFont(new Font("Helvetica", Font.PLAIN, 22));

        passordTekstfelt = new JTextField();
        passordTekstfelt.setBounds(160, 28, 250,50);
        passordTekstfelt.setFont(new Font("Helvetica", Font.PLAIN, 22));

        JTextField brukernavnFelt = new JTextField();
        brukernavnFelt.setBounds(490, 120, 300,50);
        brukernavnFelt.setFont(new Font("Helvetica", Font.PLAIN, 22));

        JPasswordField passordFelt = new JPasswordField();
        passordFelt.setBounds(490, 190, 300, 50);
        passordFelt.setFont(new Font("Helvetica", Font.PLAIN, 22));

        //Lage knapper.
        loginKnapp = new JButton("Logg inn");   //Knapp for å logge inn.
        loginKnapp.setFocusable(false);
        loginKnapp.addActionListener(this);
        loginKnapp.setFont(new Font("Helvetica", Font.BOLD, 18));
        loginKnapp.setBackground(bakgrunnFarge2);
        loginKnapp.setForeground(fontFarge1);
        loginKnapp.setBounds(490, 260, 145, 50);

        registrerKnapp = new JButton("Registrer");    //Knapp for å registrere ny bruker
        registrerKnapp.setFocusable(false);
        registrerKnapp.addActionListener(this);
        registrerKnapp.setFont(new Font("Helvetica", Font.BOLD, 18));
        registrerKnapp.setBackground(bakgrunnFarge2);
        registrerKnapp.setForeground(fontFarge1);
        registrerKnapp.setBounds(645, 260, 145, 50);

        registrerFormKnapp = new JButton("Registrer");    //Knapp for å registrere ny bruker
        registrerFormKnapp.setFocusable(false);
        registrerFormKnapp.addActionListener(this);
        registrerFormKnapp.setFont(new Font("Helvetica", Font.BOLD, 18));
        registrerFormKnapp.setBackground(bakgrunnFarge2);
        registrerFormKnapp.setForeground(fontFarge1);
        registrerFormKnapp.setBounds(360,430,160,60);

        //Lage Ikon til applikasjonen. (fant ingen bra ikoner så ga opp på det :c)
        ImageIcon image1 = new ImageIcon("src/imgs/icon4.png");
        this.setIconImage(image1.getImage());

        //Paneler til velkomsts/login skjerm.
        JPanel velkomstTittelPanel = new JPanel();
        velkomstTittelPanel.setBackground(bakgrunnFarge1);
        velkomstTittelPanel.setBounds(0,0,1280,100);
        velkomstTittelPanel.setLayout(new BorderLayout());

        registreringsPanel = new JPanel();
        registreringsPanel.setBackground(bakgrunnFarge2);
        registreringsPanel.setBounds(200, 150, 880, 500);
        registreringsPanel.setBorder(BorderFactory.createLineBorder(fontFarge1,2));
        registreringsPanel.setLayout(null);

        loginRegisterPanel = new JPanel();
        loginRegisterPanel.setBackground(bakgrunnFarge1);
        loginRegisterPanel.setBounds(0,100,1280,600);

        JPanel footnote = new JPanel();
        footnote.setBackground(bakgrunnFarge1);
        footnote.setBounds(0,700,1280,62);

        //Lage noen labels.
        JLabel label1 = new JLabel();
        label1.setText("Park & Disembark");
        label1.setForeground(fontFarge1);
        label1.setFont(new Font("Sans-Serif", Font.BOLD, 60));
        label1.setVerticalAlignment(JLabel.BOTTOM);
        label1.setHorizontalAlignment(JLabel.CENTER);

        fornavnLabel = new JLabel();
        fornavnLabel.setText("Fornavn:");
        fornavnLabel.setForeground(fontFarge1);
        fornavnLabel.setFont(new Font("Sans-Serif", Font.BOLD, 26));
        fornavnLabel.setBounds(200,10,450,100);
        fornavnLabel.add(fornavnTekstfelt);

        etternavnLabel = new JLabel();
        etternavnLabel.setText("Etternavn:");
        etternavnLabel.setForeground(fontFarge1);
        etternavnLabel.setFont(new Font("Sans-Serif", Font.BOLD, 26));
        etternavnLabel.setBounds(200,90,450,100);
        etternavnLabel.add(etternavnTekstfelt);

        emailLabel = new JLabel();
        emailLabel.setText("Email:");
        emailLabel.setForeground(fontFarge1);
        emailLabel.setFont(new Font("Sans-Serif", Font.BOLD, 26));
        emailLabel.setBounds(200,170,450,100);
        emailLabel.add(emailTekstfelt);

        brukernavnLabel = new JLabel();
        brukernavnLabel.setText("Brukernavn:");
        brukernavnLabel.setForeground(fontFarge1);
        brukernavnLabel.setFont(new Font("Sans-Serif", Font.BOLD, 26));
        brukernavnLabel.setBounds(200,250,450,100);
        brukernavnLabel.add(brukernavnTekstfelt);

        passordLabel = new JLabel();
        passordLabel.setText("Passord:");
        passordLabel.setForeground(fontFarge1);
        passordLabel.setFont(new Font("Sans-Serif", Font.BOLD, 26));
        passordLabel.setBounds(200,330,450,100);
        passordLabel.add(passordTekstfelt);


        //Legger til labels og knapper til panels og endre layout.
        velkomstTittelPanel.add(label1);

        registreringsPanel.add(fornavnLabel);
        registreringsPanel.add(etternavnLabel);
        registreringsPanel.add(emailLabel);
        registreringsPanel.add(brukernavnLabel);
        registreringsPanel.add(passordLabel);
        registreringsPanel.add(registrerFormKnapp);

        loginRegisterPanel.add(brukernavnFelt);
        loginRegisterPanel.add(passordFelt);
        loginRegisterPanel.add(loginKnapp);
        loginRegisterPanel.add(registrerKnapp);
        loginRegisterPanel.setLayout(null);


        //Legger til alle knapper og labels og panels til framen.
        this.add(velkomstTittelPanel);
        this.add(registreringsPanel);
        this.add(loginRegisterPanel);
        this.add(footnote);

        //Gjør GUI synelig.
        registreringsPanel.setVisible(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginKnapp) {
            this.dispose();
            new MainFrame();
        }
        if(e.getSource()==registrerKnapp) {

            loginRegisterPanel.setVisible(false);
            registreringsPanel.setVisible(true);
        }
        if(e.getSource()==registrerFormKnapp) {
            Bruker nyBruker = new Bruker(fornavnTekstfelt.getText(), etternavnTekstfelt.getText(), emailTekstfelt.getText());
            loginRegisterPanel.setVisible(true);
            registreringsPanel.setVisible(false);
        }
    }
}
