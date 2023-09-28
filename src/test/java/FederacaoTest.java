import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FederacaoTest {

    @Test
    void deveRetornarJogadores() {
        Federacao federacao = new Federacao();

        federacao.associar("Andre", "Ituano", "SP");
        federacao.associar("Ronaldo", "Guaratingueta", "SP");
        federacao.associar("Cassiano", "Bragantino", "SP");
        federacao.associar("Juninho", "Ituano", "SP");



        List<String> saida = Arrays.asList(
                "Jogador{nome='Andre', cidade='Ituano', uf='SP'}",
                "Jogador{nome='Ronaldo', cidade='Guaratingueta', uf='SP'}",
                "Jogador{nome='Cassiano', cidade='Bragantino', uf='SP'}",
                "Jogador{nome='Juninho', cidade='Ituano', uf='SP'}");

        assertEquals(saida, federacao.obterEquipes());
    }

}