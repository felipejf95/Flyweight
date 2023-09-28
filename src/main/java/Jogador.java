public class Jogador {

    String nome;
    Equipe equipe;

    public Jogador(String nome, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + equipe.getNome() + '\'' +
                ", uf='" + equipe.getEstado() + '\'' +
                '}';
    }

}
