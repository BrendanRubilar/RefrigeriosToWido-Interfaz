import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

abstract class Bebida extends JLabel{

}

class Sprite extends Bebida {

    public Sprite(int X,JPanel target){

        JLabel lataSprite = new JLabel();
        ImageIcon imagenLataSprite = new ImageIcon("lataCoca.png"); //testing
        lataSprite.setBounds(X,305,50,40);
        lataSprite.setIcon(new ImageIcon(imagenLataSprite.getImage().getScaledInstance(lataSprite.getWidth(),lataSprite.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataSprite);

    }

}

class CocaCola extends Bebida {

    public CocaCola(int X,JPanel target){

        JLabel lataCoca = new JLabel();
        ImageIcon imagenLataCoca = new ImageIcon("lataCoca.png");
        lataCoca.setBounds(X,105,50,40);
        lataCoca.setIcon(new ImageIcon(imagenLataCoca.getImage().getScaledInstance(lataCoca.getWidth(),lataCoca.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataCoca);

    }

}

class Fanta extends Bebida {

    public Fanta(int X, JPanel target){

        JLabel lataFanta = new JLabel();
        ImageIcon imagenLataFanta = new ImageIcon("lataCoca.png"); //Just testing
        lataFanta.setBounds(X,205,50,40);
        lataFanta.setIcon(new ImageIcon(imagenLataFanta.getImage().getScaledInstance(lataFanta.getWidth(),lataFanta.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataFanta);

    }



}

