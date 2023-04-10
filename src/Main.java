public class Main {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora", 13, 6);

        Estoque estoque2 = new Estoque();
        estoque2.setNome("Monitor");
        estoque2.setQtdAtual(11);
        estoque2.setQtdMin(13);

        Estoque estoque3 = new Estoque("Mouse", 6, 2);

        estoque1.baixa(5);
        estoque2.repor(7);
        estoque3.baixa(4);

        if (estoque1.precisaRepor())
            System.out.println("O item " + estoque1.getNome() + " precisa ser reposto!");
        if (estoque2.precisaRepor())
            System.out.println("O item " + estoque2.getNome() + " precisa ser reposto!");
        if (estoque3.precisaRepor())
            System.out.println("O item " + estoque3.getNome() + " precisa ser reposto!");

        estoque1.mostra();
        estoque2.mostra();
        estoque3.mostra();
    }
}