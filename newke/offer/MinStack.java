package newke.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Xulong on 2017/3/24.
 * 包含min函数的栈
 */
public class MinStack {
    Stack stack = new Stack();
    List list = new ArrayList();

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return (Integer) stack.peek();
    }

    public int min() {

        list = stack.subList(0, stack.size());
        int min = (int) list.get(0);
        for (int i = 0; i < list.size(); i++) {
                if (min > (int)list.get(i))
                    min = (int) list.get(i);
        }
        return min;
    }
}
