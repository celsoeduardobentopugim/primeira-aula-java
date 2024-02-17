public class Produto {
    private String nome;
    private boolean desconto;
    private double preco;
    private double peso;

    public Produto(String nome, boolean desconto, double preco, double peso) {
        this.nome = nome;
        this.desconto = desconto;
        this.preco = preco;
        this.peso = peso;
    }

    public double calcularDesconto() {
        if (desconto) {
            return preco * 0.1; // Assumindo um desconto de 10%
        } else {
            return 0.0;
        }
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
}
