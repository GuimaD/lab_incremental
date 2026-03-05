public class Heroi {
    private String name;
    private int vida;
    private int escudo;

    public Heroi (String name, int vida, int escudo){
        this.name = name;
        this.vida = vida;
        this.escudo = escudo;
    }

    public void receberDano (int dano){
        vida -= dano;
    }
    
    public void ganharEscudo (int escudoRecebido){
        escudo += escudoRecebido;
    }

    public boolean estaVivo(){
        if (vida <= 0){
            return true;
        } else {
            return false;
        }
    }
}
    