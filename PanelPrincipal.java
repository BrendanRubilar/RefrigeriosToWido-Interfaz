package Tarea3;

import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel{
    
    private Expendedor exp; 
    private Comprador com; 
    
    public PanelPrincipal(JFrame VentanaMain){
       exp = new Expendedor(2,200);
       com = new Comprador();
       
       //PROPIEDADES DEL JPANEL
       this.setBackground(Color.red);
       this.setBounds(0,0, 800, 800); //X,Y Iniciales, Tamaño
       
       VentanaMain.add(exp);
       VentanaMain.add(com);
       
       //JPanel extras para limitar areas
       JPanel SalidaBebidas = new JPanel();
       SalidaBebidas.setBounds(150,600,200,100);
       SalidaBebidas.setBackground(Color.white);    
       exp.add(SalidaBebidas);

       Movement mv = new Movement(SalidaBebidas.getComponents());

       //JPanel Deposito monedas 
       JPanel DepositoMonedas = new JPanel();
       DepositoMonedas.setBounds(100,600,100,300);
       DepositoMonedas.setBackground(Color.white);    
       com.add(DepositoMonedas);


       
       
    }
    
    //DIBUJAR EL JPANEL 
    public void paint (Graphics g) { 
        super.paint(g);
        
    }

}
