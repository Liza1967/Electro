import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GUI {
    private static JFrame frame;

    public void create(){  
    	//kol;
        frame = new JFrame("IUI"); // создание окна
        frame.setLayout(new BorderLayout()); //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие программы 
        frame.setSize(900, 550); // размеры окна
        frame.setVisible(true); // окно было видимым
        frame.getContentPane().setLayout(null); //чтобы кнопка была не на весь экран, регулировать размер и положение
        frame.setBackground(Color.GRAY); // цвет окна
        frame.setResizable(false); // нельзя изменять размеры окна
        Color color = new Color(250, 170, 218); // цвет для  компонентов окна - розовый
        Color color1 = new Color(100, 149, 255); // цвет для компонентов окна - 

        Font Font1 = new Font("Times New Roman", 1, 14); //  шрифт и размер текста 
        Font Font2 = new Font("Times New Roman", 1, 18); 
        Font Font3 = new Font("Times New Roman", 1, 18);
        Font Font4 = new Font("Times New Roman", 0, 44);

        new Labels(Font1); // Создание объекта меток
        new TextField(); // Создание объекта Текстовых полей
        TextField.createTextField(Font2, Font4, color); // Создание текстовых полей
        new Buttons(Font3,color,color1); // Создание объекта кнопок
        
        frame.invalidate();
        frame.validate();
        frame.repaint();
        frame.show();
    }
       
    // Метод получения главного фрейма
    static JFrame getFrame(){
        return frame;
    }
}