import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Labels {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;

    // Конструктор меток
    public Labels(Font Font1){
        JFrame frame=GUI.getFrame(); // Получение главного фрейма для добавления в него меток

        label1 = new JLabel(); // Создание объекта метки
        label1.setSize(100,20); //размеры текстового окна
        label1.setLocation(80,20); // расположение 
        frame.add(label1); // Добавление метки на фрейм
        label1.setText("Рост (см)"); // текст  
        label1.setFont(Font1); // шрифт и размер текста
        label1.setForeground(Color.BLACK); // цвет 

        label2 = new JLabel();
        label2.setSize(100,20);
        label2.setLocation(310,20);
        frame.add(label2);
        label2.setText("Вес (кг)");
        label2.setFont(Font1);
        label2.setForeground(Color.BLACK);
        
        label3 = new JLabel();
        label3.setSize(100,20);
        label3.setLocation(525,20);
        frame.add(label3);
        label3.setText("Пол");
        label3.setFont(Font1);
        label3.setForeground(Color.BLACK);
        
        label4 = new JLabel();
        label4.setSize(150,20);
        label4.setLocation(700,20);
        frame.add(label4);
        label4.setText("Возраст (года)");
        label4.setFont(Font1);
        label4.setForeground(Color.BLACK);
        
        label5 = new JLabel();
        label5.setSize(180,200);
        label5.setLocation(48,100);
        frame.add(label5);
        label5.setText("<html> Суточная норма <br> потребления КБЖУ <html/>");
        label5.setFont(Font1);
        label5.setForeground(Color.BLACK);

        label6 = new JLabel();
        label6.setSize(200,200);
        label6.setLocation(370, 102);
        frame.add(label6);
        label6.setBackground(Color.PINK);
        label6.setText("<html> Индекс <br> массы тела <html/>");
        label6.setFont(Font1);
        label6.setForeground(Color.BLACK);

        label7 = new JLabel();
        label7.setSize(300,200);
        label7.setLocation(640,97);
        frame.add(label7);
        label7.setBackground(Color.PINK);
        label7.setText("<html>Суточная <br> норма потребления <br> жидкости<html/>");
        label7.setFont(Font1);
        label7.setForeground(Color.BLACK);
 
    }
}