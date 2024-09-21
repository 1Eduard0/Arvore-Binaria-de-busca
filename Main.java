public static void main(String[] args) {
    Arvore_binaria<Integer> tree = new Arvore_binaria<>();

    tree.inserir(10);
    tree.inserir(15);
    tree.inserir(6);
    tree.inserir(17);
    tree.inserir(3);
    tree.inserir(20);
    tree.inserir(7);
    tree.inserir(14);
    tree.inserir(9);

    System.out.println("Árvore gerada:");
    tree.imprimirArvore();

    tree.remover(9);  
    System.out.println("Árvore após remover 9:");
    tree.imprimirArvore();

    tree.remover(17); 
    System.out.println("Árvore após remover 17:");
    tree.imprimirArvore();

    tree.remover(10); 
    System.out.println("Árvore após remover 10:");
    tree.imprimirArvore();
}
