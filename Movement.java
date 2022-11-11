import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.Image;

public class Movement extends JLabel implements MouseListener,MouseMotionListener,ActionListener{

    private int X,Y;
	boolean Presionada,flechaEncima;
	JLabel target;
	Moneda moneda;
	Billetera billetera;
	Expendedor expendedor;
	JButton botonVuelto, comprar;

    public Movement(JLabel a, Moneda moneda, Billetera billetera, Expendedor expendedor,JButton botonVuelto, JButton comprar){
		this.botonVuelto = botonVuelto;
		this.comprar = comprar;
        botonVuelto.addActionListener(this);
        comprar.addActionListener(this);
		
		this.expendedor = expendedor;
		this.moneda = moneda;
		this.billetera = billetera;
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
		System.out.println("Serie moneda: " + moneda.getSerie());
			
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
			System.out.println("Valor moneda: " + moneda.getValues());

		}

	}

	public void enviarMoneda(Moneda moneda){
		switch(moneda.getValues()){
		
			case 100:
			expendedor.recibirMoneda(billetera.getMoneda(0));
			break;

			case 500:
			expendedor.recibirMoneda(billetera.getMoneda(1));
			break;

			case 1000:
			expendedor.recibirMoneda(billetera.getMoneda(2));
			break;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//TEMPORAL SOLO QUIERO VER COMO QUEDA EL EFECTO
		if(moneda.getValues()==100){
			ImageIcon imagen = new ImageIcon("100pesos2.png");
			moneda.getLabel().setIcon(new ImageIcon(imagen.getImage().getScaledInstance(moneda.getLabel().getWidth(),moneda.getLabel().getHeight(),Image.SCALE_SMOOTH)));
		}else if(moneda.getValues()==500){
			ImageIcon imagen = new ImageIcon("500pesos2.png");
			moneda.getLabel().setIcon(new ImageIcon(imagen.getImage().getScaledInstance(moneda.getLabel().getWidth(),moneda.getLabel().getHeight(),Image.SCALE_SMOOTH)));
			
		}else if(moneda.getValues()==1000){
			ImageIcon imagen = new ImageIcon("1000chelines2.png");
			moneda.getLabel().setIcon(new ImageIcon(imagen.getImage().getScaledInstance(moneda.getLabel().getWidth(),moneda.getLabel().getHeight(),Image.SCALE_SMOOTH)));
			
		}
			
	}

	@Override
	public void mouseExited(MouseEvent e) {

		if(moneda.getValues()==100){
			ImageIcon imagen = new ImageIcon("100pesos.png");
			moneda.getLabel().setIcon(new ImageIcon(imagen.getImage().getScaledInstance(moneda.getLabel().getWidth(),moneda.getLabel().getHeight(),Image.SCALE_SMOOTH)));

		}else if(moneda.getValues()==500){
			ImageIcon imagen = new ImageIcon("500pesos.png");
			moneda.getLabel().setIcon(new ImageIcon(imagen.getImage().getScaledInstance(moneda.getLabel().getWidth(),moneda.getLabel().getHeight(),Image.SCALE_SMOOTH)));
			
		}else if(moneda.getValues()==1000){
			ImageIcon imagen = new ImageIcon("1000chelines.png");
			moneda.getLabel().setIcon(new ImageIcon(imagen.getImage().getScaledInstance(moneda.getLabel().getWidth(),moneda.getLabel().getHeight(),Image.SCALE_SMOOTH)));
			
		}
		
	}

	public Boolean EstadoMoneda(){
		return Presionada;
	}

	@Override
	public void actionPerformed(ActionEvent e){

		if(e.getSource()==comprar){

			if( (target.getX()>=690 && target.getX()<=760)&&(target.getY()>=290 && target.getY()<=380) ){

				if(target.isVisible()==false){

					target.setLocation(1000, 0); //No elimina objeto, lo manda a china no mas, tener en consideracion
					enviarMoneda(moneda);
					moneda = null;

				}
			}
			
		}

		if(e.getSource()==botonVuelto){

			if( (target.getX()>=690 && target.getX()<=760)&&(target.getY()>=290 && target.getY()<=380) ){

				target.setLocation(420,485);
				target.setVisible(true);
				repaint();
		
			}

		}

	}

}
