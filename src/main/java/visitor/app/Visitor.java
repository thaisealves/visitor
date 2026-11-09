package visitor.app;

public interface Visitor {
    String visitarTeoria(Teoria teoria);
    String visitarResenha(Resenha resenha);
    String visitarEvento(Evento evento);
}
