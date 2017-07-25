import java.util.Stack;

public class statck_queue {
	 Stack<Integer> stack1 = new Stack<Integer>();
	 Stack<Integer> stack2 = new Stack<Integer>();
	 //["PSH1","PSH2","PSH3","POP","POP","PSH4","POP","PSH5","POP","POP"]
	 public static void main(String []args) {
		 statck_queue sq = new statck_queue();
		 sq.push(1);
		 sq.push(2);
		 sq.push(3);
		 System.out.println(sq.pop());
		 System.out.println(sq.pop());
		 sq.push(4);
		 System.out.println(sq.pop());
		 sq.push(5);
		 System.out.println(sq.pop());
		 System.out.println(sq.pop());
		 
	 }
	 
	 
	 
	 public int minNumberInRotateArray(int [] array) {
	    	if (0 == array.length) 
	            return 0;
	        if (1 == array.length) 
	            return array[0];
	        int pre = array[0];
	        
	        for (int i=0; i<array.length-1; i++) {
	            if (array[i]>array[i+1])
	            	pre = array[i+1];
	        }
			return pre;
	 }


	 public void push(int node) {
		 if (stack1.isEmpty() && stack2.isEmpty()){
			 stack1.push(node);
		 } else if (stack1.isEmpty() && !stack2.isEmpty()) {
			 stack2.push(node);
			/* while(!stack2.isEmpty()) {
				 stack1.push(stack2.pop());
			 }*/
		 } else {
			 stack1.push(node);
			/* while(!stack1.isEmpty()){
				 stack2.push(stack1.pop());
			 }*/
		 }
	 }
	 
	 
	    
	 public int pop() {
		 int temp = 0;
	    if (!stack1.isEmpty()) {
	    	while(!stack1.isEmpty()) {
	    		temp = stack1.pop();
		    	stack2.push(temp);
	    	}
	    	stack2.pop();
	    	while(!stack2.isEmpty()) {
	    		stack1.push(stack2.pop());
	    	}
	    
	    
	    } else {
	    	while(!stack2.isEmpty()) {
		    	
	    		temp = stack2.pop();
	    		stack1.push(temp);
	    	}
	    	stack1.pop();
	    	
	    	while(!stack1.isEmpty()) {
	    		stack2.push(stack1.pop());
	    	}
	    	
	    }
	    return temp;
	 }
}
