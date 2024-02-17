public class Carrinho {
    private double produtoBruto;
    private double taxa;
    private double precoTotal;
    private List<Produto> listaProduto;

    public Carrinho() {
        this.produtoBruto = 0.0;
        this.taxa = 0.0;
        this.precoTotal = 0.0;
        this.listaProduto = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        listaProduto.add(produto);
        produtoBruto += produto.getPreco();
        calcularPrecoTotal();
    }

    public void removerProduto(Produto produto) {
        listaProduto.remove(produto);
        produtoBruto -= produto.getPreco();
        calcularPrecoTotal();
    }

    public void fecharCompra() {
        // Lógica para finalizar a compra
        System.out.println("Compra finalizada!");
    }

    public void mostrarPreco() {
        System.out.println("Preço total: " + precoTotal);
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : listaProduto) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
    }

    private void calcularPrecoTotal() {
        precoTotal = produtoBruto * (1 + taxa);
    }

    // Getters e Setters

    public double getProdutoBruto() {
        return produtoBruto;
    }

    public void setProdutoBruto(double produtoBruto) {
        this.produtoBruto = produtoBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
        calcularPrecoTotal();
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
}