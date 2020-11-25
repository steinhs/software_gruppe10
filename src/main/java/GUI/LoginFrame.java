package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener{

    //Global knapper
    JButton loginKnapp, registrerKnapp;
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
        registrerKnapp.addActionListener(e -> System.out.println("Send til registrerings skjerm."));
        registrerKnapp.setFont(new Font("Helvetica", Font.BOLD, 18));
        registrerKnapp.setBackground(bakgrunnFarge2);
        registrerKnapp.setForeground(fontFarge1);
        registrerKnapp.setBounds(645, 260, 145, 50);

        //Lage Ikon til applikasjonen. (fant ingen bra ikoner så ga opp på det :c)
        ImageIcon image1 = new ImageIcon("src/imgs/icon4.png");
        this.setIconImage(image1.getImage());

        //Paneler til velkomsts/login skjerm.
        JPanel velkomstTittelPanel = new JPanel();
        velkomstTittelPanel.setBackground(bakgrunnFarge1);
        velkomstTittelPanel.setBounds(0,0,1280,100);
        velkomstTittelPanel.setLayout(new BorderLayout());

        JPanel loginRegisterPanel = new JPanel();
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

        //Legger til labels og knapper til panels og endre layout.
        velkomstTittelPanel.add(label1);

        loginRegisterPanel.add(brukernavnFelt);
        loginRegisterPanel.add(passordFelt);
        loginRegisterPanel.add(loginKnapp);
        loginRegisterPanel.add(registrerKnapp);
        loginRegisterPanel.setLayout(null);


        //Legger til alle knapper og labels og panels til framen.
        this.add(velkomstTittelPanel);
        this.add(loginRegisterPanel);
        this.add(footnote);

        //Gjør GUI synelig.
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginKnapp) {
            this.dispose();
            new MainFrame();
        }
    }
}
