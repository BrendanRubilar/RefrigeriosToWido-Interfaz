package Tarea3;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Movement implements MouseListener,MouseMotionListener{

    private int X,Y;

    public Movement(Component... pns){
        for(Component panel : pns){
            panel.addMouseListener(this);
            panel.addMouseMotionListener(this);
        }
    }

	@Override
	public void mouseDragged(MouseEvent event) {
        event.getComponent().setLocation((event.getX()+event.getComponent().getX())-X,(event.getY()+event.getComponent().getY())-Y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		X = event.getX();
        Y = event.getY();   
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
