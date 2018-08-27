package pl.damianJakubowski.View;

import javax.swing.*;
import java.awt.*;


public class EmailTestSwing extends JFrame{


    private JPanel MainPanel;
    private JButton button1;
    private JTextField textOD;
    private JTextField textDO;
    private JLabel Title;
    private JTextField textTitle;
    private JLabel TextEmail;
    private JTextArea textArea1;
    private JProgressBar progressBar1;
    private JButton SendEmail;

    public EmailTestSwing(){
        initView();

    }

    private void initView(){
        setTitle("Email Sender");

        add(MainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);
    }



}
