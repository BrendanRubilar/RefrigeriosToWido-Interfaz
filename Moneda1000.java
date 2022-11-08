import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;



class Moneda1000 extends Moneda{

   JLabel moneda1000;
   public Moneda1000(JPanel target, Billetera billetera, Expendedor expendedor){
      //Pruebas moneda de 1000
      moneda1000 = new JLabel();
      ImageIcon imagen1000 = new ImageIcon("1000chelines.png");
      moneda1000.setBounds(660,470,50,50);
      moneda1000.setIcon(new ImageIcon(imagen1000.getImage().getScaledInstance(moneda1000.getWidth(),moneda1000.getHeight(),Image.SCALE_SMOOTH)));
      //MOVIMIENTO DE LA MONEDA
      Movement movimiento1000 = new Movement(moneda1000, this, billetera, expendedor);
      target.add(moneda1000);
   }

    @Override
     public int getValues(){
        return 1000;
     }

    @Override
    public int getSerie(){
        return Moneda1000.this.hashCode();
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 1000 \n Serie: "+ Moneda1000.this.hashCode();
     }

     @Override
     public JLabel getLabel(){
      return moneda1000;
     }

}