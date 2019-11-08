package com.bridgelabz.functional.LinkedList;
public class LinkedList{
	Node head;
	public void push(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void show() {
		Node node=head;
		if(head==null) {
			System.out.println("List is empty");
		}else {
			while(node.next!=null) {
				System.out.print(node.data+" ");
				node=node.next;
			}
			System.out.print(node.data);
		}
	}
	
	public void pop() {
		if(head==null) {
			System.out.println("List is empty");
		}else if(head.next==null){
			head=null;
		}else{
		Node node=head;
		while(node.next.next!=null) {
			node=node.next;
		}
		node.next=null;
		}
	}
	
	public void unshift(int data) {
		Node node=new Node();
		node.data=data;
		if(head==null) {
			head=node;
			node.next=null;
		}else {
			Node n=head;
			head=node;
			node.next=n;
		}
		
		
	}
	
	public void shift() {
		if(head==null) {
			System.out.println("List is empty");
		}else if(head.next==null){
			head=null;
		} else{
			Node n1=head;
			Node n2=n1.next;
			head=n2;
		}
	}
	
	public void insertAt(int index,int data) {
		if(index==0) {
			unshift(data);
		}else {
		Node node=new Node();
		node.data=data;
		Node n2=node;
		Node n1=head;
		for(int i=0;i<index-1;i++) {
			n1=n1.next;
		}
		Node n3=n1.next;
		n1.next=n2;
		n2.next=n3;
		}
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			head=head.next;
		}else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			Node n1=n;
			n.next=n1.next.next;
		}
	}
	public int len() {
		Node n=new Node();
		n=head;
		int length=0;
		while(n.next!=null) {
			n=n.next;
			length++;
		}
		length++;
		return length;
	}
	public int get(int index) {
		Node n=new Node();
		n=head;
		for(int i=0;i<index;i++) {
			n=n.next;
		}
		return n.data;
	}
	public void rev() {
		Node n=head;
		int arr[]=new int[10];
		int i=0;
		while(n.next!=null) {
			arr[i]=n.data;
			i++;
			n=n.next;
		}
		arr[i]=n.data;
		for(int j=i;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
	}
	
}