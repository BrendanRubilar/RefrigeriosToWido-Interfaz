import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

abstract class Bebida extends JLabel{

    abstract JLabel getLabel();
    
}

class Sprite extends Bebida{
    int serie;
    JLabel lataSprite;

    public Sprite(int X,JPanel target, int serie){
        this.serie=serie;
        lataSprite = new JLabel();
        ImageIcon imagenLataSprite = new ImageIcon("lataSprite.png");
        lataSprite.setBounds(X,305,50,40);
        lataSprite.setIcon(new ImageIcon(imagenLataSprite.getImage().getScaledInstance(lataSprite.getWidth(),lataSprite.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataSprite);
        EliminarBebida eliminar = new EliminarBebida(lataSprite,serie);

    }

    @Override
    public JLabel getLabel(){
        return lataSprite;
    }
}

class CocaCola extends Bebida {
    int serie;
    JLabel lataCoca;

    public CocaCola(int X,JPanel target, int serie){
        this.serie=serie;
        lataCoca = new JLabel();
        ImageIcon imagenLataCoca = new ImageIcon("lataCoca.png");
        lataCoca.setBounds(X,105,50,40);
        lataCoca.setIcon(new ImageIcon(imagenLataCoca.getImage().getScaledInstance(lataCoca.getWidth(),lataCoca.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataCoca);
        EliminarBebida eliminar = new EliminarBebida(lataCoca,serie);
    }

    @Override
    public JLabel getLabel(){
        return lataCoca;
    }
}

class Fanta extends Bebida {
    int serie;
    JLabel lataFanta;
    public Fanta(int X, JPanel target,int serie){
        this.serie=serie;
        lataFanta = new JLabel();
        ImageIcon imagenLataFanta = new ImageIcon("lataFanta.png");
        lataFanta.setBounds(X,205,50,40);
        lataFanta.setIcon(new ImageIcon(imagenLataFanta.getImage().getScaledInstance(lataFanta.getWidth(),lataFanta.getHeight(),Image.SCALE_SMOOTH)));
        target.add(lataFanta);
        EliminarBebida eliminar = new EliminarBebida(lataFanta,serie);
    }

    @Override
    public JLabel getLabel(){
        return lataFanta;
    }
}

