package MasterDataStructureAndAlgorithms;

public class MySinglyLinkedLists {

    public static void main(String[] args) {

        MySinglyLinkedLists mySinglyLinkedLists = new MySinglyLinkedLists(5);
        mySinglyLinkedLists.append(8);
        mySinglyLinkedLists.append(4);
        mySinglyLinkedLists.prepend(10);
        mySinglyLinkedLists.PrintLists();
        mySinglyLinkedLists.insert(2,15);
        mySinglyLinkedLists.PrintLists();
        mySinglyLinkedLists.remove(100);
        mySinglyLinkedLists.remove(2);
        mySinglyLinkedLists.PrintLists();
        mySinglyLinkedLists.reverse();
        mySinglyLinkedLists.PrintLists();
    }

    public MySinglyLinkedNode getHead() {
        return head;
    }

    public MySinglyLinkedNode getTail() {
        return tail;
    }


    public int getLength() {
        return length;
    }

    private MySinglyLinkedNode head;
    private MySinglyLinkedNode tail;
    private int length;


 public MySinglyLinkedLists(int value){
  head = new MySinglyLinkedNode(value);
  tail = head;
  length = 1;
 }


 public void prepend(int value){
  head = new MySinglyLinkedNode(value, head);
  length++;
 }


 public void append(int value){
  MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
   tail.setNext(newNode);
   tail = newNode;
   length++;

 }

 public void PrintLists(){
     if(head== null){
         return;
     }

     MySinglyLinkedNode currentNode = head;
     System.out.print(currentNode.getValue());
     currentNode = currentNode.getNext();

     while (currentNode!=null){
         System.out.print(currentNode.getValue());
         currentNode=currentNode.getNext();
     }
     System.out.println();
 }

 public void insert(int index, int value){

        index = wrapIndex(index);

        if(index==0){
            return;
        }

        if(index==length-1){
            append(value);
            return;
        }

      MySinglyLinkedNode leader = TraversedToIndex(index-1);
        MySinglyLinkedNode nextLead = leader.getNext();

        MySinglyLinkedNode newNode = new  MySinglyLinkedNode(value, nextLead);
        leader.setNext(newNode);
        length++;

 }


 private int wrapIndex(int index){
     return Math.max(Math.min(index,length-1),0);
 }

 private MySinglyLinkedNode TraversedToIndex(int index){

     index = wrapIndex(index);
    MySinglyLinkedNode current = head;
     for(int i = 0; i < index; i ++){
       current = current.getNext();

     }

     return current;
 }

 public void remove(int index){

     index = wrapIndex(index);

     if(index==0){
         head = head.getNext();
         return;
     }

     MySinglyLinkedNode leader = TraversedToIndex(index-1);
     MySinglyLinkedNode nodeToRemove = leader.getNext();
    leader.setNext(nodeToRemove.getNext());
    length--;

 }

 public void reverse(){

     MySinglyLinkedNode first = head;
     tail = first;
     MySinglyLinkedNode second = first.getNext();

     for(int i = 0; i < length-1; i ++){
         MySinglyLinkedNode temp = second.getNext();
         second.setNext(first);
         first = second;
         second = temp;
     }
     head.setNext(null);
     head=first;
 }



}
