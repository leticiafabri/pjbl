
public abstract class Produto {
    protected String titulo;
    protected int ano;
    protected String genero;

    public Produto(String titulo, int ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    public abstract void exibirDetalhes(); // Método abstrato que as subclasses devem implementar
}
