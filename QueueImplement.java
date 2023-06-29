class Queue{
    int rear;
    int size;
    int arr[];

    Queue(int n){
        rear=-1;
        size=n;
        arr=new int[size];
    }

    boolean isEmpty(){
        return (rear==-1);
    }
    
    boolean isFull(){
        return (rear==size-1);
    }

    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear]=x;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front=arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;

        return front;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int top=arr[rear];
        return top;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}

public class QueueImplement {
    public static void main(String[] args) {
        Queue q=new Queue(10);
        q.enqueue(5);
        q.enqueue(8);
        q.enqueue(12);
        q.enqueue(63);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.peek());
    }
}
