//Singly Linked List class for lecture on 2-06-24
//Define program class
public class SinglyLinkedList<E>{
  //Nested Node class
  private static class Node<E>{
    //Instance Variables for node class
    private E element;
    private Node<E> next;
    //Constructor for node class
    public Node(E e, Node<E> n){
      element =e;
      next =n;
    }
    //Getter Methods for Node class
    public E getElement(){return element;}
    public Node<E> getNext(){return next;}
    //Setter Method for node class
    public void setNext(Node<E> n){next = n;}
  }//End of the Nested Node class

  //Instance Variables for the Singly Linked List Class
  private Node<E> head =null;
  private Node<E> tail =null;
  int size =0;

  //Constructor for SLL class
  public SinglyLinkedList(){}//Just creates an empty linked list

  //Methods for Singly Linked List class
  //Access Methods
  public int getSize(){return size;}
  public boolean isEmpty(){return size==0;}

  //First Method: Return the value of the head node
  public E first(){
    if(isEmpty()) return null;
    return head.getElement();
  }
  //Last Method: Return the value of the tail node
  public E last(){
    if(isEmpty()) return null;
    return tail.getElement();
  }

  //Update Methods:
  //addFirst Method: add a value to the front of the SLL
  public void addFirst(E e){
    head = new Node<>(e, head);
    if(size==0){
      tail=head;
    }
    size++;
  }
  //addLast Method: add a valoue to the end of the SLL
  public void addLast(E e){
    Node <E> newest = new Node<>(e, null);
    if(isEmpty()){
      head = newest;
    }
    else{
      tail.setNext(newest);
    }
    tail = newest;
    size++;
  }
  //removeFirst Method: return AND remove the head element from the SLL
  public E removeFirst(){
    if(isEmpty()){return null;}
    E answer = head.getElement();//Save the element in the head to return
    head = head.getNext();
    size--;
    if(size==0){
      tail = null;}
    return answer;
  }
}
