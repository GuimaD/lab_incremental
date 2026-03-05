public class CartaDano {
    public String nome;
    public int custo;
    public int dano;

    public CartaDano (String nome, int custo, int dano){
        this.nome = nome;
        this.custo = custo;
        this.dano = dano;
    }

    public void usar (Inimigo inimigo){
        inimigo.receberDano(dano);
    }

}
