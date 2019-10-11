import java.util.Arrays;
public class ArrayStack<T> implements Stack<T>
{
	private T[] a = (T[]) new Object[10];
	private int top = -1;

	public void push(T item)
		{
			if(a.length - 1 == top) 
			{
				grow_array();
			}
			a[++top] = item; 
		}
	public T pop()
	{
		return a[top--]; 
	}
	public T peek()
	{
		return a[top]; 
	}
	public boolean empty(){
		if (top == -1){
			return true;
		}
		else
		{
			return false;
		}
	}
	private void grow_array()
	{
		T[] new_a = Arrays.copyOf(a, a.length*2); 
		a = new_a;
	}
}