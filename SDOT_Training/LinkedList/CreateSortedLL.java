import java.util.*;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void print(){  
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp;
        temp=head;
        while(temp!=null){
            
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
     public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        
        Node newnode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void addSorted(int data){
        int i=0;
     
        Node temp = head;
        if(head==null){
            Node newnode = new Node(data);
            head= newnode;
        }
        else if(data>temp.data){
            while(temp!=null){
            temp=temp.next;
            i++;
            }
            add(i,data);
        }
        else if(data<=temp.data){
            add(i,data);
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Main ll = new Main();
        int k;
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            k=sc.nextInt();
            ll.addSorted(k);
        }
        ll.print();
    }
}
