import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;


class Moneda500 extends Moneda{

   public Moneda500(JPanel target, Billetera billetera, Expendedor expendedor){

      JLabel moneda500 = new JLabel();
      ImageIcon imagen500 = new ImageIcon("500pesos.png");
      moneda500.setBounds(720,470,50,50);
      moneda500.setIcon(new ImageIcon(imagen500.getImage().getScaledInstance(moneda500.getWidth(),moneda500.getHeight(),Image.SCALE_SMOOTH)));
      //MOVIMIENTO DE LA MONEDA
      Movement movimiento500 = new Movement(moneda500, this, billetera, expendedor);
      target.add(moneda500);

   }

    @Override
     public int getValues(){
        return 500;
     }

    @Override
    public int getSerie(){
        return Moneda500.this.hashCode();
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 500 \n Serie: "+ Moneda500.this.hashCode();
     }


}