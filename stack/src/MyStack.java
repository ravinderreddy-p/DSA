public class MyStack {
    int[] arr;
    int top;
    int capacity;

    public MyStack(int c){
        capacity = c;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int n){
        if(top == capacity-1){
            System.out.println("raise an exception for overflow");
        }
        top++;
        arr[top] = n;
    }

    public int pop(){
        if(top == -1){
            System.out.println("raise an exception for underflow");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public int size(){
        return top+1;
    }

    public int peek() {
        if(top == -1){
            System.out.println("raise an exception for underflow");
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}

class Test{
    public static void main(String[] args){
            MyStack stack = new MyStack(5);
            stack.push(5);
            stack.push(10);
            System.out.println(stack.peek());

        }
        }
