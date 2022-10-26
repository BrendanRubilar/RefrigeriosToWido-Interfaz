package tarea.pkg3;

class Moneda1500 extends Moneda{

    @Override
     public int getValues(){
        return 1500;
     }

    @Override
    public int getSerie(){
        return Moneda1500.this.hashCode();
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 1500 \n Serie: "+ Moneda1500.this.hashCode();
     }


}