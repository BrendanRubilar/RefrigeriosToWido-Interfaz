package tarea.pkg3;

import java.util.ArrayList;

class Deposito {

    private ArrayList<Bebida> al;

    public Deposito() {
        al = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida a) {
        al.add(a);
    }
    
    public Bebida getBebida() {
        if (al.size() != 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }

    public Boolean hayBebidas(){
        if(al.size()!=0 ){
            return true;
        }else{
            return false;
        }
    }

}