package Tarea3;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.text.StyledEditorKit.BoldAction;


public class Movement implements MouseListener,MouseMotionListener{

    private int X,Y;
	boolean Presionada,flechaEncima;
	Component target;
	Moneda moneda; //testing...

    public Movement(Component a){
		target = a;
		a.addMouseListener(this);
		a.addMouseMotionListener(this);

    }

	@Override
	public void mouseDragged(MouseEvent event) {
        event.getComponent().setLocation((event.getX()+event.getComponent().getX())-X,(event.getY()+event.getComponent().getY())-Y);
		Presionada = true;
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("CLICK SIMPLE");
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		X = event.getX();
        Y = event.getY();   
		Presionada = true;

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Presionada = false;
		
		if( (target.getX()>=690 && target.getX()<=760)&&(target.getY()>=290 && target.getY()<=380) ){
			target.setVisible(false);
			//SOLO PARA TESTEAR!
			moneda = new Moneda500();
			System.out.println("DESAPARECER");
		}

	}

	public Moneda getMoneda(){
		return moneda;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//TEMPORAL SOLO QUIERO VER COMO QUEDA EL EFECTO

		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

		
	}

	public Boolean EstadoMoneda(){
		return Presionada;
	}

}
