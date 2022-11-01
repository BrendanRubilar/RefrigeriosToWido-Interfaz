package Tarea3;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    public JPanel panel1;
    public JPanel panelExpendedora;
    
    public Ventana(){
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Refrigerios ToWido");
        setResizable(false);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        iniciarPaneles();
        iniciarBotones();
        iniciarEtiquetas();
    }
    
    private void iniciarPaneles(){
        panel1 = new JPanel();
        panelExpendedora = new JPanel();
        panelExpendedora.setLayout(null);
        panel1.setLayout(null);
        getContentPane().add(panel1);
    }
    
    private void iniciarBotones(){
        
        //Botón cocacola
        JButton coca = new JButton();
        ImageIcon imagenCoca = new ImageIcon("coca.png");
        coca.setBounds(700,200,50,50);
        coca.setIcon(new ImageIcon(imagenCoca.getImage().getScaledInstance(coca.getWidth(),coca.getHeight(),Image.SCALE_SMOOTH)));
        
        // Boton fanta
        JButton fanta = new JButton();
        ImageIcon imagenFanta = new ImageIcon("fanta.jpg");
        fanta.setBounds(770,200,50,50);
        fanta.setIcon(new ImageIcon(imagenFanta.getImage().getScaledInstance(fanta.getWidth(),fanta.getHeight(),Image.SCALE_SMOOTH)));
        
        // Boton sprite
        JButton sprite = new JButton();
        ImageIcon imagenSprite = new ImageIcon("sprite.png");
        sprite.setBounds(840,200,50,50);
        sprite.setIcon(new ImageIcon(imagenSprite.getImage().getScaledInstance(sprite.getWidth(),sprite.getHeight(),Image.SCALE_SMOOTH)));
        
        JButton insertarMoneda = new JButton();
        ImageIcon imagenInsertarMoneda = new ImageIcon("insertarMoneda.jpeg");
        insertarMoneda.setBounds(700,300,50,70);
        insertarMoneda.setIcon(new ImageIcon(imagenInsertarMoneda.getImage().getScaledInstance(insertarMoneda.getWidth(),insertarMoneda.getHeight(),Image.SCALE_SMOOTH)));
        
        JButton moneda100 = new JButton();
        ImageIcon imagen100 = new ImageIcon("100pesos.png");
        moneda100.setBounds(700,400,50,50);
        moneda100.setIcon(new ImageIcon(imagen100.getImage().getScaledInstance(moneda100.getWidth(),moneda100.getHeight(),Image.SCALE_SMOOTH)));
        
        panel1.add(coca);
        panel1.add(fanta);
        panel1.add(sprite);
        panel1.add(insertarMoneda);
        panel1.add(moneda100);
    }
    private void iniciarEtiquetas(){
        JLabel color1 = new JLabel();
        JLabel color2 = new JLabel();
        JLabel verCoca = new JLabel();
        JLabel verFanta = new JLabel();
        JLabel verSprite = new JLabel();
        JLabel salidaBebida = new JLabel();
        JLabel lataCoca = new JLabel();
        JLabel moneda500 = new JLabel();
        
        ImageIcon imagenLataCoca = new ImageIcon("lataCoca.png");
        lataCoca.setBounds(110,105,50,40);
        lataCoca.setIcon(new ImageIcon(imagenLataCoca.getImage().getScaledInstance(lataCoca.getWidth(),lataCoca.getHeight(),Image.SCALE_SMOOTH)));
        
        ImageIcon imagen500 = new ImageIcon("500pesos.png");
        moneda500.setBounds(700,470,50,50);
        moneda500.setIcon(new ImageIcon(imagen500.getImage().getScaledInstance(moneda500.getWidth(),moneda500.getHeight(),Image.SCALE_SMOOTH)));
        
        color1.setBounds(0,0,600,700);
        color1.setOpaque(true);
        color1.setBackground(Color.gray);
        
        color2.setBounds(600,0,400,700);
        color2.setOpaque(true);
        color2.setBackground(Color.black);
        
        verCoca.setBounds(100,100,400,50);
        verCoca.setOpaque(true);
        verCoca.setBackground(Color.blue);
        
        verFanta.setBounds(100,200,400,50);
        verFanta.setOpaque(true);
        verFanta.setBackground(Color.blue);
        
        verSprite.setBounds(100,300,400,50);
        verSprite.setOpaque(true);
        verSprite.setBackground(Color.blue);
        
        salidaBebida.setBounds(200,500,200,70);
        salidaBebida.setOpaque(true);
        salidaBebida.setBackground(Color.black);
        
        panel1.add(moneda500);        
        panel1.add(color2);
        panel1.add(lataCoca);
        panel1.add(verFanta);
        panel1.add(verCoca);
        panel1.add(verSprite);
        panel1.add(salidaBebida);
        panel1.add(color1);
    }
}
