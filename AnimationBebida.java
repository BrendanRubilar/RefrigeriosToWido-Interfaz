import javax.swing.JLabel;
import java.lang.Thread;
import java.util.Random;
import java.lang.Object;

public class AnimationBebida extends JLabel implements Runnable{

    JLabel target;
    
    public AnimationBebida(Bebida bebida){
        target=bebida.getLabel();
    }

    public void run(){
        
       while(target.getY()<500){
        target.setLocation(target.getX(),target.getY()+15);
        try {
            Thread.sleep(60);
        } catch (Exception e) {
            System.out.println(e);
        }
       }

       if(target.getY()>=500){
        Random r = new Random();
        int positionX = r.nextInt(350-200)+200;
        target.setLocation(positionX,500);
       }
   
    }
} 