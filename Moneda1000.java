import javax.swing.JPanel;



class Moneda1000 extends Moneda{

   public Moneda1000(JPanel target){

                      //Falta imagen, editar codigo
                /*moneda1000 = new JLabel();
                ImageIcon image1000 = new ImageIcon( );
                moneda1000.setBounds(700,470,50,50);
                moneda1000.setIcon(new ImageIcon(imagen1000.getImage().getScaledInstance(moneda1000.getWidth(),moneda1000.getHeight(),Image.SCALE_SMOOTH)));
                */

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


}