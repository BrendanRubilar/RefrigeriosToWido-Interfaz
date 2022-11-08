import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import java.awt.Image;


public class Movement implements MouseListener,MouseMotionListener{

    private int X,Y;
	boolean Presionada,flechaEncima;
	Component target;
	Moneda moneda;
	Billetera billetera;
	Expendedor expendedor;

    public Movement(Component a, Moneda moneda, Billetera billetera, Expendedor expendedor){
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

			target.setVisible(false);
			//SOLO PARA TESTEAR!
			System.out.println("Valor moneda: " + moneda.getValues());
			System.out.println("DESAPARECER"); 


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
		
		System.out.println(moneda.getSerie());
		
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

}
