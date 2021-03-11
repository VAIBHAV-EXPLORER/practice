package practisee;

import java.util.Scanner;

public class SinglyLinkedlist {
	private  ListNode head;
	/*private  class ListNode {
		private int data;
		private ListNode next;
	  private ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	 */
	public void display()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		SinglyLinkedlist ob=new SinglyLinkedlist();
		ob.head=new ListNode(in.nextInt());
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(1);
		ListNode fourth=new ListNode(11);
		ob.head.next=second;
		second.next=third;
		third.next=fourth;
		
		ob.display();
		
		Reverse_Linked.reverse(ob.head);
		ob.display();
		in.close();
	}
	





}
