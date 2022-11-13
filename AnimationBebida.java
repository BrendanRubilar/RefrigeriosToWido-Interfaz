import javax.swing.JLabel;
import java.lang.Thread;

/*IMPORTANTE: Se hizo uso de Hilos para animar la caida de la bebida, de este modo el usuario puede seguir 
utilizando el programa mientras las latas caen. */
public class AnimationBebida extends JLabel implements Runnable{

    JLabel target;
    
    public AnimationBebida(Bebida bebida){
        target=bebida.getLabel();
    }

    public void run(){
       while(target.getY()<500){
        target.setLocation(target.getX(),target.getY()+25);
        try {
            Thread.sleep(60);
        } catch (Exception e) {
            System.out.println(e);
        }
       }
    }
} 