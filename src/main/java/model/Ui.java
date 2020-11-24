package model;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;


//Test for å bruke Swing til GUI. Et alternativ til Main.java for å teste programmet med GUI.

public class Ui {

    public static void main(String[] args) {

        //Lage en frame og modifisere den.
        JFrame frame = new JFrame();    //Oppretter framen.
        frame.setTitle("Park&Disembark");   //Setter en tittel til den.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Stopper applikasjonen når framen lukkes.
        frame.setSize(1280, 800);   //Setter størrelsen på framen.
        frame.setLocationRelativeTo(null);  //Åpner framen midt på skjermen.
        frame.getContentPane().setBackground(new Color(250,227,217));   //Setter bakgrunnsfargen.
        frame.setLayout(new FlowLayout());

        //Lage knapper.
        JButton Login = new JButton("Logg inn.");   //Knapp for å logge inn.
        JButton Registrer = new JButton("Registrer ny bruker.");    //Knapp for å registrere ny bruker

        //Lage Ikon til applikasjonen. (fant ingen bra ikoner så ga opp på det :c)
        ImageIcon image1 = new ImageIcon("src/imgs/icon4.png");
        frame.setIconImage(image1.getImage());

        //Lage noen labels.
        JLabel label1 = new JLabel();
        label1.setText("Park & Disembark");
        label1.setForeground(new Color (255,182,185));
        label1.setFont(new Font("Sans-Serif", Font.ITALIC, 60));


        //Legger til alle knapper og labels til framen.
        frame.add(label1);
        //frame.add(Login);
        //frame.add(Registrer);

        //Gjør GUI synelig.
        frame.setVisible(true);
    }
}
