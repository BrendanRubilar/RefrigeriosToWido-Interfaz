package Tarea3;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        //PROPIEDADES DE LA VENTANA
        this.setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Refrigerios ToWido");
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);  //HACEMOS LA VENTANA VISIBLE

        //LA CLASE VENTANA CREA UN PANEL PRINCIPAL, A ESTE PANEL SE LE ENVIA POR CONSTRUCTOR LA MISMA VENTANA
        //Ya que este panel agregara los paneles del expendedor y el comprador a la ventana...
        PanelPrincipal panel = new PanelPrincipal(this);
        this.add(panel); //SE AÑADED ESTE JPANEL AL JFRAME VENTANA (Junto a expendedor y comprador)
        
    }
    
    public void paint (Graphics g) { 
        super.paint(g);
    }   
    



}
