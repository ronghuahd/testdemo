package com.algorithm.testdemo.lambdatest.exercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*你仅使用两个栈实现先入先出队列。队列应当支持一般队列的支持的所有操作（push、pop、peek、empty）：
        实现 MyQueue 类：
        void push(int x) 将元素 x 推到队列的末尾
        int pop() 从队列的开头移除并返回元素
        int peek() 返回队列开头的元素
        boolean empty() 如果队列为空，返回 true ；否则，返回 false
        说明：
        你只能使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
        你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
        进阶：
        你能否实现每个操作均摊时间复杂度为 O(1) 的队列？
        换句话说，执行 n 个操作的总时间复杂度为 O(n) ，即使其中一个操作可能花费较长时间。
*/
public class MyQueue {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    int front;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1=new ArrayDeque<>();
        s2=new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.isEmpty()){
            front=x;
        }
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!s2.isEmpty()){
            return s2.peek();
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
