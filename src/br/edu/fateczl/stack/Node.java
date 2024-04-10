package br.edu.fateczl.stack;

class Node<T> {
	
	private T data;
	private Node<T> next;
	
	Node() {
		super();
	}

	Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	T getData() {
		return data;
	}

	void setData(T data) {
		this.data = data;
	}

	Node<T> getNext() {
		return next;
	}

	void setNext(Node<T> next) {
		this.next = next;
	}
}
