import javax.swing.JLabel;

abstract class Moneda extends JLabel{
    
    public Moneda(){

    }

    public abstract int getValues();
    public abstract int getSerie();
    public abstract String toString();
    public abstract JLabel getLabel();

}
