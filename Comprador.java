import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comprador extends JLabel{

    Billetera billetera;
    JLabel moneda100,moneda500,moneda1000;
    JButton botonVuelto;
    JButton comprar;
     
    //EL "COMPRADOR" genera monedas para comprar en la maquina...

    //0 = 100, 1 = 500, 2= 1000
    public Comprador(JButton botonVuelto, JButton comprar){
        this.botonVuelto = botonVuelto;
        this.comprar = comprar;
        billetera = new Billetera();
        
    }
    
    //Este metodo creará monedas y las muestra en pantalla...
    public void crearMonedas(int tipo, int cantidad, JPanel target, Expendedor expendedor,int auxiliar, JButton botonVuelto, JButton comprar){
        Random r =new Random();
        int j_aux = r.nextInt(10000);    
        if(tipo==0){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda100(target, billetera, expendedor,1000+i,auxiliar,botonVuelto,comprar),0);
            }

        }else if(tipo==1){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda500(target, billetera, expendedor,2000+i,botonVuelto,comprar),1);
            }
        }else if(tipo==2){

            for(int i=0;i<cantidad;i++){
                billetera.addMoneda(new Moneda1000(target, billetera, expendedor,3000+i,botonVuelto,comprar),2);
            }
        }else if(tipo==3){
//monedas de vuelto
            for(int i=0;i<cantidad;i++){
                
                billetera.addMoneda(new Moneda100(target, billetera, expendedor,4000 + j_aux,auxiliar,botonVuelto,comprar),0);
                
            }
        }
    }

}