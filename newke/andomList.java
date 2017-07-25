import java.util.Random;

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;
	
	public RandomListNode(int lable) {
		this.label = label;
	}
}

public class andomList {
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) return pHead;
		RandomListNode pHead1 = new RandomListNode(pHead.label);
		RandomListNode p0 = pHead.next;
		RandomListNode p1 = pHead1;
		
		while(p0 != null) {
			RandomListNode q1 = new RandomListNode(p0.label);
			p0 = p0.next;
			p1.next = q1;
			p1 = q1;
		}
		
		RandomListNode p01 = pHead;
		
		RandomListNode p11 = pHead1;
		
		//RandomListNode p13 = pHead1;
		
		while(p01 != null) {
			while(p01.random == null) {
				p01 = p01.next;
				p11 = p11.next;
			}
			RandomListNode p02 = pHead;	
			RandomListNode p12 = pHead1;
			while(p02 != null) {
				if (p01.random == p02)
					break;
				p02 = p02.next;
				p12 = p12.next;
			}
			
			p11.random = p12;
			p01 = p01.next;
			p11 = p11.next;
			
		}
		return pHead1;
		
		
	}

}
