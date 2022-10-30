package Tarea3;

class Moneda100 extends Moneda{

    @Override
     public int getValues(){
        return 100;
     }

    @Override
    public int getSerie(){
        return Moneda100.this.hashCode();
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 100 \n Serie: "+ Moneda100.this.hashCode();
     }


}