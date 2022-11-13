import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
//Esta clase permite eliminar las bebidas, sacarlas de la salida, moverlas una vez esten en el inventario y ver su serie.
public class EliminarBebida extends JLabel implements MouseListener,MouseMotionListener{
    JLabel target;
    int serie,X2,X,Y;
	boolean Comprada;

    public EliminarBebida(int X2, JLabel a,int serie){
		this.X2 = X2;
        this.target=a;
        this.serie=serie;
        a.addMouseListener(this);
        a.addMouseMotionListener(this);
    }

    @Override
	public void mouseDragged(MouseEvent event) {
		if(Comprada){
			event.getComponent().setLocation((event.getX()+event.getComponent().getX())-X,(event.getY()+event.getComponent().getY())-Y);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
        if(target.getY()>450){
		Comprada = true;
		target.setLocation(X2+500, 600);
        System.out.println("Bebida retirada\n"+"Serie Bebida: " + serie);
        }
	}

	@Override
	public void mousePressed(MouseEvent event) {
		X = event.getX();
        Y = event.getY();   
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