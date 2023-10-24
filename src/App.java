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
}
}

