package visitor.app;

public class Teoria implements Conteudo {

    private String titulo;
    private String autor;
    private int curtidas;

    public Teoria(String titulo, String autor, int curtidas) {
        this.titulo = titulo;
        this.autor = autor;
        this.curtidas = curtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarTeoria(this);
    }
}
