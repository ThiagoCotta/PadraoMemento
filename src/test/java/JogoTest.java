import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    void deveArmazenarEstados() {
        Jogo jogo = new Jogo();
        jogo.setSave(JogoSave4.getInstance());
        jogo.setSave(JogoSave2.getInstance());
        assertEquals(2, jogo.getSaves().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Jogo jogo = new Jogo();
        jogo.setSave(JogoSave4.getInstance());
        jogo.setSave(JogoSave2.getInstance());
        jogo.restauraSave(0);
        assertEquals(JogoSave4.getInstance(), jogo.getSave());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Jogo jogo = new Jogo();
        jogo.setSave(JogoSave4.getInstance());
        jogo.setSave(JogoSave5.getInstance());
        jogo.setSave(JogoSave4.getInstance());
        jogo.setSave(JogoSave2.getInstance());
        jogo.restauraSave(2);
        assertEquals(JogoSave4.getInstance(), jogo.getSave());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogo jogo = new Jogo();
            jogo.restauraSave(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Esse save não existe", e.getMessage());
        }
    }

}