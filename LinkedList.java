import java.io.*;
class node{
	int data;
	node next;
	node prev;	
	node(int val){
		this.data = val;
		this.next = null;
		this.prev = null;
	}
}	
public class LinkedList{
	static node head;
	static node tail;
	LinkedList(){
		this.head = null;
		this.tail = null;
	}
	static void forward(){
		node current = head;
		while(current != null){
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	static void nodeInsert(int data){
		node temp = new node(data);
		if(tail == null){
			head = temp;
			tail = temp;
		}
		else{
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}
	static void delete(){
		if(tail == null){
			return;
		}
		if(head == tail){
			head = null;
			tail = null;
		}
		node temp = tail; 
        tail = tail.prev; 
        tail.next = null; 
        temp.prev = null;
	}
	static void display(node head) { 
        node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " --> "); 
            temp = temp.next; 
        } 
        System.out.println("NULL"); 
    } 
	public static void main(String[] arg){
		nodeInsert(1);
		nodeInsert(2);
		nodeInsert(3);
		nodeInsert(4);
		nodeInsert(5);
		nodeInsert(6);
		
		System.out.println("Linked list after creation: ");
		display(head);
		
		System.out.println("Deletion at end: ");
		delete();
		
		System.out.println("Linked list after deletion: ");
		display(head);
	}
}
		

	
