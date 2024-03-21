package br.edu.fateczl.stack;

class StringNode {
	
	private String data;
	private StringNode next;
	
	StringNode() {
		super();
	}

	StringNode(String data, StringNode next) {
		this.data = data;
		this.next = next;
	}

	String getData() {
		return data;
	}

	void setData(String data) {
		this.data = data;
	}

	StringNode getNext() {
		return next;
	}

	void setNext(StringNode next) {
		this.next = next;
	}
}
