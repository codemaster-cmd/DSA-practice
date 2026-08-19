class StockSpanner {
    Stack<int[]> st = new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1; // current  span of stock within itself  is 1

        while(!st.isEmpty()  && st.peek()[0] <= price){ // here [0] acts as first  element (price) and  [1] as a 2nd element span
            span = span + st.peek()[1];
            st.pop();
        }

        st.push(new int[] {price , span});
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */