public class Inimigo {
    private String name;
    private int vida;
    private int escudo;

    public Inimigo (String name, int vida, int escudo){
        this.name = name;
        this.vida = vida;
        this.escudo = escudo;
    }

    public void receberDano (int dano){
        int dano_verdadeiro = escudo - dano;
        if (dano_verdadeiro < 0){
            vida -= Math.abs(dano_verdadeiro);
        }
        
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
    