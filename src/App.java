import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

/*import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.awt.event.*;
import javax.swing.event.*;*/
import javax.swing.JTextField.*;
import javax.swing.text.Style;
public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фитнес-Калькулятор");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //реальное закрытие программы, при закрытии окна(нажатии на красный крестик) 
        frame.setSize(900, 550);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null); //чтобы кнопка была не на весь экран, регулировать размер и положение
        frame.setBackground(Color.GRAY);

        //Color clr = new Color(199, 21, 133);
        //frame.getContentPane().setBackground(clr);
        Font Font1 = new Font("Times New Roman", 1, 18); 
        Font Font2 = new Font("Times New Roman", 1, 30);
        Font Font3 = new Font("Times New Roman", 1, 20);
        Font Font4 = new Font("Times New Roman", 0, 44);
        JButton button1 = new JButton();
        button1.setText("Рассчитать");
        button1.setSize(150,80);
        button1.setLocation(44,230);
        button1.setBackground(Color.WHITE);
        button1.setFont(Font3);
       
        JButton button2 = new JButton();
        button2.setText("Рассчитать");
        button2.setSize(150,80);
        button2.setLocation(343,230);
        button2.setBackground(Color.WHITE);
        button2.setFont(Font3);
        
        JButton button3 = new JButton();
        button3.setText("Рассчитать");
        button3.setSize(150,80);
        button3.setLocation(638,230);
        button3.setBackground(Color.WHITE);
        button3.setFont(Font3);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        JTextField text1 = new JTextField();
        text1.setSize(150,100);
        text1.setLocation(43,45);
        Color color = new Color(250, 170, 218);
        text1.setBackground(color);
        text1.setHorizontalAlignment(0);
        frame.add(text1);
        text1.setText("");
        text1.setFont(Font2);
        text1.setForeground(Color.BLACK);

        JTextField text2 = new JTextField();
        text2.setSize(150,100);
        text2.setLocation(260,45);
        text2.setBackground(color);
        text2.setHorizontalAlignment(0);
        frame.add(text2);
        text2.setText("");
        text2.setFont(Font2);

        JTextField text3 = new JTextField();
        text3.setSize(150,100);
        text3.setLocation(473,45);
        text3.setBackground(color);
        text3.setHorizontalAlignment(0);
        text3.setText("");
        frame.add(text3);
        text3.setFont(Font2);

        JTextField text4 = new JTextField();
        text4.setSize(150,100);
        text4.setLocation(690,45);
        text4.setBackground(color);
        frame.add(text4);
        text4.setHorizontalAlignment(0);
        text4.setText("");
        text4.setFont(Font2);

        JLabel label1 = new JLabel();
        label1.setSize(100,20);
        label1.setLocation(80,20);
        frame.add(label1);
        label1.setText("Рост (см)");
        label1.setFont(Font1);
        label1.setForeground(Color.BLACK);

        JLabel label2 = new JLabel();
        label2.setSize(100,20);
        label2.setLocation(310,20);
        frame.add(label2);
        label2.setText("Вес (кг)");
        label2.setFont(Font1);
        label2.setForeground(Color.BLACK);
         
         JLabel label3 = new JLabel();
         label3.setSize(100,20);
         label3.setLocation(525,20);
         frame.add(label3);
         label3.setText("Пол");
         label3.setFont(Font1);
         label3.setForeground(Color.BLACK);
         
         JLabel label4 = new JLabel();
         label4.setSize(150,20);
        label4.setLocation(700,20);
        frame.add(label4);
        label4.setText("Возраст (года)");
         label4.setFont(Font1);
        label4.setForeground(Color.BLACK);
       
        JLabel label5 = new JLabel();
        label5.setSize(180,200);
        label5.setLocation(48,100);
        frame.add(label5);
        label5.setText("<html> Суточная норма <br> потребления КБЖУ <html/>");
        label5.setFont(Font1);
        label5.setForeground(Color.BLACK);
        JLabel label6 = new JLabel();
        label6.setSize(200,200);
        label6.setLocation(370, 102);
        label6.setBackground(Color.PINK);
        frame.add(label6);
        label6.setText("<html> Индекс <br> массы тела <html/>");
        label6.setFont(Font1);
        label6.setForeground(Color.BLACK);

        JLabel label7 = new JLabel();
        label7.setSize(300,200);
        label7.setLocation(640,97);
        label7.setBackground(Color.PINK);
        frame.add(label7);
        label7.setText("<html>Суточная <br> норма потребления <br> жидкости<html/>");
        label7.setFont(Font1);
        label7.setForeground(Color.BLACK);

        JTextField text5 = new JTextField();
        text5.setSize(793,50);
        text5.setLocation(43,330);
        text5.setBackground(color);
        frame.add(text5);
        text5.setHorizontalAlignment(0);
        text5.setText(" Р е з у л ь т а т");
        text5.setFont(Font4);
        text5.setForeground(Color.BLACK);

        JTextField text6 = new JTextField();
        text6.setSize(150,80);
        text6.setLocation(44,400);
        text6.setBackground(Color.WHITE);
        text6.setHorizontalAlignment(0);
        frame.add(text6);
        text6.setText("");
        text6.setFont(Font2);

        JTextField text7 = new JTextField();
        text7.setSize(150,80);
        text7.setLocation(343,400);
        text7.setBackground(Color.WHITE);
        text7.setHorizontalAlignment(0);
        frame.add(text7);
        text7.setText("");
        text7.setFont(Font2);

        JTextField text8 = new JTextField();
        text8.setSize(150,80);
        text8.setLocation(638,400);
        text8.setBackground(Color.WHITE);
        text8.setHorizontalAlignment(0);
        frame.add(text8);
        text8.setText("");
        text8.setFont(Font2);



    }
}

