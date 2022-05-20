package Project1;

/**
 *
 * @author Mertcan Karabaş
 */
public class LinkedList<T> {

    Node<T> head;
    Node<T> nextNodes[];

    public void addNode(T data) {
        
        Node<T> elemanListedeMiNode = head;
        while (elemanListedeMiNode != null && (dataHarfi(elemanListedeMiNode.data) != dataHarfi(data))) {            
            elemanListedeMiNode = elemanListedeMiNode.next;
        }
        boolean sutunBosMu = (elemanListedeMiNode == null) ?  true : false;
        
        if (sutunBosMu) { //boş sütuna node ekleme
            Node<T> temp = head;
            Node<T> newNode = new Node(data);
            int aradakiFark = (int) dataHarfi(data) - (int) dataHarfi(temp.data);
            for (int i = 1; i < aradakiFark; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        
        } else if ('1' == dataSayisi(data) && 'A' != dataHarfi(data)) { //en üst satıra head olmayan ortadaki durum
            Node<T> temp = head;
            Node<T> newNode = new Node(data);
            int aradakiFark = (int) dataHarfi(data) - (int) dataHarfi(temp.data);
            for (int i = 1; i < aradakiFark; i++) {
                temp = temp.next;
            }
            newNode.down = temp.next;
            newNode.next = temp.next.next;
            temp.next.next = null;
            temp.next = newNode;
        
        } else if ((dataHarfi(data) == dataHarfi(head.data) || (int)dataHarfi(data) < (int)dataHarfi(head.data))
                    && (int)dataSayisi(data) <= (int)dataSayisi(head.data)) { //head ekleme durumu
            Node<T> temp = head;
            Node<T> newNode = new Node(data);
            newNode.next = temp.next;
            newNode.down = temp;
            temp.next = null;
            head = newNode;
        
        } else { //araya node ekleme durumu
            Node<T> temp = gidilecekUstYerHarf(data);
            Node<T> newNode = new Node(data);
            int aradakiFark = (int) dataSayisi(data) - (int) dataSayisi(temp.data);
            for (int i = 1; i < aradakiFark; i++) {
                temp = temp.down;
            }
            newNode.down = temp.down;
            temp.down = newNode;
        }

    }

    public void deleteHeadNode() {
        Node<T> temp = head;
        if (temp.down == null) {
            head = temp.next;
        } else {
            temp.down.next = temp.next;
            head = temp.down;
        }
    }

    public void deleteNode(T data) {

        char headDataHarf = dataHarfi(head.data);
        char headDataSayi = dataSayisi(head.data);
        int headDataValue = headDataHarf + headDataSayi;

        char silinecekDataHarf = dataHarfi(data);
        char silinecekDataSayi = dataSayisi(data);
        int silinecekDataValue = silinecekDataHarf + silinecekDataSayi;

        boolean kontrol = false;

        for (Node<T> nextNode : nextNodes) {
            kontrol = (nextNode.data.equals(data)) ? true : false;
            if (kontrol == true) {
                break;
            }
        }

        if (kontrol == true) {
            if (silinecekDataValue == headDataValue) {
                deleteHeadNode();
            } else {
                Node<T> temp = head;
                Node<T> temp2 = head.next;
                while (temp2 != null && !(temp2.data.equals(data))) {
                    temp2 = temp2.next;
                    temp = temp.next;
                }
                temp2.down.next = temp2.next;
                temp.next = temp2.down;
            }

        } else {
            Node<T> temp = gidilecekUstYerHarf(data);
            int aradakiFark = dataSayisi(data) - dataSayisi(temp.data);
            for (int i = 1; i < aradakiFark; i++) {
                temp = temp.down;
            }
            temp.down = temp.down.down;

        }
    }

    public char dataHarfi(T data) {
        char donecekData;
        String sData = (String) data;
        donecekData = sData.charAt(0);
        return donecekData;
    }

    public Node gidilecekUstYerHarf(T data) { //silinecek data ile harfi aynı olana kadar üstte sağa kayar.
        Node<T> temp = head;
        String tempData = (String) temp.data;
        char tempHarf = tempData.charAt(0);
        String silinecekData = (String) data;
        char silinecekDataHarf = silinecekData.charAt(0);
        while (temp.next != null && tempHarf != silinecekDataHarf) {
            temp = temp.next;
            tempData = (String) temp.data;
            tempHarf = tempData.charAt(0);
        }
        return temp;
    }

    public char dataSayisi(T data) {
        char donecekData;
        String sData = (String) data;
        donecekData = sData.charAt(1);
        return donecekData;
    }

    public void deleteWhenGameStart(int number) {

        if (number % 2 == 0) {
            Node<T> temp = head;
            int gidilecekNext = 0, gidilecekDown = 0;
            while (gidilecekNext != (number / 2) - 1) {
                temp = temp.next;
                gidilecekNext++;
            }
            while (gidilecekDown != (number / 2) - 2) {
                temp = temp.down;
                gidilecekDown++;
            }
            temp.down = temp.down.down.down;
            gidilecekDown = 0;
            gidilecekNext = 0;
            temp = head;
            while (gidilecekNext != (number / 2)) {
                temp = temp.next;
                gidilecekNext++;
            }
            while (gidilecekDown != (number / 2) - 2) {
                temp = temp.down;
                gidilecekDown++;
            }
            temp.down = temp.down.down.down;
        } else {
            Node<T> temp = head;
            int gidilecekNext = 0, gidilecekDown = 0;
            while (gidilecekNext != (number / 2)) {
                temp = temp.next;
                gidilecekNext++;
            }
            while (gidilecekDown != (number / 2) - 1) {
                temp = temp.down;
                gidilecekDown++;
            }
            temp.down = temp.down.down;
        }
    }

    public void createList(int number) {
        nextNodes = new Node[number];
        String a = "";
        int kaymaKismi = 65; //Node'un next nodeunun downuna gitmek için oluşturulan değişken.
        for (int i = 65; i < 65 + number; i++) { //Harflendirme için oluşturulan döngü
            for (int j = 1; j < number + 1; j++) { //Harfelerin yanına verilecek sayılar için döngü.
                a = "";
                a += (char) i;
                a += j;
                Node<T> newNode = new Node(a);
                if (head == null) {
                    head = newNode;
                } else {
                    Node<T> temp = head;
                    if (kaymaKismi < i) {
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                    }
                    if (j == 1) {
                        temp.next = newNode;
                        continue;
                    }
                    while (temp.down != null) {
                        temp = temp.down;
                    }
                    temp.down = newNode;
                }
            }
        }

        Node<T> temp2 = head;
        for (int i = 0; i < nextNodes.length; i++) {
            nextNodes[i] = temp2;
            temp2 = temp2.next;
        }
    }

    void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.down;
        }
        System.out.println("null");

        Node<T> temp2 = head;
        while (temp2 != null) {
            System.out.print(temp2.data + " -> ");
            temp2 = temp2.next;
        }
        System.out.println("null");
//        Node<T> temp2 = head;
//        for (int i = 0; i < number; i++) {
//            while (temp2 != null) {
//                System.out.print(temp.data + " -> ");
//                temp = temp.down;
//            }
//        }

    }
}
