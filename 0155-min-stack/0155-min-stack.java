class MinStack {
    public static class Node{
        int data;
        int min;
        Node next;
        public Node(int data, int min){
            this.data = data;
            this.min = min;
            this.next = null;
        }
    }

    private Node head;
    
    

    public MinStack() {
     

        
    }
    
    public void push(int value) {
        

        if(head == null){
            head = new Node(value , value);
            return;

        }
        int currMin = Math.min(value , head.min);
        Node newNode = new Node(value , currMin);
        newNode.next = head;
        head = newNode;
       
        
        return;
        
        
    }
    
    public void pop() {
        if(head == null){
            return;
        }
        head = head.next;
        return;

        
    }
    
    public int top() {
        if(head == null){
            return -1;
        }
        return head.data;
        

       

        
    }
    
    public int getMin() {
       if(head == null){
        return -1;
       }

       return head.min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */