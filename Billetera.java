import java.util.ArrayList;


class Billetera{

    private ArrayList<Moneda> al;

    public Billetera() {
        al = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda a) {
        al.add(a);

    }
    
    public Moneda getMoneda() {
        if (al.size() != 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }

    public Boolean hayMonedas(){
        if(al.size()!=0 ){
            return true;
        }else{
            return false;
        }
    }

}