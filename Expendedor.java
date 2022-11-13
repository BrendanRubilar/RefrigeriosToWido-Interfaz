import java.util.Objects;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Expendedor extends JLabel{
    private Deposito fanta;
    private Deposito coca;
    private Deposito sprite;
    private DepositoMonedas vuelto;
    private DepositoMonedas Usadas;
    private int Precio;
    private Moneda monedaDepositada;
    private int cantidadDeMonedasAdevolver;
    public int cantidad;
    public JPanel target;
    
    public Expendedor(){

    }
    //La maquina tiene un deposito donde almacena el vuelto a entregar
    //Constructor del expendedor, se le entrega la cantidad de bebidas y el precio (Valores iguales para todos los depositos)
    public Expendedor(int cantidad, int precio,JPanel target) {
        if(cantidad>=6) cantidad=6;  //Controlar limite de bebidas por deposito
        int X=110;
        this.target=target;
        this.cantidad=cantidad;
        this.Precio = precio ;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        vuelto = new DepositoMonedas();
        Usadas = new DepositoMonedas();

        for (int i = 0; i < cantidad; i++) {
            coca.addBebida(new CocaCola(X,target,1000+i));
            fanta.addBebida(new Fanta(X,target,2000+i));
            sprite.addBebida(new Sprite(X,target,3000+i));
            X=X+50;
        }
    }

    public Boolean hayVuelto(){
        if(vuelto.listIsEmpty()==false){
            return true;
        }else{
            return false;
        }
    }

    public int CantidadDevolver(){
        return cantidadDeMonedasAdevolver;
    }

    public int getPrecio(){
        return this.Precio;
    }

    //Metodo devolver el vuelto (Debe ir eliminado de una en una moneda hasta retornar null)
    public void calcularVuelto(int valorDeLaMoneda){ 
        cantidadDeMonedasAdevolver = (valorDeLaMoneda-this.Precio)/100;
        //Este for entregara monedas de 100 en 100 hasta vaciar el deposito de Vuelto
        for (int i = 0; i < cantidadDeMonedasAdevolver; i++){
            vuelto.addMoneda(new Moneda100());
        }
    }

    public void entregarVuelto(){      
        vuelto.getMoneda();
    }

    public void moverBebida(Bebida bebida){
        Thread animar = new Thread(new AnimationBebida(bebida));
        animar.start();
    }

    public void rellenarBebidas(){
        int X=110;
        int Y=110;
        int Z=110;
        if(coca.hayBebidas()==false){
            for (int i = 0; i < cantidad; i++) {
                coca.addBebida(new CocaCola(X,target,10000+i));
                X=X+50;
                System.out.println("Se añadieron CocaColas"); 
            }
        }
        if(fanta.hayBebidas()==false){
            for (int i = 0; i < cantidad; i++) {
                fanta.addBebida(new Fanta(Y,target,20000+i));
                Y=Y+50;
                System.out.println("Se añadieron Fantas");
            }
        }
        if(sprite.hayBebidas()==false){
            for (int i = 0; i < cantidad; i++) {
                sprite.addBebida(new Sprite(Z,target,30000+i));
                Z=Z+50;
                System.out.println("Se añadieron Sprites");
            }
        }
        repaint();
    }

    public void sacarBebida(int bebidaSeleccionada){
            switch(bebidaSeleccionada){
                case 0: moverBebida(coca.getBebida());
                        System.out.println("Ha comprado una Coca-Cola");
                        break;

                case 1: moverBebida(fanta.getBebida());
                        System.out.println("Ha comprado una Fanta");
                        break;

                case 2: moverBebida(sprite.getBebida());
                        System.out.println("Ha comprado una Sprite");
                        break;
            }
    }
    
    public void recibirMoneda(Moneda moneda){
        monedaDepositada = moneda;
    }

    public int valorMoneda(){
        return monedaDepositada.getValues();
    }

    public int getSerie(){
        return monedaDepositada.getSerie();
    }

    //Este se invoca desde el constructor de Comprador
    public void comprarBebida(int bebidaSeleccionada){
   
        //Lo primero que se debe hacer es verificar si la moneda es nula, de ser así no se sigue ejecutando el codigo
        if( Objects.isNull(monedaDepositada)){
            try{
                throw new Error3Exception("Error: Moneda es Nula");
            }catch(Error3Exception msg3){
                System.out.println(msg3.getMessage());
            }
        }else{
            //Este fragmento de codigo nos seleccionara el deposito de bebidas al que queremos acceder
            boolean booleanAux=false;
            switch(bebidaSeleccionada){
              case 0: booleanAux= coca.hayBebidas();
                        break;
             case 1: booleanAux= fanta.hayBebidas();
                        break;
             case 2: booleanAux= sprite.hayBebidas();
            }
            //Este codigo está encargado de verificar todos los casos y realizar la compra de la bebida
            if(monedaDepositada.getValues() == this.Precio && booleanAux){
                sacarBebida(bebidaSeleccionada);
                Usadas.addMoneda(monedaDepositada); //Enviar la moneda usada al deposito de monedas Usadas
                this.recibirMoneda(null);

            }else if(monedaDepositada.getValues() > this.Precio){
                if(booleanAux){
                    calcularVuelto(monedaDepositada.getValues());
                    sacarBebida(bebidaSeleccionada);
                    Usadas.addMoneda(monedaDepositada);  //Enviar la moneda usada al deposito de monedas Usadas
                    this.recibirMoneda(null);

                }else{
                    try{
                       switch(bebidaSeleccionada){
                        case 0:
                            throw new Error3Exception("Error: No queda CocaCola");
                        case 1:
                            throw new Error3Exception("Error: No queda Fanta");
                        case 2:
                            throw new Error3Exception("Error: No queda Sprite");
                        default:
                            throw new Error3Exception("Seleccione una bebida valida");
                        }
                    }catch(Error3Exception msg3){
                        if(bebidaSeleccionada==0||bebidaSeleccionada==1||bebidaSeleccionada==2){
                            monedaDepositada.getLabel().setLocation(420,485);
                            monedaDepositada.getLabel().setVisible(true);
                            repaint();
                        }
                        System.out.println(msg3.getMessage());
                    }
                }
            }else{ 
                try{
                    if(monedaDepositada.getValues() < this.Precio){
                        throw new Error1Exception("Error: No hay saldo suficiente");
                    }
                }catch(Error1Exception e){
                        monedaDepositada.getLabel().setLocation(420,485);
                        monedaDepositada.getLabel().setVisible(true);
                        repaint();
                        System.out.println(e.getMessage());
                }
            }   
        }
    }    
}
