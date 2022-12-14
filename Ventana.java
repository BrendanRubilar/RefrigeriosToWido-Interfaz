import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.Point;

public class Ventana extends JFrame implements ActionListener{

    JPanel panel1;
    JButton coca, fanta, sprite, comprar, botonVuelto, rellenarExpendedor;
    JLabel BebidaSelec, monedaV,verCoca, verFanta, verSprite;
    String PrecioBebida;
    Expendedor expendedorMain; 
    Movement movimiento500; 
    Comprador comprador;
    int selectedB=9;
    boolean compraEfectuada = false;
    
    public Ventana(){
        //Cambiar imagen del cursor
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("manoDe.png");
        Cursor c = toolkit.createCustomCursor(image , new Point(this.getX(), this.getY()), "img");
        this.setCursor (c);

        //Propiedade de la ventana
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Refrigerios ToWido");
        setResizable(false);

        //Iniciar paneles y componenetes
        iniciarPaneles();
        expendedorMain = new Expendedor(6,200,panel1);
        PrecioBebida = String.valueOf(expendedorMain.getPrecio());
        iniciarComponentes(); 
        comprador = new Comprador(botonVuelto,comprar); 
        comprador.crearMonedas(0, 4, panel1,expendedorMain,0,botonVuelto,comprar);
        comprador.crearMonedas(1, 4, panel1,expendedorMain,0,botonVuelto,comprar);
        comprador.crearMonedas(2,4,panel1,expendedorMain,0,botonVuelto,comprar);

        this.setVisible(true);
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
        //Bot??n comprar
        comprar = new JButton();
        comprar.addActionListener(this);
        ImageIcon imagenComprar = new ImageIcon("botonCompra.png");
        comprar.setBounds(770,300,55,55);
        comprar.setIcon(new ImageIcon(imagenComprar.getImage().getScaledInstance(comprar.getWidth(),comprar.getHeight(),Image.SCALE_SMOOTH)));
        //Bot??n vuelto
        botonVuelto = new JButton();
        botonVuelto.addActionListener(this);
        ImageIcon imagenVuelto = new ImageIcon("Vuelto.jpeg");
        botonVuelto.setBounds(860,300,55,55);
        botonVuelto.setIcon(new ImageIcon(imagenVuelto.getImage().getScaledInstance(botonVuelto.getWidth(),botonVuelto.getHeight(),Image.SCALE_SMOOTH)));
        botonVuelto.setMnemonic('b');
        //Bot??n cocacola
        coca = new JButton();
        coca.addActionListener(this);
        ImageIcon imagenCoca = new ImageIcon("coca.png");
        coca.setBounds(680,200,55,55);
        coca.setIcon(new ImageIcon(imagenCoca.getImage().getScaledInstance(coca.getWidth(),coca.getHeight(),Image.SCALE_SMOOTH)));
        //Boton fanta
        fanta = new JButton();
        fanta.addActionListener(this);
        ImageIcon imagenFanta = new ImageIcon("fanta.png");
        fanta.setBounds(770,200,55,55);
        fanta.setIcon(new ImageIcon(imagenFanta.getImage().getScaledInstance(fanta.getWidth(),fanta.getHeight(),Image.SCALE_SMOOTH)));
        //Boton sprite
        sprite = new JButton();
        sprite.addActionListener(this);
        ImageIcon imagenSprite = new ImageIcon("sprite.png");
        sprite.setBounds(860,200,55,55);
        sprite.setIcon(new ImageIcon(imagenSprite.getImage().getScaledInstance(sprite.getWidth(),sprite.getHeight(),Image.SCALE_SMOOTH)));
        // Boton Rellenar coca
        rellenarExpendedor = new JButton();
        ImageIcon botonRefill = new ImageIcon("botonRefill.png");
        rellenarExpendedor.setBounds(0, 0, 595, 100);
        rellenarExpendedor.setEnabled(true);
        rellenarExpendedor.addActionListener(this);
        rellenarExpendedor.setIcon(new ImageIcon(botonRefill.getImage().getScaledInstance(rellenarExpendedor.getWidth(),rellenarExpendedor.getHeight(),Image.SCALE_SMOOTH)));
        //Agregamos los botones al panel
        panel1.add(botonVuelto);
        panel1.add(comprar);
        panel1.add(coca);
        panel1.add(fanta);
        panel1.add(sprite);
        panel1.add(rellenarExpendedor);
    }
    private void iniciarEtiquetas(){
        //Creamos todas las etiquetas y las definimos
        JLabel refill = new JLabel("Recarga bebidas");
        JLabel Precio = new JLabel();
        JLabel insertarMoneda = new JLabel();
        JLabel color1 = new JLabel();
        JLabel color2 = new JLabel();
        JLabel salidaBebida = new JLabel();
        JLabel salidaMonedas = new JLabel();
        JLabel marcoTexto = new JLabel();
        JLabel marcoTexto2 = new JLabel();
        JLabel lineaB = new JLabel();
        JLabel lineaB2 = new JLabel();
        JLabel inventarioBebidas = new JLabel();
        BebidaSelec = new JLabel();
        verCoca = new JLabel();
        verFanta = new JLabel();
        verSprite = new JLabel();

        inventarioBebidas.setBounds(605,450,380,400);
        ImageIcon imagenInventario = new ImageIcon("madera.jpg");
        inventarioBebidas.setIcon(new ImageIcon(imagenInventario.getImage().getScaledInstance(inventarioBebidas.getWidth(),inventarioBebidas.getHeight(),Image.SCALE_SMOOTH)));
        
        refill.setBounds(0,0,595,70);
        refill.setFont(new Font("Cascadia Mono SemiBold", Font.BOLD, 14));

        ImageIcon imagenInsertarMoneda = new ImageIcon("insertarMoneda.jpeg");
        insertarMoneda.setBounds(680,300,55,70); 
        insertarMoneda.setIcon(new ImageIcon(imagenInsertarMoneda.getImage().getScaledInstance(insertarMoneda.getWidth(),insertarMoneda.getHeight(),Image.SCALE_SMOOTH)));

        ImageIcon lineaM = new ImageIcon("lineaB.jpg");
        lineaB.setBounds(595,0,10,720);
        lineaB.setIcon(new ImageIcon(lineaM.getImage()));

        lineaB2.setBounds(595,440,390,10);
        lineaB2.setIcon(new ImageIcon(lineaM.getImage()));

        ImageIcon imagenMarco = new ImageIcon("marcoTexto.png");
        marcoTexto.setBounds(610,90,356, 50);
        marcoTexto.setIcon(new ImageIcon(imagenMarco.getImage().getScaledInstance(marcoTexto.getWidth(),marcoTexto.getHeight(),Image.SCALE_SMOOTH)));

        marcoTexto2.setBounds(610,36,356, 50);
        marcoTexto2.setIcon(new ImageIcon(imagenMarco.getImage().getScaledInstance(marcoTexto2.getWidth(),marcoTexto2.getHeight(),Image.SCALE_SMOOTH)));

        Precio.setBounds(648,97,278, 37);
        Precio.setOpaque(true);
        Precio.setBackground(Color.white);
        Precio.setText(" PRECIO BEBIDA: $"+ PrecioBebida);
        Precio.setFont(new Font("Cascadia Mono SemiBold", Font.BOLD, 14));

        BebidaSelec.setBounds(648,43,278,37);
        BebidaSelec.setOpaque(true);
        BebidaSelec.setBackground(Color.white);
        BebidaSelec.setText(" BEBIDA SELECCIONADA:        ");
        BebidaSelec.setFont(new Font("Cascadia Mono SemiBold", Font.BOLD, 14));

        ImageIcon cajaExpendedor = new ImageIcon("cajita.jpg");
        color1.setBounds(0,0,600,700);
        color1.setIcon(new ImageIcon(cajaExpendedor.getImage().getScaledInstance(color1.getWidth(),color1.getHeight(),Image.SCALE_SMOOTH)));

        ImageIcon cajaExpendedor2 = new ImageIcon("cajita2.jpg");
        color2.setBounds(600,0,400,700);
        color2.setIcon(new ImageIcon(cajaExpendedor2.getImage().getScaledInstance(color2.getWidth(),color2.getHeight(),Image.SCALE_SMOOTH)));
        
        ImageIcon cajaB = new ImageIcon("cajaBebidas.jpg");

        verCoca.setBounds(100,145,325,55);
        verCoca.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(verCoca.getWidth(),verCoca.getHeight(),Image.SCALE_SMOOTH)));
        
        verFanta.setBounds(100,245,325,55);
        verFanta.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(verFanta.getWidth(),verFanta.getHeight(),Image.SCALE_SMOOTH)));
        
        verSprite.setBounds(100,345,325,55);
        verSprite.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(verSprite.getWidth(),verSprite.getHeight(),Image.SCALE_SMOOTH)));
        
        salidaBebida.setBounds(100,485,325,70);
        salidaBebida.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(salidaBebida.getWidth(),salidaBebida.getHeight(),Image.SCALE_SMOOTH)));

        salidaMonedas.setBounds(445,485,70,70);
        salidaMonedas.setIcon(new ImageIcon(cajaB.getImage().getScaledInstance(salidaMonedas.getWidth(),salidaMonedas.getHeight(),Image.SCALE_SMOOTH)));
        
        //Se a??aden las etiquetas al panel
        panel1.add(inventarioBebidas);
        panel1.add(refill);
        panel1.add(Precio);
        panel1.add(BebidaSelec);
        panel1.add(lineaB);
        panel1.add(lineaB2);
        panel1.add(marcoTexto);
        panel1.add(marcoTexto2);        
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
        if(e.getSource()==botonVuelto){//PARA DEVOLVER DE 100
            if(expendedorMain.hayVuelto()){
                for(int i=0; i < expendedorMain.CantidadDevolver() ; i++){
                    expendedorMain.entregarVuelto(); 
                    comprador.crearMonedas(3, 1, panel1,expendedorMain,1,botonVuelto,comprar);
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
        if(e.getSource()==rellenarExpendedor){
            expendedorMain.rellenarBebidas();
            repaint();
        }
    }
}
