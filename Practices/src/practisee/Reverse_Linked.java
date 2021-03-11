package practisee;

public class Reverse_Linked {
	public static void reverse( ListNode head)
	{
		if(head==null)
			return ;
		ListNode current=head;
		ListNode nextt=null;
		ListNode prev=null;
		while(current!=null)
		{
			nextt=current.next;
			current.next=prev;
			prev=current;
			current=nextt;
		}
		
	}



}
