import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EliminarBebida extends JLabel implements MouseListener,MouseMotionListener{

    JLabel target;
    int serie;

    public EliminarBebida(JLabel a,int serie){
        this.target=a;
        this.serie=serie;
        a.addMouseListener(this);
        a.addMouseMotionListener(this);
    }

    @Override
	public void mouseDragged(MouseEvent event) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
        if(target.getY()>450){
        target.setVisible(false);
        System.out.println("Bebida retirada\n"+"Serie Bebida: " + serie);
        }
	}

	@Override
	public void mousePressed(MouseEvent event) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {

    }

}