public class LinkedListImplement {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
    }

    void addFirst(int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    void addLast(int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }

    void deleteData(int x){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        Node prev=head;
        while(curr!=null){
            if(curr.data==x){
                prev.next=curr.next;
                return;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
    }

    void reverse(){
        if(head==null || head.next==null){
            return;
        }
         Node curr=head;
         Node prev=null;
         while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
         }
         head=prev;
    }

    void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" --> ");
            curr=curr.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedListImplement ll=new LinkedListImplement();
        ll.addFirst(6);
        ll.addFirst(25);
        ll.addFirst(2);
        ll.addFirst(58);
        ll.addFirst(45);
        ll.addFirst(21);
        ll.display();

        ll.addLast(65);
        ll.addLast(3);
        ll.display();

        ll.deleteFirst();
        ll.display();

        ll.deleteLast();
        ll.display();

        ll.deleteData(58);
        ll.display();
        
        ll.reverse();
        ll.display();
    }
}
