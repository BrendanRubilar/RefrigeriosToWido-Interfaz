package Tarea3;

class Moneda1000 extends Moneda{

    @Override
     public int getValues(){
        return 1000;
     }

    @Override
    public int getSerie(){
        return Moneda1000.this.hashCode();
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 1000 \n Serie: "+ Moneda1000.this.hashCode();
     }


}