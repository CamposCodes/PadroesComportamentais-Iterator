package padroescomportamentais.iterator;

public class Produto {

    private String nome;
    private boolean disponivel;
    private TipoProduto tipo;

    public Produto(String nome, boolean disponivel, TipoProduto tipo) {
        this.nome = nome;
        this.disponivel = disponivel;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

}
