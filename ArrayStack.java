import java.util.Arrays;
public class ArrayStack<T> implements Stack<T>
{
	private T[] a = (T[]) new Object[10];
	private int top = -1;

	public void push(T item){//adds an item to the top of the stack
			if(a.length - 1 == top) 
			{
				grow_array();
			}
			a[++top] = item; 
		}
	public T pop(){//removes the top item from the stack and returns it
		return a[top--]; 
	}
	public T peek(){//returns the item on the top of the stack
		return a[top]; 
	}
	public boolean empty(){//returns true if the stack is empty, false if it is not.
		return(top == -1)
	private void grow_array(){
		T[] new_a = Arrays.copyOf(a, a.length*2); 
		a = new_a;
	}
}