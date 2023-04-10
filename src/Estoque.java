public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMin;

    public Estoque(){
        nome = "";
        qtdMin = 0;
        qtdAtual = 0;
    }

    public Estoque (String name, int atual, int min){
        if (min < 0){
            System.out.println("ERRO - Quantidade minima não pode ser negativa!");
            min = 1;
        }
        if(atual < 0){
            System.out.println("ERRO - Quantidade atual não pode ser negativa!");
            atual = 0;
        }
        nome = name;
        qtdAtual = atual;
        qtdMin = min;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        if(qtdAtual < 0){
            System.out.println("ERRO - Quantidade atual não pode ser negativa!");
            qtdAtual = 0;
        }
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(int qtdMin) {
        if (qtdMin < 0){
            System.out.println("ERRO - Quantidade minima não pode ser negativa!");
            qtdMin = 1;
        }
        this.qtdMin = qtdMin;
    }

    public void repor(int qtd){
        qtdAtual += qtd;
    }

    public void baixa(int qtd){
        qtdAtual -=qtd;
        if(qtdAtual <=0)
            System.out.println("ERRO - Não existem itens para dar baixa");
    }
    public void mostra(){
        System.out.println("\nO produto "+ nome +" tem como quantidade minima: "+qtdMin+" itens");
        System.out.println("E a quantidade atual é de: "+qtdAtual+" itens\n");
    }
    public boolean precisaRepor(){
        boolean precisa = false;
        if(qtdAtual < qtdMin)
            precisa = true;
        return precisa;
    }
}
