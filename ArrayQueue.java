import java.util.Arrays;
public class ArrayQueue<T> implements Queue<T>{
	T[] a = (T[]) new Object[10];
	int front = 0;
	int back = 0;

	public boolean empty(){
		return front == back;
	}
	public T dequeue(){
		//if(empty())
		//	throw new IllegalStateException("Queue is already empty");
		T item = a[front];
		front = (front+1)% a.length;
		return item;
	}
	public void enqueue(T item){
		if((back+1)% a.length == front)
			grow_array();
		a[back++] = item;
		back = back%a.length;
	}
	public void grow_array() {
		T[] new_a = (T[]) new Object[a.length*2];
		if(back > front)
		{
			System.arraycopy(a, front, new_a, 0, a.length-front);
		}
		else 
		{
			System.arraycopy(a, front, new_a, front, a.length-front);
			System.arraycopy(a, 0, new_a, a.length-front, back);
		}
		front = 0; 
		back = a.length-1; 
		a = new_a;
	}

}