import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Calculator2 implements ActionListener {
    private JTextField text1;
    private JTextField text2;
    private JTextField text7;
    @Override
           public void actionPerformed(ActionEvent e){
            Decide dec =new Decide() {

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
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'getAge'");
                }
                
            };
            try {
                double weight = dec.getWeight();
                double height = dec.getHeight();
                text7.setText(String.format("%.2f",dec.third(weight,height))); // результат с двумя числами после запятой
            } catch(Exception ex) {
                //JOptionPane.showMessageDialog(this, ex.getMessage(), "Ошибка", MessageType.ERROR);
        }
    }

    public void setText2() {
        this.text1=TextField.getText1();
        this.text2=TextField.getText2();
        this.text7=TextField.getText7();    
    }
}