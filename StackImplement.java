class Stack{
    final int max=1000;
    int arr[]=new int[max];
    int top;

    Stack(){
        top=-1;
    }

    boolean isFull(){
        return (top==max-1);
    }

    boolean isEmpty(){
        return (top==-1);
    }

    void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++top]=x;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int x=arr[top--];
        return x;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int x=arr[top];
        return x;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}

public class StackImplement{
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(9);
        st.push(8);
        st.push(2);
        st.push(17);
        st.push(32);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
    }
}