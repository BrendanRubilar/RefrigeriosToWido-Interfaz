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
    public JPanel panelExpendedora;
    JButton coca,fanta,sprite, comprar;
    JLabel BebidaSelec;
    String PrecioBebida;
    Expendedor expendedorMain; //Auxiliar...
    Movement movimiento500; //testing...
    Comprador comprador;
    int selectedB=9;

    public Ventana(){

        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Refrigerios ToWido");
        setResizable(false);

        iniciarPaneles();
        expendedorMain = new Expendedor(2,1000,panel1);
        PrecioBebida = String.valueOf(expendedorMain.getPrecio());
        comprador = new Comprador();        
        comprador.crearMonedas(0, 3, panel1,expendedorMain);
        comprador.crearMonedas(1, 3, panel1,expendedorMain);
        comprador.crearMonedas(2,3,panel1,expendedorMain);

        iniciarComponentes();

    }
    
    private void iniciarComponentes(){
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

        //Botón comprar
        comprar = new JButton();
        comprar.addActionListener(this);
        ImageIcon imagenComprar = new ImageIcon("botonCompra.png");
        comprar.setBounds(840,320,50,50);
        comprar.setIcon(new ImageIcon(imagenComprar.getImage().getScaledInstance(comprar.getWidth(),comprar.getHeight(),Image.SCALE_SMOOTH)));
        
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
        JLabel tapa = new JLabel();

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

        salidaMonedas.setBounds(420,500,70,70);
        salidaMonedas.setOpaque(true);
        salidaMonedas.setBackground(Color.black);

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
