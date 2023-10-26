import javax.swing.*;
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.util.concurrent.BlockingQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class Calculator1 implements ActionListener{
    private JRadioButton button4;
    private JTextField text1;
    private JTextField text2;
    private JTextField text4;
    private JTextField text6;
    private JTextField text7;
    private JTextField text8;

    @Override
        public void actionPerformed(ActionEvent e){
        try { 
            // Создание абстрактного объекта с формулами и решением
            Decide dec = new Decide() {

                // Методы получения нужных данных с текстовых полей
                @Override
                public double getWeight() {
                    return Double.parseDouble(text2.getText());
                }

                @Override
                public double getHeight() {
                    return Double.parseDouble(text1.getText()); 
                }

                @Override
                public double getAge() {
                    return Double.parseDouble(text4.getText());
                }
                
                
            };
             // Определяем нужные данные
                double weight = dec.getWeight();
                double height = dec.getHeight();
                double age = dec.getAge();
                // Проверка нажатия кнопки
                if (button4.isSelected()){ 
                    // если нажата кнопка "Ж", то результат считается по формуле:
                    // вывод результата в окно:
                    text6.setText(""+dec.first(weight,height,age));
                }
                else {
                    // если нажата кнопка "М", то результат считается по формуле:
                    text6.setText(""+dec.second(weight,height,age));
                }


            } catch(Exception ex) {
                //
            }
           
        }

    public void setButtons(JRadioButton button4) {
        this.button4=button4;
    }

    public void setText1() {
        this.text1=TextField.getText1();
        this.text2=TextField.getText2();
        this.text4=TextField.getText4();
        this.text6=TextField.getText6();
        this.text7=TextField.getText7();
        this.text8=TextField.getText8();
    }

    public JTextField getText7(){
        return text7;
    }

    public JTextField getText8(){
        return text8;
    }
}
