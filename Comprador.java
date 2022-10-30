package Tarea3;
import java.awt.*;
import javax.swing.*;

public class Comprador extends JPanel{
    
    

    public void paint (Graphics g) { 
        super.paint(g);
    }
        
    //Al crear el cliente, comprará la bebida con los datos que se le indiquen.
    public Comprador(Moneda moneda, int bebidaElegida, Expendedor expendedorQueUsara){
        
        InitInterfaz();
        expendedorQueUsara.comprarBebida(moneda, bebidaElegida);
    }
    
    public Comprador(){
        
        InitInterfaz();
    }
    
    public void InitInterfaz(){
                
       this.setBounds(500,10,275,750);
       this.setBackground(Color.green);
       JButton botonCoca = new JButton();
       botonCoca.setBounds(10,0,50,50);
       this.add(botonCoca);
       JButton botonSprite = new JButton();
       botonSprite.setBounds(70,0,50,50);
       this.add(botonSprite);
       JButton botonFanta = new JButton();
       botonFanta.setBounds(130,0,50,50);
       this.add(botonFanta);

    }

    /*Entendemos que no se solita un metodo para comprar bebida, sin embargo nos parece importante poder realizar esta
    acción fuera del constructor. */
    public void ClienteCompraBebida(Moneda moneda, int bebidaElegida,Expendedor expendedorQueUsara){
        expendedorQueUsara.comprarBebida(moneda, bebidaElegida);
    }
}