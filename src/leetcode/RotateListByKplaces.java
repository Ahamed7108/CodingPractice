package leetcode;

public class RotateListByKplaces {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.first=l1;
        l1.last=l1.first;
        l1.last.next=new ListNode(2);
        l1.last=l1.last.next;
        l1.last.next=new ListNode(3);
        l1.last=l1.last.next;

        l1.swap();
        //l1.swapPairs();
        System.out.println(l1);
    }
}
