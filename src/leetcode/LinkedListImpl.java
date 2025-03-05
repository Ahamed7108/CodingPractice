package leetcode;

public class LinkedListImpl {
    Node first=null;
    Node last=null;
    int count=0;
    public void add(int element){
        if(first==null){
            first=new Node(element,null);
            last=first;
            count++;
            return;
        }
        last.next=new Node(element,null);
        last=last.next;
        count++;
    }
    public int size(){
        return count;
    }
}
