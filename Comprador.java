
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comprador extends JLabel{

    Billetera billetera;
    JLabel moneda100,moneda500,moneda1000;
     
    //EL "COMPRADOR" genera monedas para comprar en la maquina...

    //0 = 100, 1 = 500, 2= 1000
    public Comprador(){
        billetera = new Billetera();
        
    }
    
    //Este metodo creará monedas y las muestra en pantalla...
    public void crearMonedas(int tipo, int cantidad, JPanel target, Expendedor expendedor,int auxiliar){

        if(tipo==0){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda100(target, billetera, expendedor,1000+i,auxiliar),0);
            }

        }else if(tipo==1){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda500(target, billetera, expendedor,2000+i),1);
            }
        }else if(tipo==2){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda1000(target, billetera, expendedor,3000+i),2);
            }
        }
    }

    public void crearMonedas(int tipo, int cantidad, JPanel target, Expendedor expendedor,int auxiliar, int serie){

        if(tipo==0){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda100(target, billetera, expendedor,serie,auxiliar),0);
            }

        }else if(tipo==1){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda500(target, billetera, expendedor,2000+i),1);
            }
        }else if(tipo==2){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda1000(target, billetera, expendedor,3000+i),2);
            }
        }
    }

}