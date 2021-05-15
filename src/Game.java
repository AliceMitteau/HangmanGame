import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;
import java.util.List;

public class Game {

    public JFrame mainFrame;
    public JPanel jPanel;
    public JButton validateButton = new JButton("Validate");

    public JTextField guessword = new JTextField(20);

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public List<JButton> alphabetButton = new ArrayList();


    public JPanel gridPanel = new JPanel(new GridLayout(3,9));




    public Game() {
        mainFrame = new JFrame("Hangman");
        frame();

        addSwingPanel();

        fillTabButton();
        addButtonToPanel();
    }

    public void frame() {
        mainFrame.setVisible(true);
        mainFrame.setSize(500, 300);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel();

    }

    public void panel() {
        jPanel = new JPanel(new BorderLayout());
        mainFrame.setContentPane(jPanel);
        jPanel.add(guessword);
        jPanel.add(gridPanel, BorderLayout.SOUTH);
    }

    public void addSwingPanel() {
        jPanel.add(validateButton, BorderLayout.CENTER);
        jPanel.add(guessword, BorderLayout.WEST);


        guessword.setPreferredSize(new Dimension(200, 100));


    }

    public void fillTabButton(){
        for (int i = 0 ; i<alphabet.length; i++) {
            alphabetButton.add(new JButton(String.valueOf(alphabet[i])));

        }
    }

    public void addButtonToPanel(){
        for (int i = 0; i < alphabetButton.size(); i++){
            gridPanel.add(alphabetButton.get(i));

            int finalI = i;
            alphabetButton.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(alphabetButton.get(finalI).getText());
                }
            });
        }


    }


    public void image() {

        //URL de l'image
        String imgUrl = "icone.jpg";
        ImageIcon icone = new ImageIcon(imgUrl);

        //Création de JLable avec un alignement gauche
        JLabel jlabel = new JLabel(icone, JLabel.CENTER);

        //ajouter les deux JLabel a JFrame
        mainFrame.getContentPane().add(jlabel);

    }

}


