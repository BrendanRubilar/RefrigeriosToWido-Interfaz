import java.util.Objects;

import javax.swing.JLabel;
import javax.swing.JPanel;


class Expendedor extends JLabel{
    private Deposito fanta;
    private Deposito coca;
    private Deposito sprite;
    private DepositoMonedas vuelto;
    private int Precio;
    private Moneda monedaDepositada;


    public Expendedor(){

    }
    
    //La maquina tiene un deposito donde almacena el vuelto a entregar
    //Constructor del expendedor, se le entrega la cantidad de bebidas y el precio (Valores iguales para todos los depositos)
    public Expendedor(int cantidad, int precio,JPanel target) {

        if(cantidad>=8) cantidad=8;  //Controlar limite de bebidas por deposito
        int X=110;
        
        this.Precio = precio ;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        vuelto = new DepositoMonedas();

        for (int i = 0; i < cantidad; i++) {
            coca.addBebida(new CocaCola(X,target,1000+i));
            sprite.addBebida(new Sprite(X,target,2000+i));
            fanta.addBebida(new Fanta(X,target,3000+i));
            X=X+50;
        }



    }


    public int getPrecio(){
        return this.Precio;
    }

    //Metodo devolver el vuelto (Debe ir eliminado de una en una moneda hasta retornar null)
    public void calcularVuelto(int valorDeLaMoneda){
        
        int cantidadDeMonedadsAdevolver = (valorDeLaMoneda-this.Precio)/100;
        

        //Este for entregara monedas de 100 en 100 hasta vaciar el deposito de Vuelto
        for (int i = 0; i < cantidadDeMonedadsAdevolver; i++){
            vuelto.addMoneda(new Moneda100());

        }

    }

    public void texto(){
        if(vuelto.listIsEmpty()==false){
            System.out.println("Recibiste $100"); 
        }else{
            System.out.println("No hay vuelto");
        }
    }

    public void entregarVuelto(){
        texto();
        vuelto.getMoneda();
    }

    public void moverBebida(Bebida bebida){


        Thread animar = new Thread(new AnimationBebida(bebida));
        animar.start();

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

    //Este se invoca desde el constructor de Comprador
    public void comprarBebida(int bebidaSeleccionada){
        //Lo primero que se debe hacer es verificar si la moneda es nula, de ser así no se sigue ejecutando el codigo
        if( Objects.isNull(monedaDepositada)){
            try{
                throw new Error3Exception("Moneda es Nula");
            }catch(Error3Exception msg3){
                System.out.println(msg3.getMessage());
            }
        }else{
            //Este fragmento de codigo nos seleccionara el deposito de bebidas al que queremos acceder
            boolean booleanAux=false;
            switch(bebidaSeleccionada){
              case 0: booleanAux= coca.hayBebidas();
                        break;
             case 1: booleanAux= sprite.hayBebidas();
                        break;
             case 2: booleanAux= fanta.hayBebidas();
            }

            //Este codigo está encargado de verificar todos los casos y realizar la compra de la bebida
            if(monedaDepositada.getValues() == this.Precio && booleanAux){
                sacarBebida(bebidaSeleccionada);
                this.recibirMoneda(null);


            }else if(monedaDepositada.getValues() >= this.Precio){

             if(booleanAux){
                sacarBebida(bebidaSeleccionada);
                this.recibirMoneda(null);
                calcularVuelto(monedaDepositada.getValues());
                }else{
                  try{
                       switch(bebidaSeleccionada){
                        case 0:
                            throw new Error3Exception("No queda CocaCola");
                        case 1:
                            throw new Error3Exception("No queda Sprite");
                        case 2:
                            throw new Error3Exception("No queda Fanta");
                        default:
                            throw new Error3Exception("Seleccione una bebida valida");
                    }
                    }catch(Error3Exception msg3){
                        System.out.println(msg3.getMessage());
                    }
                }
            }else{ 
                try{
                    if(monedaDepositada.getValues() < this.Precio){
                        throw new Error1Exception("No hay saldo suficiente");
                    }
                }catch(Error1Exception e){
                    System.out.println(e.getMessage());
                }
            }   
        }
    }    
}
