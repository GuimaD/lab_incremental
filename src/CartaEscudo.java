public class CartaEscudo {
    public String nome;
    public int custo;
    public int escudo;

    public CartaEscudo (String nome, int custo, int escudo){
        this.nome = nome;
        this.custo = custo;
        this.escudo = escudo;
    }

    public void usar (Heroi heroi){
        heroi.ganharEscudo(escudo);
    }

}
