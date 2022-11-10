import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;


class Moneda500 extends Moneda{

   JLabel moneda500;
   int serie;
   public Moneda500(JPanel target, Billetera billetera, Expendedor expendedor,int serie,JButton botonVuelto,JButton comprar){
      this.serie = serie;
      moneda500 = new JLabel();
      ImageIcon imagen500 = new ImageIcon("500pesos.png");
      moneda500.setBounds(720,470,50,50);
      moneda500.setIcon(new ImageIcon(imagen500.getImage().getScaledInstance(moneda500.getWidth(),moneda500.getHeight(),Image.SCALE_SMOOTH)));
      //MOVIMIENTO DE LA MONEDA
      Movement movimiento500 = new Movement(moneda500, this, billetera, expendedor,botonVuelto,comprar);
      target.add(moneda500);
      target.setComponentZOrder(moneda500, 0);


   }

    @Override
     public int getValues(){
        return 500;
     }

    @Override
    public int getSerie(){
        return serie;
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 500 \n Serie: "+ Moneda500.this.hashCode();
     }

     @Override
     public JLabel getLabel(){
      return moneda500;
     }


}