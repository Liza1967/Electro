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

}
}


