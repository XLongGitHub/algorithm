package newke.offer;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class DoubleNumber {
	public static void main(String[] args ){
		int[] num = {2,3,1,0,2,5,3};
		int[]  dup = new int[1];
		
	//	new DoubleNumber().duplicate(num, num.length, dup);
	//	System.out.println(dup[0]);
		Set set = new TreeSet();
		
		
		ListNode pHead = new ListNode(1);
    	ListNode p = pHead;
    	
    	ListNode q= new ListNode(2);
    	p.next = q;
    	p = q;
    	
    	q= new ListNode(3);
    	p.next = q;
    	p = q;
    	q= new ListNode(3);
    	p.next = q;
    	p = q;
    	q= new ListNode(4);
    	p.next = q;
    	p = q;
    	q= new ListNode(4);
    	p.next = q;
    	p = q;
    	q= new ListNode(5);
    	p.next = q;
    	p = q;
    	
    	pHead = deleteDuplication(pHead);
    	System.out.println("******");
    	System.out.println(pHead == null);
    	while (pHead != null) {
    		System.out.println(pHead.val);
    		pHead = pHead.next;
    		System.out.println("******");
    	}
    		
	}
	
	 // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	Arrays.sort(numbers);
    	for (int i = 0; i < numbers.length-1; i++) {
    		if (numbers[i]==numbers[i+1]) {
    			duplication[0] = numbers[i];
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public static ListNode deleteDuplication(ListNode pHead)
    {	
    	System.out.println("******");
//    	while (pHead != null) {
//    		System.out.println(pHead.val);
//    		pHead = pHead.next;
//    	}
    	
//    	System.out.println("******");
        if (pHead == null) return pHead;
        int len = 0;
        ListNode p = pHead;
        while (p != null) {
            len++;
            p = p.next;
        }
        int [] vals = new int[len];
        ListNode p1 = pHead;
        for (int i = 0; i < len; i++) {
           vals[i] = p1.val;
           p1 = p1.next;
//           System.out.println(vals[i]);
        }
        
        int [] dup = new int[len];
       
        System.arraycopy(vals, 0, dup, 0, len);
        Arrays.sort(dup);
//        for (int i : dup)
//        	System.out.println(i);
//        
        int [] ddup = new int[len];
        for (int i = 0; i<ddup.length; i++) 
        	ddup[i] = -99999; 
        int index = 0;
        for (int i = 0, j = 0; i < dup.length-1; i++) {
        	if (dup[i] == dup[i+1]) continue;
        	ddup[j] = dup[i];
        	j++;
        	index = j;
        }
        if (dup[len-1] != dup[len-2]) ddup[index] = dup[len-1]; 
        
        for (int i : ddup)
        	System.out.println(i);
        
        
        ListNode p2 = pHead;
        for (int i = 0; i<ddup.length && ddup[i] != -99999; i++){
        	p2.val = ddup[i];
        	p2 = p2.next;
        }
        //p2.next = null;
        return pHead;
    }
}
