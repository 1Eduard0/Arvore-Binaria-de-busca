class Node<T extends Comparable<T>> {
    Node<T> left, right;
    T data;

    public Node(T data) {
        this.data = data;
    }
}