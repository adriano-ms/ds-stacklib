package br.edu.fateczl.stack;

public class StringStack {

	private StringNode top;

	public StringStack() {
		super();
	}

	public void push(String e) {
		StringNode newNode = new StringNode();
		newNode.setData(e);
		newNode.setNext(top);
		this.top = newNode;
	}

	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		String toReturn = top.getData();
		top = top.getNext();
		return toReturn;
	}

	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		return top.getData();
	}

	public Integer size() {
		if (isEmpty()) {
			return 0;
		}
		StringNode aux = top;
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
