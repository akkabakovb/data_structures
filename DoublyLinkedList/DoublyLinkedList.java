public class DoublyLinkedList<E> {
  //Nested Class node
  private static class Node<E>{
    //instance variables for class Node
    private Node<E> previous;
    private E element;
    private Node<E> next;
    //Constructor for Node Class
    public Node(Node<E> previous, E element, Node<E> next){
      this.previous=previous;
      this.element=element;
      this.next=next;
    }
    //Getter/Accessor methods
    public E getElement(){return element;}
    public Node<E> getPrev(){return previous;}
    public Node<E> getNext(){return next;}
    //Setter Methods
    public void setNext(Node<E> n){next=n;}
    public void setPrev(Node<E> n){previous=n;}
  }//End of Nested Class

  //Instance variables for DoublyLinkedList class
  private Node<E> header;
  private Node<E> trailer;
  private int size=0;
  //Constructor for DoublyLinkedList class
  public DoublyLinkedList(){
    header= new Node<>(null, null, null);
    trailer= new Node<>(header,null,null);
    header.setNext(trailer);
  }
  //Accessor/getter methods for DoublyLinkedList class
  public int getSize(){return size;}
  public boolean isEmpty(){return size==0;}

  //First Method: Return the value of the first node
  public E first(){
    if(isEmpty())return null;
    return header.getNext().getElement();
  }
  //Last Method: Return the value of the last Node
  public E last(){
    if(isEmpty())return null;
    return trailer.getPrev().getElement();
  }
  //Update/Setter Methods for DoublyLinkedList class
  //Add between: adds the element between two given nodes
  private void addBetween(Node<E> prev, Node<E> next, E e){
    Node<E> newNode = new Node<>(prev, e, next);
    prev.setNext(newNode);
    next.setPrev(newNode);
    size++;
  }
  //Remove: removes the given node from DoublyLinkedList
  private E remove(Node<E> e){
    Node<E> prev = e.getPrev();
    Node<E> next = e.getNext();
    e.getNext().setPrev(prev);
    e.getPrev().setNext(next);
    size--;
    return e.getElement();
    }
  //Add First: adds the value to the front of the DoublyLinkedList
  public void addFirst(E e){
    addBetween(header, header.getNext(),e );
  }
  //Add Last: adds the value to the end of the DoublyLinkedList
  public void addLast(E e){
    addBetween(trailer.getPrev(), trailer,e );
  }
  //Remove first: returns AND removes the first element from the DoublyLinkedList
  public E removeFirst(){
    if(isEmpty())return null;
    return remove(header.getNext());
  }
  //Remove last: returns AND removes the last element from the DoublyLinkedList
  public E removeLast(){
    if(isEmpty())return null;
    return remove(trailer.getPrev());
  }
}
