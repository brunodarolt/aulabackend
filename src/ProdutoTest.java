public class ProdutoTest {
    public static void main(String[] args){
        Produto produto = new Produto();
        Produto produto1 = new Produto("Maria", 25);
        Produto produto2 = new Produto("João", 30, 50);

        produto.exibirInfo();
        produto1.exibirInfo();
        produto2.exibirInfo();
    }
}
