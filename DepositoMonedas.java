package tarea.pkg3;

import java.util.ArrayList;

class DepositoMonedas {

    private ArrayList<Moneda> al;

    public DepositoMonedas() {
        al = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda a) {
        al.add(a);
    }

    public Boolean listIsEmpty(){
        if(al.size()==0){
            return true;
        }else{
            return false;
        }

    }
    
    public Moneda getMoneda() {
        if (al.size() != 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }
}