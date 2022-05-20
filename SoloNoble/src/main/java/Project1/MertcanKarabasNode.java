
package Project1;

/**
 *
 * @author Mertcan Karabaş
 */
public class Node<T> {
    
    T data;
    Node <T> next;
    Node <T> down;
    
    public Node(T data) {
        this.data = data;
        this.next = this.down = null;
    }

    public Node() {
        
    }
}
