import java.util.ArrayList;

class Billetera{

    private ArrayList<Moneda> moneda100;
    private ArrayList<Moneda> moneda500;
    private ArrayList<Moneda> moneda1000; 

    public Billetera() {
        moneda100 = new ArrayList<Moneda>();
        moneda500 = new ArrayList<Moneda>();
        moneda1000 = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda a, int deposito) {
        
        switch(deposito){

            case 0: 
            moneda100.add(a);
            break;

            case 1: 
            moneda500.add(a);
            break;

            case 2:
            moneda1000.add(a);
            break;

        }

    }
    
    public Moneda getMoneda(int deposito) {

        switch(deposito){

            case 0:
                if (moneda100.size() != 0) {
                    return moneda100.remove(0);
                } else {
                    return null;
                }
            

            case 1:
                if (moneda500.size() != 0) {
                    return moneda500.remove(0);
                } else {
                    return null;
                }
            
            case 2:
                if (moneda1000.size() != 0) {
                    return moneda1000.remove(0);
                } else {
                    return null;
                }

            default:
                return null;
        }

    }

    public Boolean hayMonedas(int deposito){

        switch(deposito){

            case 0: 
                if(moneda100.size()!=0 ){
                    return true;
                }else{
                    return false;
                }

            case 1:
                if(moneda500.size()!=0 ){
                    return true;
                }else{
                    return false;
                }

            case 2:
                if(moneda1000.size()!=0 ){
                    return true;
                }else{
                    return false;
                }

            default:
                return null;

        }

    }

}