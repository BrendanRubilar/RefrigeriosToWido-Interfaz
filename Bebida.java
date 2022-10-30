package Tarea3;

abstract class Bebida{

    private int Serie;

    public Bebida(int a){
        Serie = a;
    }

    public Bebida(){

    }

    public int getSerie() {
        return Serie;
    }

    public String beber(){
        return "sabor: ";
    }

}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }
    public String beber(){
        return super.beber() + "sprite";

    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String beber(){
        return super.beber() + "cocacola";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String beber(){
        return super.beber() + "fanta";
    }
}

