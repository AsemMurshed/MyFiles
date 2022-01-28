/**
 * Created by asem on 24/01/2022.
 */
public class ArrayStack<E>implements Stack<E>{


    E data [];
    int top = -1;
    static final int CAPACITY =100;

    public ArrayStack(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
            throw new IllegalStateException("Stack is full");
        data[++top]=element;

    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E x=data[top];
        data[top]=null;
        top--;
        return x;
    }

    @Override
    public E top() {
        if (isEmpty()){return null;}
        return data[top];

    }
}
