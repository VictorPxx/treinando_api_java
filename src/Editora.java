public class Editora {
    private String nome;
    private String cidade;

    public Editora(EditoraRecord editoraRecord) {
        this.nome = editoraRecord.nome();
        this.cidade = editoraRecord.cidade();
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                ", cidade= " + cidade ;
    }
}
