import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

abstract class Bebida extends JLabel{

    abstract JLabel getLabel();

}

class Sprite extends Bebida {

    JLabel lataSprite;

    public Sprite(int X,JPanel target){

        lataSprite = new JLabel();
        ImageIcon imagenLataSprite = new ImageIcon("lataSprite.png"); //testing
        lataSprite.setBounds(X,305,50,40);
        lataSprite.setIcon(new ImageIcon(imagenLataSprite.getImage().getScaledInstance(lataSprite.getWidth(),lataSprite.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataSprite);

    }

    @Override
    public JLabel getLabel(){
        return lataSprite;
    }

}

class CocaCola extends Bebida {

    JLabel lataCoca;

    public CocaCola(int X,JPanel target){

        lataCoca = new JLabel();
        ImageIcon imagenLataCoca = new ImageIcon("lataCoca.png");
        lataCoca.setBounds(X,105,50,40);
        lataCoca.setIcon(new ImageIcon(imagenLataCoca.getImage().getScaledInstance(lataCoca.getWidth(),lataCoca.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataCoca);

    }

    @Override
    public JLabel getLabel(){
        return lataCoca;
    }

}

class Fanta extends Bebida {

    JLabel lataFanta;
    public Fanta(int X, JPanel target){

        lataFanta = new JLabel();
        ImageIcon imagenLataFanta = new ImageIcon("lataFanta.png"); //Just testing
        lataFanta.setBounds(X,205,50,40);
        lataFanta.setIcon(new ImageIcon(imagenLataFanta.getImage().getScaledInstance(lataFanta.getWidth(),lataFanta.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataFanta);

    }

    @Override
    public JLabel getLabel(){
        return lataFanta;
    }


}

