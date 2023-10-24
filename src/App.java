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
    JFrame frame = new JFrame("Фитнес-Калькулятор"); // создание окна
    frame.setLayout(new BorderLayout()); // расположение объектов
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие программы 
    frame.setSize(900, 550); // размеры окна
    frame.setVisible(true); // окно было видимым
    frame.getContentPane().setLayout(null); //чтобы кнопка была не на весь экран, регулировать размер и положение
    frame.setBackground(Color.GRAY); // цвет окна
    frame.setResizable(false); // нельзя изменять размеры окна
    Color color = new Color(250, 170, 218); // цвет для  компонентов окна - розовый
    Color color1 = new Color(100, 149, 255); // цвет для компонентов окна - 

    Font Font1 = new Font("Times New Roman", 1, 18); //  шрифт и размер текста 
    Font Font2 = new Font("Times New Roman", 1, 30); 
    Font Font3 = new Font("Times New Roman", 1, 20);
    Font Font4 = new Font("Times New Roman", 0, 44);
    
  //создание кнопки
    JButton button1 = new JButton();
    button1.setText("Рассчитать"); // текст в кнопке
    button1.setSize(150,80); // размеры кнопки
    button1.setLocation(44,230); // расположение кнопки
    button1.setBackground(Color.WHITE); // цвет кнопки
    button1.setFont(Font3); // шрифт и размер текста в кнопке
   
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

    // создание кнопки Radiobutton, выглядит как нажатая кнопка
    JRadioButton button4 = new JRadioButton(); 
    button4.setText("М"); // текст кнопки
    button4.setSize(60,70); // размеры кнопки
    button4.setLocation(473,45); // расположение кнопки
    button4.setBackground(color1); // цвет кнопки 
    button4.setFont(Font3); // шрифт и размер текста в кнопке

    JRadioButton button5 = new JRadioButton();
    button5.setText("Ж");
    button5.setSize(60,70); 
    button5.setBackground(color);
    button5.setLocation(550,45);
    button5.setFont(Font3);

    // для отображения кнопок
    frame.add(button1);
    frame.add(button2);
    frame.add(button3);
    frame.add(button4);
    frame.add(button5);
 // создание текстового окна
    JTextField text1 = new JTextField();
    text1.setSize(150,100); // размеры текста 
    text1.setLocation(43,45); // расположение текста
    text1.setBackground(color); // цвет фона
    text1.setHorizontalAlignment(0); // текст по середине 
    frame.add(text1); // отображение текста
    text1.setText(""); // текст
    text1.setFont(Font2); // шрифт и размер текста
    text1.setForeground(Color.BLACK); // цвет текста 
    
    JTextField text2 = new JTextField();
    text2.setSize(150,100);
    text2.setLocation(260,45);
    text2.setBackground(color);
    text2.setHorizontalAlignment(0);
    frame.add(text2);
    text2.setText("");
    text2.setFont(Font2);

    JTextField text4 = new JTextField();
    text4.setSize(150,100);
    text4.setLocation(690,45);
    text4.setBackground(color);
    frame.add(text4);
    text4.setHorizontalAlignment(0);
    text4.setText("");
    text4.setFont(Font2);

    JTextField text5 = new JTextField();
    text5.setSize(793,50);
    text5.setLocation(43,330);
    text5.setBackground(color); // цвет фона 
    frame.add(text5);
    text5.setHorizontalAlignment(0);
    text5.setText(" Р е з у л ь т а т");
    text5.setFont(Font4);
    text5.setForeground(Color.BLACK); // цвет текста

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


