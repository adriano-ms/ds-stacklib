package br.edu.fateczl.stack;

class IntNode {
	
	private Integer data;
	private IntNode next;
	
	IntNode() {
		super();
	}

	IntNode(Integer data, IntNode next) {
		this.data = data;
		this.next = next;
	}

	Integer getData() {
		return data;
	}

	void setData(Integer data) {
		this.data = data;
	}

	IntNode getNext() {
		return next;
	}

	void setNext(IntNode next) {
		this.next = next;
	}
}
