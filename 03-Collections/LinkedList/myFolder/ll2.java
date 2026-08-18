class Main{
    static class node{
        int data;
        node next;
        node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String [] args){
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        a.next = b;
        b.next = c;
        //System.out.println(a.next.data);
        node temp = a;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
