package visitor.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TextoVisitorTest {

    @Test
    void deveExibirTeoria() {
        Teoria teoria = new Teoria("Jon Snow é um Targaryen", "Ana", 42);
        TextoVisitor visitor = new TextoVisitor();
        assertEquals("Teoria{titulo='Jon Snow é um Targaryen', autor='Ana', curtidas=42}", visitor.exibir(teoria));
    }

    @Test
    void deveExibirResenha() {
        Resenha resenha = new Resenha("Maria", 9.5f, new Obra("O Senhor dos Anéis"));
        TextoVisitor visitor = new TextoVisitor();
        assertEquals("Resenha{autor='Maria', nota=9.5, obra=O Senhor dos Anéis}", visitor.exibir(resenha));
    }

    @Test
    void deveExibirEvento() {
        Evento evento = new Evento("Maratona de Duna", "20/11/2026", "Discord");
        TextoVisitor visitor = new TextoVisitor();
        assertEquals("Evento{nome='Maratona de Duna', data=20/11/2026, local='Discord'}", visitor.exibir(evento));
    }
}
