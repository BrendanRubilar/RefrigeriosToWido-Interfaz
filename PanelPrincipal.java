package tarea.pkg3;

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
       SalidaBebidas.setBounds(0,0,300,200);
       SalidaBebidas.setBackground(Color.white);
       VentanaMain.add(SalidaBebidas);
       

       
    }
    
    //DIBUJAR EL JPANEL 
    public void paint (Graphics g) { 
        super.paint(g);
        
    }
    

    
}
