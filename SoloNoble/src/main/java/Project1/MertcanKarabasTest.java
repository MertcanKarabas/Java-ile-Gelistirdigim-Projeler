/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

/**
 *
 * @author mertc
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.createList(3);
        list.deleteWhenGameStart(3);
        list.deleteNode("C1");     
        list.printList();
        System.out.println("---------------------");
        list.addNode("C1");
        list.printList();
    }
}
