import javax.swing.JLabel;
import java.lang.Thread;



public class AnimationBebida extends JLabel implements Runnable{

    JLabel target;
    
    public AnimationBebida(Bebida bebida){
        
        target=bebida.getLabel();

    }

    public void run(){
        
       while(target.getY()<500){

        target.setLocation(target.getX(),target.getY()+5);
        try {
            Thread.sleep(60);
        } catch (Exception e) {
            System.out.println(e);
        }

       }
   
    }
} 