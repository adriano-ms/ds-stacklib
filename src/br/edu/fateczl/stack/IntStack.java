package br.edu.fateczl.stack;

public class IntStack {

	private IntNode top;

	public IntStack() {
		super();
	}

	public void push(Integer e) {
		IntNode newNode = new IntNode();
		newNode.setData(e);
		newNode.setNext(top);
		this.top = newNode;
	}

	public Integer pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		Integer toReturn = top.getData();
		top = top.getNext();
		return toReturn;
	}

	public Integer top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		return top.getData();
	}

	public Integer size() {
		if (isEmpty()) {
			return 0;
		}
		IntNode aux = top;
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
