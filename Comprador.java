
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comprador extends JLabel{

    Billetera billetera;
    JLabel moneda100,moneda500;
     
    //EL "COMPRADOR" genera monedas para comprar en la maquina...

    //0 = 100, 1 = 500, 2= 1000
    public Comprador(){
        billetera = new Billetera();
        

    }
    
    //Este metodo creará monedas y las muestra en pantalla...
    public void crearMonedas(int tipo, int cantidad, JPanel target){

        if(tipo==0){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda100(target));
            }

        }else if(tipo==1){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda500(target));
            }
        }else if(tipo==2){

            for(int i=0;i<cantidad;i++){



            }

        }

    }
}