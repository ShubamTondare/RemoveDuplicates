public class LinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }


    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data)
    {
        Node temp=new Node(data);
         if(head==null)
         {
             head=temp;
             tail=temp;
         }
         else
         {
             tail.next=temp;
             tail=temp;

         }

    }

    public void display(){
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }

    }
    public void cycle()
    {
        Node current=head;
        tail.next=current.next.next;
    }
    public int iscycle()
    {
        Node current=head;
        Node current2=head;
        while(current!=null && current.next!=null)
        {
            current=current.next.next;
            current2=current2.next;
            //if(current==current2)
            //    return true;
        }
        return current2.data;

    }

public static void main(String args[])
{
      LinkedList list=new LinkedList();
      list.addNode(1);
      list.addNode(2);
      list.addNode(3);
      list.addNode(4);
      list.addNode(5);
      //list.addNode(6);
      //list.cycle();
      list.display();
      System.out.println(list.iscycle());



}


}
