package Array;

import java.util.LinkedList;
import LinkedList;

class ListNode {
    public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }

public class Rishbh {
	
	public static ListNode solution(ListNode A,int B) {
		while(A.next!=null) {
			if(A.val<B) {
				A.val=0;
				A=A.next;
				
			}else {
				int val=A.val;
				while(val%B==0) {
					if(val%B==0) {
						A.val=val;
						A=A.next;
					}
					val--;
				}
			}
		}return A;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head= takeInput.takeInput();
	}

}
