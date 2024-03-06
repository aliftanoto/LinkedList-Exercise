// public class NodeExercise {
    
//     private static class Node<E>{
//         private E data;
//         private Node<E> next;

//         private Node(E dataItem) {
//             data = dataItem;
//             next = null;
//         }
//         private Node(E dataItem,  Node<E> nodeRef) {
//             data = dataItem;
//             next = nodeRef;
//         }
        
//      {   
//         {
//             Node<String> tom = new Node<>("Tom");
//             Node<String> dick = new Node<>("Dick");
//             Node<String> harry = new Node<>("Harry");
//             Node<String> sam = new Node<>("Sam");
//             tom.next = dick;
//             dick.next = harry;
//             harry.next = sam;
//         }
//     }
//     public static void main(String[] args) {
        
    
//         public class KWSingleLinkedList<E>{
//             private Node<E> head = null;
//             private int size = 0;
            
//             public void addFirst(E) {
//                 head = new Node<>(item,head);
//                 size++;
                
//                 KWSingleLinkedList<String> names = new KWSingleLinkedList<>();
//                 names.addFirst("Sam");
//                 names.addFirst("Harry");
//                 names.addFirst("Dick");
//                 names.addFirst("Tom");
                
//                 Node<String> bob = new Node<>("Bob");
//                 bob.next = harry.next;
//                 harry.next = bob;
//             }
//             private void addAfter(Node<E> node, E item){
//                 node.next = new Node<>(item, node.next);
//                 size++;
//             }
//             private E removeAfter(Node<E> node){
//                 Node<E> temp = node.next;
//                 if(temp != null){
//                     node.next = temp.next;
//                     size--;
//                     return temp.data;
//                 }else{
//                     return null;
//                 }
                
//             }
//             private E removeFirst(){
//                 Node<E> temp = head;
//                 if(head != null){
//                     head = head.next;
//                 }
//                 if(temp != null){
//                     size--;
//                     return temp.data;
//                 }else{
//                     return null;
//                 }
//             }
//     }
//     }
//         }}
public class NodeExercise{
    public static void main(String[] args) {
        Node<String> tom = new Node<>("Tom");
        Node<String> dick = new Node<>("Dick");
        Node<String> harry = new Node<>("Harry");
        Node<String> sam = new Node<>("Sam");
        tom.next = dick;
        dick.next = harry;
        harry.next = sam;    
        
        Node<String> bob = new Node<>("Bob");
        bob.next = harry.next;
        harry.next = bob;
    }
    
    private static class Node<E>{
        private E data;
        private Node<E> next;

        private Node(E dataItem){
            data = dataItem;
            next = null;
        }
        private Node(E dataItem, Node<E> nodeRef){
            data = dataItem;
            next = nodeRef;
        }
public class KWSingleLinkedList<E>{
    private Node<E> head = null;
    private int size = 0;

    public void addFirst(E item){
        head = new Node<>(item,head);
        size++;
        
        KWSingleLinkedList<String> names = new KWSingleLinkedList<>();
        names.addFirst("Sam");
        names.addFirst("Harry");
        names.addFirst("Dick");
        names.addFirst("Tom");

        
    }
private void addAfter(Node<E> node, E item){
    node.next = new Node<>(item,node.next);
    size++;
}
private E removeAfter(Node<E> node){
    Node<E> temp = node.next;

    if(temp != null){
        node.next = temp.next;
        size--;
        return temp.data;
    }else{
        return null;
    }
}
private E removeFirst(){
    Node<E> temp = head;
    if (head!= null){
        head = head.next;
    }
    if(temp != null){
        size--;
        return temp.data;
    }else{
        return null;
        }
    }
    }
}
}
        
        
    
    
    
