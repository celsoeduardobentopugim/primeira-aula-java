
public class User {
    private String nome;
    private String email;
    private int idade;
    private Carrinho carrinho;

    public User(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.carrinho = new Carrinho();
    }

    public void pagar() {
        // Lógica para efetuar o pagamento
        System.out.println("Pagamento efetuado com sucesso!");
    }

    // Métodos Set

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    // Métodos Get

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
