import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class Buttons extends TextField{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    public JRadioButton button4;
    public JRadioButton button5;

    public Buttons(Font Font3, Color color, Color color1) {
        //создание кнопки
        button1 = new JButton(); // Создание объектов кнопки
        button1.setText("Рассчитать"); // текст в кнопке
        button1.setSize(150,80); // размеры кнопки
        button1.setLocation(44,230); // расположение кнопки
        button1.setBackground(Color.WHITE); // цвет кнопки
        button1.setFont(Font3); // шрифт и размер текста в кнопке
       
        button2 = new JButton();
        button2.setText("Рассчитать");
        button2.setSize(150,80);
        button2.setLocation(343,230);
        button2.setBackground(Color.WHITE);
        button2.setFont(Font3);
        
        button3 = new JButton();
        button3.setText("Рассчитать");
        button3.setSize(150,80);
        button3.setLocation(638,230);
        button3.setBackground(Color.WHITE);
        button3.setFont(Font3);

        // создание кнопки Radiobutton, выглядит как нажатая кнопка
        button4 = new JRadioButton(); 
        button4.setText("М"); // текст кнопки
        button4.setSize(60,70); // размеры кнопки
        button4.setLocation(473,45); // расположение кнопки
        button4.setBackground(color1); // цвет кнопки 
        button4.setFont(Font3); // шрифт и размер текста в кнопке
        button4.setSelected(true);

        button5 = new JRadioButton();
        button5.setText("Ж");
        button5.setSize(60,70); 
        button5.setBackground(color);
        button5.setLocation(550,45);
        button5.setFont(Font3);

        // для отображения кнопок
        JFrame frame= new JFrame();
        frame=GUI.getFrame(); // Получение фрейма
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        ButtonGroup group = new ButtonGroup();        
        group.add(button5);
        group.add(button4);

        // Создание объекта на обработку событий нажатие кнопки
        // Очистка полей
        ActionListener meow = new Clearing();
        ((Clearing) meow).setButtons(button4,button5); // Определяем кнопки в класс обработки событий
        ((Clearing) meow).setTexts(); // Определяем текстовые поля в класс обработки событий
        button5.addActionListener(meow); // Включение обработчика событий
        button4.addActionListener(meow);

        // Создание объекта на обработку событий нажатие кнопки
        // Решение первой кнопки
        ActionListener calc1 = new Calculator1();
        ((Calculator1) calc1).setButtons(button4); // Определяем кнопки в класс обработки событий
        ((Calculator1) calc1).setText1(); // Определяем текстовые поля в класс обработки событий
        button1.addActionListener(calc1); // Включение обработчика событий

        // Создание объекта на обработку событий нажатие кнопки
        // Решение второй кнопки
        ActionListener calc2 = new Calculator2();
        ((Calculator2) calc2).setText2(); // Определяем текстовые поля в класс обработки событий
        button2.addActionListener(calc2); // Включение обработчика событий

        // Создание объекта на обработку событий нажатие кнопки
        // Решение третьей кнопки
        ActionListener calc3 = new Calculator3();
        ((Calculator3) calc3).setText3(); // Определяем текстовые поля в класс обработки событий
        button3.addActionListener(calc3); // Включение обработчика событий
    }

    // Методы получение кнопок "М" и "Ж"
    public JRadioButton getButton4(){
        return button4;
    } 
    
    public JRadioButton getButton5(){
        return button5;
    } 
}