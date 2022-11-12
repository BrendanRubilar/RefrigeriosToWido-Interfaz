import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class RefillBebidas extends JLabel implements MouseListener,MouseMotionListener{
    JLabel depositoCoca;
    JLabel depositoFanta;
    JLabel depositoSprite;
    Expendedor expendedor;
    public RefillBebidas(Expendedor expendedor1,JLabel depositoC,JLabel depositoF, JLabel depositoS){
        this.expendedor=expendedor1;
        depositoCoca=depositoC;
        depositoFanta=depositoF;
        depositoSprite=depositoS;
        depositoC.addMouseListener(this);
        depositoF.addMouseListener(this);
        depositoS.addMouseListener(this);
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        expendedor.rellenarBebidas();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}