import java.util.ArrayList;
import java.util.List;

public class Federacao {

    private List<Jogador> jogadores = new ArrayList<>();

    public void associar(String nomeJogador, String nomeEquipe, String estado) {
        Equipe equipe = EquipeFactory.getEquipe(nomeEquipe, estado);
        Jogador jogador = new Jogador(nomeJogador, equipe);
        jogadores.add(jogador);
    }

    public List<String> obterEquipes() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }


}
