

public class Filme extends Produto {
    public Filme(String titulo, int ano, String genero) {
        super(titulo, ano, genero);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Filme: " + titulo + " | Ano: " + ano + " | Gênero: " + genero);
    }
}
