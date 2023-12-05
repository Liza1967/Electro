import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Calculator3 implements ActionListener {
    private JTextField text2;
    private JTextField text8;

        @Override
        public void actionPerformed(ActionEvent e){
            Decide dec = new Decide() {

                @Override
                public double getWeight() {
                    return Double.parseDouble(text2.getText());
                }

                @Override
                public double getHeight() {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'getHeight'");
                }

                @Override
                public double getAge() {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'getAge'");
                }
                
            };
         try {
             double weight=dec.getWeight();
             text8.setText(String.valueOf(dec.fourth(weight)));
         } catch(Exception ex) {
             
         }
         };

    public void setText3() {
            this.text2=TextField.getText2();
            this.text8=TextField.getText8();    
    }
}