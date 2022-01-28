/**
 * Created by asem on 26/01/2022.
 */
public class Stacks<E> implements Stack<E> {




    E x[];
    int top = -1;
    static final int CAPACITY =100;

    public Stacks(int c) {
        x = (E[]) new Object[c];
    }

    public Stacks() {
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
        if (size()== x.length)
            throw new IllegalStateException("Stack is full");
        x[++top]=element;

    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E x= this.x[top];
        this.x[top]=null;
        top--;
        return x;
    }

    @Override
    public E top() {
        if (isEmpty()){return null;}
        return x[top];

    }
}
