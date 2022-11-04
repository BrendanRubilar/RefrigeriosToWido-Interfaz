import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;


class Moneda100 extends Moneda{

   public Moneda100(){

   }

   public Moneda100(JPanel target){

      JLabel moneda100 = new JLabel();
      ImageIcon imagen100 = new ImageIcon("100pesos.png");
      moneda100.setBounds(785,470,50,50);
      moneda100.setIcon(new ImageIcon(imagen100.getImage().getScaledInstance(moneda100.getWidth(),moneda100.getHeight(),Image.SCALE_SMOOTH)));
      Movement movimiento100 = new Movement(moneda100);
      target.add(moneda100);

   }
 
    @Override
     public int getValues(){
        return 100;
     }

    @Override
    public int getSerie(){
        return Moneda100.this.hashCode();
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 100 \n Serie: "+ Moneda100.this.hashCode();
     }


}