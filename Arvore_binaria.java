public class Arvore_binaria<T extends Comparable<T>> {
    private Node<T> raiz;

    public void inserir(T dado) {
        raiz = inserir(raiz, dado);
    }

    private Node<T> inserir(Node<T> node, T dado) {
        if (node == null) {
            return new Node<>(dado);
        }
        if (dado.compareTo(node.data) < 0) {
            node.left = inserir(node.left, dado);
        } else if (dado.compareTo(node.data) > 0) {
            node.right = inserir(node.right, dado);
        }
        return node;
    }

    public void remover(T dado) {
        raiz = remover(raiz, dado);
    }

    private Node<T> remover(Node<T> node, T dado) {
        if (node == null) return null;

        if (dado.compareTo(node.data) < 0) {
            node.left = remover(node.left, dado);
        } else if (dado.compareTo(node.data) > 0) {
            node.right = remover(node.right, dado);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            else {
                Node<T> menorValor = encontrarMin(node.right);
                node.data = menorValor.data;
                node.right = remover(node.right, menorValor.data);
            }
        }
        return node;
    }

    private Node<T> encontrarMin(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void imprimirArvore() {
        BTreePrinter.printNode(raiz);
    }
}