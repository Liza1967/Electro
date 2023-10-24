import javax.swing.*;
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.util.concurrent.BlockingQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
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

    Font Font1 = new Font("Times New Roman", 1, 14); //  шрифт и размер текста 
    Font Font2 = new Font("Times New Roman", 1, 24); 
    Font Font3 = new Font("Times New Roman", 1, 16);
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
    
 // создание текста
    JLabel label1 = new JLabel();
    label1.setSize(100,20); //размеры текстового окна
    label1.setLocation(80,20); // расположение 
    frame.add(label1); //  отображение 
    label1.setText("Рост (см)"); // текст  
    label1.setFont(Font1); // шрифт и размер текста
    label1.setForeground(Color.BLACK); // цвет 

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
    
    // при нажатии кнопки изменение цвета кнопки и очищение результата в окнах
    button4.addActionListener(new ActionListener() { //
        @Override // 
        public void actionPerformed(ActionEvent e){
             button4.setBackground(Color.green); 
             button5.setBackground(Color.pink);
             text6.setText("");
             text7.setText("");
             text8.setText("");
             }
             
     });

     button5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
             button5.setBackground(Color.green);
             button4.setBackground(Color.cyan);
             text6.setText("");
             text7.setText("");
             text8.setText("");
        
            
        }
     });

     //
     ButtonGroup group = new ButtonGroup();        
     group.add(button5);
     group.add(button4);

     // при нажатии кнопки:
     button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         try { 
             // считывание значений введенных пользователем
             int height = Integer.parseInt(text1.getText()); 
             int weight = Integer.parseInt(text2.getText());
             int age = Integer.parseInt(text4.getText());
             double result = 0; // первоначальное значение результата формулы
             if (button4.isSelected()){ 
                 // если нажата кнопка "Ж", то результат считается по формуле:
             result = (10*weight + 6.25*height-5*age)-161; // enter formula
             }
             else {
                 // если нажата кнопка "М", то результат считается по формуле:
                 result = (10*weight + 6.25*height-5*age)+5;
             }
             // вывод результата в окно:
             text6.setText(String.valueOf(result));

         } catch(Exception ex) {
             //JOptionPane.showMessageDialog(this, ex.getMessage(), "Ошибка", MessageType.ERROR);
         }
        
     }
 } );
     //при нажатии кнопки:
     button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         try {
             double height = Integer.parseInt(text1.getText());
             int weight = Integer.parseInt(text2.getText());
             double result1 = weight/(Math.pow(height/100,2));
             text7.setText(String.format("%.2f",result1)); // результат с двумя числами после запятой
         } catch(Exception ex) {
             //JOptionPane.showMessageDialog(this, ex.getMessage(), "Ошибка", MessageType.ERROR);
         }
        }
     });
     // при нажатии кнопки:
     button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         try {
             int weight = Integer.parseInt(text2.getText());
             double result2 = weight*30; // enter formula
             text8.setText(String.valueOf(result2));
         } catch(Exception ex) {
             //JOptionPane.showMessageDialog(this, ex.getMessage(), "Ошибка", MessageType.ERROR);
         }
         
        }
     });
   }
}
     
 



