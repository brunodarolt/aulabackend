public class Produto {
    String nome;
    float preco;
    int quantidade;

    public Produto(){
        this.nome = "Sem nome";
        this.preco = 0;
        this.quantidade = 0;
    }

    public Produto( String nome, float preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, float preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo(){
        System.out.println("nome: " + nome + ", preço: " + preco + ", quantidade: " + quantidade);
    }
}
