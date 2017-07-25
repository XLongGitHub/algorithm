package newke.offer;
import java.util.ArrayList;
import java.util.Iterator;

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
 
class ReListNode {
	int val;
	ReListNode pre = null;
	ReListNode next = null;
	
	ReListNode(int val) {
		this.val = val;
	}
}

public class Solution {
	
	public static void main(String [] args) {
		//System.out.println(new Solution().replaceSpace(new StringBuffer("helloword ")));
		//System.out.println(new Solution().Fibonacci(1));
		/*System.out.println(new Solution().JumpFloor(6));
		
		System.out.println(""+cc(10, 10));
		System.out.println(""+cc(2, 10));
		System.out.println(""+cc(1, 10));
		System.out.println( 1>0 && 3<0);*/
		
		ListNode head1 = new ListNode(1);
		ListNode tem1 =head1;
		tem1.next = new ListNode(2);
		tem1 = tem1.next;
		tem1.next = new ListNode(3);
		tem1 = tem1.next;
		tem1.next = new ListNode(4);
		tem1 = tem1.next;
		tem1.next = new ListNode(5);
		tem1 = tem1.next;
		
		ListNode head2 = new ListNode(30);
		ListNode tem2 =head2;
		tem2.next = new ListNode(76);
		tem2 = tem2.next;
		tem2.next = new ListNode(325);
		tem2 = tem2.next;
		tem2.next = new ListNode(432);
		tem2 = tem2.next;
		tem2.next = new ListNode(51111);
		tem2 = tem2.next;
		
		printList(head1);
		printList(head2);
		System.out.println("");
		printList(Merge(head1, head2));
		//printList(ReverseList(head));
		
		
	}
	
	public static ListNode Merge(ListNode list1,ListNode list2) {
	       
		ListNode head = null;
		if (list1.val <= list2.val) {
	        	head = new ListNode(list1.val); 
	        	list1 = list1.next;
	      } else {
	            head = new ListNode(list2.val); 
	            list2 = list2.next;
	      }
	        
	      ListNode p = null;
	      p = head;
	        while (list1 != null || list2 != null) {
	            if (list1 != null && list2 != null) {
	                 if (list1.val <= list2.val) {
	                    p.next = new ListNode(list1.val); 
	                    p = p.next;
	                    list1 = list1.next;
	                    
	                } else {
	                    p.next = new ListNode(list2.val); 
	                    p = p.next;
	                    list2 = list2.next;
	                }
	            } else if (list1 == null) {
	                p.next = new ListNode(list2.val);
	                p = p.next;
	                list2 = list2.next;
	                
	            } else if (list2 == null) {
	                p.next = new ListNode(list1.val);
	                p = p.next;
	                list1 = list1.next;
	            }   
	        }
	        System.out.println("re");
	        return head;
	        
	    }   
	
	public static void printList(ListNode head){
		while(head !=null) {
			System.out.println(head.val);
			head = head.next;
		}
		
	}
	
	public static void printList(ReListNode head){
		while(head !=null) {
			System.out.println(head.val);
			head = head.next;
		}
		
	}
	
	public static void printReList(ReListNode tail){
		while(tail !=null) {
			System.out.println(tail.val);
			tail = tail.pre;
		}
		System.out.println("\n\n");
	}
	
	 public static ListNode ReverseList(ListNode head) {
			
		 	if (head == null) 
		 		return head;
		 	
		 	ReListNode rHead = new ReListNode(head.val);
		 	ReListNode p = rHead;
		 	ReListNode p1 = null;
		 	head = head.next;
		 	
		 	while(head != null) {
		 		p1 = new ReListNode(head.val);
		 		p.next = p1;
		 		p1.pre = p;
		 		
		 		p = p1;
		 		head = head.next;
		 	}
		 	
		 	printList(rHead);
		 	System.out.println("******\n");
		 	printReList(p);
		 	
		 	ListNode reverseList = new ListNode(p.val);
		 	ListNode q = reverseList;
		 	p = p.pre;
		 	printList(reverseList);
		 	while(p!= null) {	
		 		q.next = new ListNode(p.val);
		 		p = p.pre;
		 		q = q.next;
		 	}
		 	printList(reverseList);
		 	return reverseList;
		 
		 
		 
		 
		 /*//int len = 0;
	        ListNode temp = null, head1;
	        temp = head;
	        
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        
	        while(head != null) {
	            arrlist.add(head.val);
	            head = head.next;
	        }
	        
	        for (int i=arrlist.size(); i>=0; i--) {    
	        }
	        
	        
	        head1 = temp;
	        while(!arrlist.isEmpty()) {
	            temp.val = arrlist.remove(arrlist.size()-1);
	            temp.next = temp;
	        }
	        
	        return head1;*/
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 /* public int Sum_Solution(int n) {
	       int sum;
	       n  && sum = (Sum_Solution(n-1) + n);
	       return sum;       
	        int n1 = 0;
	        n1 = n;
	       int ans = n;
	       (n1 != 0) && ((ans += Sum_Solution(n - 1)) ==1);
	       return ans;
	    }
	*/
	public int JumpFloor(int target) {
        if (target == 1)
            return 1;
		int dou = target / 2;
        int total = 0;
        int left = 0;
        
        for (int i=0; i <= dou; i++) {
            left = target - i;
            total += cc(i, left);
        }
        
        return total;
    }
    
    public static int cc(int c1, int c2) {
        if (c1 == 0)
            return 1;
        int n1 = 1, n2 = 1; 
        
        
       for (int i=0; i<c1; i++) {
           n2 *= (c2--);
       }
        
       for (int j=1; j<=c1; j++) {
           n1 *= j;
       }
       return n2 / n1;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	public int Fibonacci(int n) {
			if (1 ==n  || 0 == n)
              return 1;
      	else return Fibonacci(n-1) + Fibonacci(n-2);
  }
	
    public String replaceSpace(StringBuffer str) {
    	/*
    	String [] strArr = str.toString().split(" ");
        String repStr = "";
        
        for(int i=1; i<strArr.length-1; i++) {
        	repStr = strArr[i] + "%20";    
        }
        
        repStr += strArr[strArr.length-1];
        if (str.toString().charAt(str.toString().length()-1) == ' ')
            repStr += "%20";   
        return repStr;
        */
    	String str1 = str.toString();
    	return str1.replace(" ", "%20");
    }
    /*
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Iterator list = listNode.iterator();
        if (list.hasNext()) {
            System.out.println(""+list.next());
        }
        
    }
    */
}