public class Livro {
    private String titulo;
    private String autor;
    private Editora editora;

    public Livro(LivroRecord livroRecord) {
        this.titulo = livroRecord.titulo();
        this.autor = livroRecord.autor();
    }

    @Override
    public String toString() {
        return  "titulo= " + titulo +
                ", autor= " + autor +
                " | Editora: " + editora;
    }
}
