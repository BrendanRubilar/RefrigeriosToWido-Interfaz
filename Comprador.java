package Tarea3;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comprador extends JLabel{

    JLabel moneda100,moneda500;
     
    //EL "COMPRADOR" genera monedas para comprar en la maquina...

    //0 = 100, 1 = 500, 2= 1000
    public Comprador(){
    
    }
    
    //Este metodo creará monedas y las muestra en pantalla...
    public void crearMonedas(int tipo, int cantidad, JPanel target){

        if(tipo==0){

            for(int i=0;i<cantidad;i++){
            
               
                moneda100 = new JLabel();
                ImageIcon imagen100 = new ImageIcon("100pesos.png");
                moneda100.setBounds(785,470,50,50);
                moneda100.setIcon(new ImageIcon(imagen100.getImage().getScaledInstance(moneda100.getWidth(),moneda100.getHeight(),Image.SCALE_SMOOTH)));
                Movement movimiento100 = new Movement(moneda100);
                target.add(moneda100);

            }

        }else if(tipo==1){

            for(int i=0;i<cantidad;i++){

                moneda500 = new JLabel();
                ImageIcon imagen500 = new ImageIcon("500pesos.png");
                moneda500.setBounds(700,470,50,50);
                moneda500.setIcon(new ImageIcon(imagen500.getImage().getScaledInstance(moneda500.getWidth(),moneda500.getHeight(),Image.SCALE_SMOOTH)));
                //MOVIMIENTO DE LA MONEDA
                Movement movimiento500 = new Movement(moneda500);
                target.add(moneda500);

            }
        }else if(tipo==2){
                //Falta imagen, editar codigo
                /*moneda1000 = new JLabel();
                ImageIcon image1000 = new ImageIcon( );
                moneda1000.setBounds(700,470,50,50);
                moneda1000.setIcon(new ImageIcon(imagen1000.getImage().getScaledInstance(moneda1000.getWidth(),moneda1000.getHeight(),Image.SCALE_SMOOTH)));
                */
        }
    }
}