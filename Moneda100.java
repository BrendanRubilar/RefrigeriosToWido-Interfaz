import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;



class Moneda100 extends Moneda{
   JLabel moneda100;
   int serie;
   public Moneda100(){

   }
   public Moneda100(JPanel target, Billetera billetera, Expendedor expendedor,int serie, int auxiliar,JButton botonVuelto,JButton comprar){
      this.serie = serie;
      moneda100 = new JLabel();
      ImageIcon imagen100 = new ImageIcon("100pesos.png");
      if(auxiliar==0) moneda100.setBounds(780,470,50,50);
      if(auxiliar==1) moneda100.setBounds(420,485,50,50);
      moneda100.setIcon(new ImageIcon(imagen100.getImage().getScaledInstance(moneda100.getWidth(),moneda100.getHeight(),Image.SCALE_SMOOTH)));
      Movement movimiento100 = new Movement(moneda100, this, billetera, expendedor,botonVuelto,comprar);
      target.add(moneda100);
      target.setComponentZOrder(moneda100, 0);
      
   }

 
    @Override
     public int getValues(){
        return 100;
     }

    @Override
    public int getSerie(){
        return serie;
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 100 \n Serie: "+ Moneda100.this.hashCode();
     }

     @Override
     public JLabel getLabel(){
      return moneda100;
     }


}