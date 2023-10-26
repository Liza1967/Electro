import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField {

    private static JTextField text1;
    private static JTextField text2;
    private static JTextField text4;
    private static JTextField text5; 
    private static JTextField text6;
    private static JTextField text7;
    private static JTextField text8;

    // Метод создания текстовых полей
    public static void createTextField(Font Font2,Font Font4, Color color){
        JFrame frame=GUI.getFrame(); // Получение главного фрейма для добавления в него меток
        text1 = new JTextField(); // Создание объекта текстового поля
        text1.setSize(150,100); // размеры текста 
        text1.setLocation(43,45); // расположение текста
        frame.add(text1); // отображение текста
        text1.setBackground(color); // цвет фона
        text1.setHorizontalAlignment(0); // текст по середине 
        text1.setText(""); // текст
        text1.setFont(Font2); // шрифт и размер текста
        text1.setForeground(Color.BLACK); // цвет текста 
        
        text2 = new JTextField();
        text2.setSize(150,100);
        text2.setLocation(260,45);
        text2.setBackground(color);
        text2.setHorizontalAlignment(0);
        frame.add(text2);
        text2.setText("");
        text2.setFont(Font2);

        text4 = new JTextField();
        text4.setSize(150,100);
        text4.setLocation(690,45);
        text4.setBackground(color);
        frame.add(text4);
        text4.setHorizontalAlignment(0);
        text4.setText("");
        text4.setFont(Font2);

        text5 = new JTextField();
        text5.setSize(793,50);
        text5.setLocation(43,330);
        text5.setBackground(color); // цвет фона 
        frame.add(text5);
        text5.setHorizontalAlignment(0);
        text5.setText(" Р е з у л ь т а т");
        text5.setFont(Font4);
        text5.setForeground(Color.BLACK); // цвет текста

        text6 = new JTextField();
        text6.setSize(150,80);
        text6.setLocation(44,400);
        text6.setBackground(Color.WHITE);
        text6.setHorizontalAlignment(0);
        frame.add(text6);
        text6.setText("");
        text6.setFont(Font2);

        text7 = new JTextField();
        text7.setSize(150,80);
        text7.setLocation(343,400);
        text7.setBackground(Color.WHITE);
        text7.setHorizontalAlignment(0);
        frame.add(text7);
        text7.setText("");
        text7.setFont(Font2);

        text8 = new JTextField();
        text8.setSize(150,80);
        text8.setLocation(638,400);
        text8.setBackground(Color.WHITE);
        text8.setHorizontalAlignment(0);
        frame.add(text8);
        text8.setText("");
        text8.setFont(Font2);

        // Применение метода для ограничения ввода только цифр
        setNumericOnly(text1);
        setNumericOnly(text2);
        setNumericOnly(text4);
        setNumericOnly(text5);
        setNumericOnly(text6);
        setNumericOnly(text7);
        setNumericOnly(text8);

}
    // Методы получения текстовых полей
        public static JTextField getText1(){
            return text1;
        }

        public static JTextField getText2(){
            return text2;
        }

        public static JTextField getText4(){
            return text4;
        }
        
        public static JTextField getText5(){
            return text5;
        }

        public static JTextField getText6(){
            return text6;
        }

        public static JTextField getText7(){
            return text7;
        }

        public static JTextField getText8(){
            return text8;
        }
    
        public static void setNumericOnly(JTextField jTextField) {
            jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
            char c = e.getKeyChar();
            if ((!Character.isDigit(c) ||
            (c == java.awt.event.KeyEvent.VK_BACK_SPACE) ||
            (c == java.awt.event.KeyEvent.VK_DELETE))) {
            e.consume();
            }
            }
            });
            }
    }