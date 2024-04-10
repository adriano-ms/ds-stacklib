package br.edu.fateczl.stack;

public class Stack<T> {

	private Node<T> top;

	public Stack() {
		super();
	}

	public void push(T data) {
		Node<T> newNode = new Node<>();
		newNode.setData(data);
		newNode.setNext(top);
		this.top = newNode;
	}

	public T pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		T toReturn = top.getData();
		top = top.getNext();
		return toReturn;
	}

	public T top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		return top.getData();
	}

	public Integer size() {
		if (isEmpty()) {
			return 0;
		}
		Node<T> aux = top;
		int count = 1;
		while (aux.getNext() != null) {
			count++;
			aux = aux.getNext();
		}
		return count;
	}

	public Boolean isEmpty() {
		return top == null;
	}
}
