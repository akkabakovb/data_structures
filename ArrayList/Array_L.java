//ArrayList Implementation for lecture on 2-29-24
import java.util.NoSuchElementException;
//Declare program class
public class ArrayList_I<E> implements List<E>{
  //Declare Nested Iterator class
  private class ArrayIterator implements Iterator<E>{
    //This will work with either the Iterator class we just coded or the class
    //from the Utilities library
    private int j=0; //The index of the next element to report
    private boolean removable = false;//Checks to see if we can use the remove method
    //We don't really need a constructor for this, since we will also default to the set values
    //hasNext Method
    public boolean hasNext(){
      return j < size;
    }
    public E next() throws NoSuchElementException{
      if(j==size){
        throw new NoSuchElementException("No next element");
      }
      removable = true;//Indicate that the object can be removed
      return data[j++];//Grab the next element
    }
    public void remove() throws IllegalStateException{
      if(!removable) throw new IllegalStateException("Nothing to remove");
      ArrayList_I.this.remove(j-1);
      j--;
      removable=false;//Do not allow remove to be called until called
    }
  }
  //Instance Variables
  public static final int CAPACITY=16;
  private E[] data;
  public int size=0;

  //Constructors
  //User Defines Capacity
  public ArrayList_I(int capacity){
    data = (E[]) new Object[capacity];
  }
  //Default Capacity
  public ArrayList_I(){
    this(CAPACITY);
  }

  //Create an Iterator for our ArrayList class
  public Iterator<E> iterator(){
    return new ArrayIterator();
  }
  //Utility Exception Method
  protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
      if(i<0 || i>=n){
        throw new IndexOutOfBoundsException("Illegal Index " + i);
      }
    }
  //Accessors Methods
  public int size(){return size;}
  public boolean isEmpty(){return size==0;}

  public E get(int i) throws IndexOutOfBoundsException{
    checkIndex(i, size);
    return data[i];
  }
  //Update Method
  //Set Method: Returns existing elemenet and overrides it
  public E set(int i, E e)throws IndexOutOfBoundsException{
    checkIndex(i, size);
    E temp = data[i];//Save element to retunr
    data[i]=e;//Override existing element
    return temp;
  }
  public void add(int i, E e)throws IndexOutOfBoundsException{
    checkIndex(i, size+1);
    if(size== data.length){
      reSize(2*size);
    }
    //Shift element to right
    for(int k=size+1; k>=i; k--){
      data[k+1]=data[k];
    }
    data[i]=e; //Add new element
    size++;//Update size
  }
  public E remove(int i) throws IndexOutOfBoundsException{
    checkIndex(i, size);
    E temp =data[i];//Collect element to return
    //Shift elements back
    for(int k=i; k<size-1; k++){
      data[k]= data[k-1];
    }
    data[size-1]=null;//Help with Memory MGT
    size--;
    return temp;
  }
  protected void reSize(int capacity){
    E[] temp =(E[]) new Object[capacity];
    for(int k=0; k<size; k++){
      temp[k]=data[k];
    }
    data = temp;
  }
}
