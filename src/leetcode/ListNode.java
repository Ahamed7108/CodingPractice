package leetcode;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode first=null;
    ListNode last=null;
     public ListNode(){

     }
     public ListNode(int val){
         this.val=val;
     }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public void swapPairs(){
         ListNode prev=null;
         ListNode  curr=first;
         first=first.next;
         while (curr!=null&&curr.next!=null){
             ListNode next=curr.next;
             curr.next=next.next;
             next.next=curr;
             if(prev!=null)prev.next=next;
             prev=curr;
             curr=curr.next;
           }
    }
    public void swap(){
         ListNode dummy=new ListNode();
         dummy.next=first;
         ListNode point=dummy;
         while(point.next!=null&&point.next.next!=null){
             ListNode swap1=point.next;
             ListNode swap2=point.next.next;
             swap1.next=swap2.next;
             swap2.next=swap1;
             point.next=swap2;
             point=swap1;
         }
         first=dummy.next;

    }
    public void Rotate(){
         int k=2;
         ListNode curr=first;
         int len=1;
         while(curr.next!=null){
             len++;
             curr=curr.next;
         }
         k=k%len;
         if(k==0)return;
         ListNode change=first;
         for(int i=0;i<len-k-1;i++){
             change=change.next;
         }
         ListNode temp=change.next;
         temp.next=null;
         curr.next=first;
         first=temp;


    }

    public String toString(){
         String res="";
         ListNode curr=first;
         while(curr!=null){
             if(curr.next==null){
                 res=res+curr.val;
             }
             else {
                 res = res + curr.val + "->";
             }
             curr=curr.next;
         }
         return res;
    }
    public  void Partion(){
         int x=3;
      ListNode head=first;
      ListNode left=new ListNode();
      ListNode right=new ListNode();
      ListNode ltail=left;
      ListNode rtail=right;
      while(head!=null){
          if(head.val<x){
              ltail.next=head;
              ltail=ltail.next;
          }
          else{
              rtail.next=head;
              rtail=rtail.next;
          }
          head=head.next;
      }
     ltail.next=right.next;
      rtail.next=null;
      first=left.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.first=l1;
       l1.last=l1.first;
       l1.last.next=new ListNode(4);
       l1.last=l1.last.next;
        l1.last.next=new ListNode(3);
        l1.last=l1.last.next;
        l1.last.next=new ListNode(2);
        l1.last=l1.last.next;
        l1.last.next=new ListNode(5);
        l1.last=l1.last.next;
        l1.last.next=new ListNode(2);
        l1.last=l1.last.next;

       // l1.swap();
       //l1.Rotate();
        //l1.swapPairs();
         l1.Partion();
        System.out.println(l1);
    }
}
