/**
 * Created by Administrator on 1/24/2022.
 */
public class SinglyLinkedList_R_3_6<E> {
    Node<E>head=null;
    Node<E>tail=null;
    int size=0;
    public SinglyLinkedList_R_3_6() {
    }
/*
find the second to last node

  */////////////////////////////////////////////////////
Node start;

public void push(int data)
{
    if(this.start == null)
    {
        Node temp = new Node(data);
        this.start = temp;
    }
    else
    {
        Node temp = new Node(data);
        temp.next = this.start;
        this.start = temp;
    }
}

public int findSecondLastNode(Node ptr)
{
    Node temp = ptr;
    if(temp == null || temp.next == null)
        return -1;
    while(temp.next.next != null)
    {
        temp = temp.next;
    }
    return (int) temp.data;
}

///////////////////////////////////////////////////////////////////////









    public boolean isEmpty()
    {
        return size==0;
    }

    public int size()
    {
        return size;
    }

    public E first()
    {
        if (isEmpty())return null;
        return head.getData();
    }

    public E last()
    {
        if (isEmpty())return null;
        return tail.getData();
    }


   public void addFirst(E element)
   {
       head=new Node<E>(element,head);
       if (size==0)
           tail=head;
       size++;
   }

    public void addLast(E element)
    { Node<E>newest= new Node<E>(element,null);
        if (isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        size++;
    }

    public E removeFirst()
    {
        if (isEmpty())
            return null;
        E deleted=head.getData();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return deleted;
    }

    public static class Node<E>
    {
       private E data;
       private Node<E> next;
        public Node() {
        }

        public Node(E element) {
            this.data = element;
        }

        public Node(E element, Node<E> next) {
            this.data = element;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
