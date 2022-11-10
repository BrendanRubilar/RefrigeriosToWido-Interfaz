import java.awt.event.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener{

    
    public JPanel panel1;
    public JPanel panel2;
    JButton coca, fanta, sprite, comprar, botonVuelto;
    JLabel BebidaSelec, monedaV;
    String PrecioBebida;
    Expendedor expendedorMain; //Auxiliar...
    Movement movimiento500; //testing...
    Comprador comprador;
    int selectedB=9;
    boolean compraEfectuada = false;

    public Ventana(){

        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Refrigerios ToWido");
        setResizable(false);

        iniciarPaneles();
        expendedorMain = new Expendedor(4,500,panel1);
        PrecioBebida = String.valueOf(expendedorMain.getPrecio());
        iniciarComponentes(); 

        comprador = new Comprador(botonVuelto,comprar); 
        comprador.crearMonedas(0, 4, panel1,expendedorMain,0,botonVuelto,comprar);
        comprador.crearMonedas(1, 4, panel1,expendedorMain,0,botonVuelto,comprar);
        comprador.crearMonedas(2,4,panel1,expendedorMain,0,botonVuelto,comprar);
        

    }
    
    private void iniciarComponentes(){
        iniciarBotones();
        iniciarEtiquetas();
    }
    
    private void iniciarPaneles(){
        panel1 = new JPanel();  
        panel1.setLayout(null);
        getContentPane().add(panel1);





    }
    
    private void iniciarBotones(){

        //Botón comprar
        comprar = new JButton();
        comprar.addActionListener(this);
        ImageIcon imagenComprar = new ImageIcon("botonCompra.png");
        comprar.setBounds(800,320,50,50);
        comprar.setIcon(new ImageIcon(imagenComprar.getImage().getScaledInstance(comprar.getWidth(),comprar.getHeight(),Image.SCALE_SMOOTH)));

        //Botón vuelto
        botonVuelto = new JButton();
        botonVuelto.addActionListener(this);
        ImageIcon imagenVuelto = new ImageIcon("Vuelto.jpeg");
        botonVuelto.setBounds(890,320,50,50);
        botonVuelto.setIcon(new ImageIcon(imagenVuelto.getImage().getScaledInstance(botonVuelto.getWidth(),botonVuelto.getHeight(),Image.SCALE_SMOOTH)));

        //Botón cocacola
        coca = new JButton();
        coca.addActionListener(this);
        ImageIcon imagenCoca = new ImageIcon("coca.png");
        coca.setBounds(700,200,50,50);
        coca.setIcon(new ImageIcon(imagenCoca.getImage().getScaledInstance(coca.getWidth(),coca.getHeight(),Image.SCALE_SMOOTH)));

        // Boton fanta
        fanta = new JButton();
        fanta.addActionListener(this);
        ImageIcon imagenFanta = new ImageIcon("fanta.jpg");
        fanta.setBounds(770,200,50,50);
        fanta.setIcon(new ImageIcon(imagenFanta.getImage().getScaledInstance(fanta.getWidth(),fanta.getHeight(),Image.SCALE_SMOOTH)));
        
        // Boton sprite
        sprite = new JButton();
        sprite.addActionListener(this);
        ImageIcon imagenSprite = new ImageIcon("sprite.png");
        sprite.setBounds(840,200,50,50);
        sprite.setIcon(new ImageIcon(imagenSprite.getImage().getScaledInstance(sprite.getWidth(),sprite.getHeight(),Image.SCALE_SMOOTH)));
        
        panel1.add(botonVuelto);
        panel1.add(comprar);
        panel1.add(coca);
        panel1.add(fanta);
        panel1.add(sprite);
   
    }
    private void iniciarEtiquetas(){
        BebidaSelec = new JLabel();
        JLabel Precio = new JLabel();
        JLabel insertarMoneda = new JLabel();
        JLabel color1 = new JLabel();
        JLabel color2 = new JLabel();
        JLabel verCoca = new JLabel();
        JLabel verFanta = new JLabel();
        JLabel verSprite = new JLabel();
        JLabel salidaBebida = new JLabel();
        JLabel salidaMonedas = new JLabel();

        ImageIcon imagenInsertarMoneda = new ImageIcon("insertarMoneda.jpeg");
        insertarMoneda.setBounds(700,300,50,70); 
        insertarMoneda.setIcon(new ImageIcon(imagenInsertarMoneda.getImage().getScaledInstance(insertarMoneda.getWidth(),insertarMoneda.getHeight(),Image.SCALE_SMOOTH)));

        Precio.setBounds(620,80,240, 40);
        Precio.setOpaque(true);
        Precio.setBackground(Color.white);
        Precio.setText(" PRECIO BEBIDA: $"+ PrecioBebida);

        BebidaSelec.setBounds(620,30,240,40);
        BebidaSelec.setOpaque(true);
        BebidaSelec.setBackground(Color.white);
        BebidaSelec.setText(" BEBIDA SELECCIONADA:        ");

        ImageIcon cajaExpendedor = new ImageIcon("cajita.jpg");
        color1.setBounds(0,0,600,700);
        color1.setIcon(new ImageIcon(cajaExpendedor.getImage().getScaledInstance(color1.getWidth(),color1.getHeight(),Image.SCALE_SMOOTH)));

        ImageIcon cajaExpendedor2 = new ImageIcon("cajita2.jpg");
        color2.setBounds(600,0,400,700);
        color2.setIcon(new ImageIcon(cajaExpendedor2.getImage().getScaledInstance(color2.getWidth(),color2.getHeight(),Image.SCALE_SMOOTH)));
        
        ImageIcon cajaB = new ImageIcon("cajaBebidas.jpg");

        verCoca.setBounds(100,95,400,55);
        verCoca.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(verCoca.getWidth(),verCoca.getHeight(),Image.SCALE_SMOOTH)));
        
        verFanta.setBounds(100,195,400,55);
        verFanta.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(verFanta.getWidth(),verFanta.getHeight(),Image.SCALE_SMOOTH)));
        
        verSprite.setBounds(100,295,400,55);
        verSprite.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(verSprite.getWidth(),verSprite.getHeight(),Image.SCALE_SMOOTH)));
        
        salidaBebida.setBounds(100,485,300,70);
        salidaBebida.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(salidaBebida.getWidth(),salidaBebida.getHeight(),Image.SCALE_SMOOTH)));

        salidaMonedas.setBounds(420,485,70,70);
        salidaMonedas.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(salidaMonedas.getWidth(),salidaMonedas.getHeight(),Image.SCALE_SMOOTH)));
        

        panel1.add(Precio);
        panel1.add(BebidaSelec);        
        panel1.add(insertarMoneda);
        panel1.add(color2);
        panel1.add(verCoca);
        panel1.add(verFanta);
        panel1.add(verSprite);
        panel1.add(salidaMonedas);
        panel1.add(salidaBebida);
        panel1.add(color1);

    }

    //CONTROL DE LOS BOTONES
    @Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==coca) {
            BebidaSelec.setText(" BEBIDA SELECCIONADA: COCA-COLA");
            selectedB=0;
        }
        if(e.getSource()==fanta){
            BebidaSelec.setText(" BEBIDA SELECCIONADA: FANTA");
            selectedB=1;
            
        }
        if(e.getSource()==sprite){
            BebidaSelec.setText(" BEBIDA SELECCIONADA: SPRITE");
            selectedB=2;

        }

        if(e.getSource()==botonVuelto){ //PARA DEVOLVER DE 100

            //Bandera
            if(expendedorMain.hayVuelto()){

                for(int i=0; i < expendedorMain.CantidadDevolver() ; i++){
                    expendedorMain.entregarVuelto(); 
                    comprador.crearMonedas(0, 1, panel1,expendedorMain,1,botonVuelto,comprar);
                    repaint();

                }


            } 

            
        }

        if(e.getSource()==comprar){

            switch(selectedB){
                case 0:
                    System.out.println("Recibiendo Coca");
                    expendedorMain.comprarBebida(selectedB);
                    break;

                case 1: 
                    System.out.println("Recibiendo Fanta");    
                    expendedorMain.comprarBebida(selectedB);

                    break;

                case 2: 
                    System.out.println("Recibiendo Sprite");
                    expendedorMain.comprarBebida(selectedB);

                    break;

                default: 
                    System.out.println("Seleccione una bebida");
                    break;
            }
        
        }

    }

}
