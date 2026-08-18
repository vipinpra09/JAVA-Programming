class Linkedlist{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String [] args){
        node a = new node(4);
        node b = new node(5);
        node c = new node(6);
        a.next = b;
        b.next = c;
        System.out.println(a.data);
        
    }
}
