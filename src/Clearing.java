import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Clearing implements ActionListener{

    JRadioButton button4;
    JRadioButton button5;
    JTextField text6;
    JTextField text7;
    JTextField text8;

    @Override
    public void actionPerformed(ActionEvent e) {
        button4.setBackground(Color.green); 
        button5.setBackground(Color.pink);
        text6.setText("");
        text7.setText("");
        text8.setText("");
    }

    public void setButtons(JRadioButton button42, JRadioButton button52) {
        this.button4=button42;
        this.button5=button52;
    }

    public void setTexts() {
        text6=TextField.getText6();
        text7=TextField.getText7();
        text8=TextField.getText8();
    }
    
}