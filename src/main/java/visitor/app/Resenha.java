package visitor.app;

public class Resenha implements Conteudo {

    private String autor;
    private float nota;
    private Obra obra;

    public Resenha(String autor, float nota, Obra obra) {
        this.autor = autor;
        this.nota = nota;
        this.obra = obra;
    }

    public String getAutor() {
        return autor;
    }

    public float getNota() {
        return nota;
    }

    public String getNomeObra() {
        return this.obra.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarResenha(this);
    }
}
