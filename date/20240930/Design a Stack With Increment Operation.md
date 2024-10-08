# 1381. [Design a Stack With Increment Operation](https://leetcode.com/problems/design-a-stack-with-increment-operation/description/?envType=daily-question&envId=2024-09-30)

## Solution

```java
class CustomStack {
    int [] stack;
    int top = -1;

    public CustomStack(int maxSize) {
        this.stack = new int [maxSize];
    }
    
    public void push(int x) {
        if (top < this.stack.length - 1) {
            top ++;
            this.stack[top] = x;
        }
    }
    
    public int pop() {
        if (top != -1) {
            return this.stack[top --];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, top + 1); i ++) {
            this.stack[i] += val;
        }
    }
}
```

##

![image](https://github.com/user-attachments/assets/0528374c-04c0-4c5f-9087-e9e60cc3dda9)
