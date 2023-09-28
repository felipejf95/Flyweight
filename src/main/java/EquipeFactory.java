import java.util.HashMap;
import java.util.Map;

public class EquipeFactory {

    private static Map<String, Equipe> equipes = new HashMap<>();

    public static Equipe getEquipe(String nome, String estado) {
        Equipe equipe = equipes.get(nome);
        if (equipe == null) {
            equipe = new Equipe(nome, estado);
            equipes.put(nome, equipe);
        }
        return equipe;
    }

    public static int getTotalEquipes() {
        return equipes.size();
    }

}
