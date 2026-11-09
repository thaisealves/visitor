package visitor.app;

public class TextoVisitor implements Visitor {

    public String exibir(Conteudo conteudo) {
        return conteudo.aceitar(this);
    }

    @Override
    public String visitarTeoria(Teoria teoria) {
        return "Teoria{" +
                "titulo='" + teoria.getTitulo() + '\'' +
                ", autor='" + teoria.getAutor() + '\'' +
                ", curtidas=" + teoria.getCurtidas() +
                '}';
    }

    @Override
    public String visitarResenha(Resenha resenha) {
        return "Resenha{" +
                "autor='" + resenha.getAutor() + '\'' +
                ", nota=" + resenha.getNota() +
                ", obra=" + resenha.getNomeObra() +
                '}';
    }

    @Override
    public String visitarEvento(Evento evento) {
        return "Evento{" +
                "nome='" + evento.getNome() + '\'' +
                ", data=" + evento.getData() +
                ", local='" + evento.getLocal() + '\'' +
                '}';
    }
}
