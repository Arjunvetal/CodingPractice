
class LinkedList{
	
	Node head;
	
	
	class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void add(int data) {
		Node newNode=new Node(data);
		
		if(head==null)
			head=newNode;
		else
		{
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next=null;
					
		}
		
			
		
	}
	
	public void addPos(int data,int pos) {
		Node newNode=new Node(data);
		Node temp=head;
		for(int i=0;i<pos-2;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		
		temp.next=newNode;
		
	}
	public void print() {
		Node curr=head;
		
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	public void reversePrint() {
		Node curr=head;
		Node prev=null;
		
		while(curr!=null) {
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
	}
	
	public void deletFirst() {
		head=head.next;
	}
	
	public void deletLast() {
		Node temp=head;
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		
	}
	
	
	public void deletPos(int pos) {
		Node temp=head;
//		int size=0;
//		while(temp!=null) {
//			size++;
//			temp=temp.next;
//		}
		for(int i=0;i<pos-2;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
}


public class LinkedListInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.print();
		list.reversePrint();
	//	list.deletPos(3);
		
		//list.addPos(11, 1);
		
	//	list.deletLast();
		
		//list.add(55);
//		list.deletFirst();
//		list.deletFirst();
		list.print();

	}

}
