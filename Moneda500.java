package tarea.pkg3;

class Moneda500 extends Moneda{

    @Override
     public int getValues(){
        return 500;
     }

    @Override
    public int getSerie(){
        return Moneda500.this.hashCode();
    }

    @Override
     public String toString(){
        return "Valor de la moneda: 500 \n Serie: "+ Moneda500.this.hashCode();
     }


}