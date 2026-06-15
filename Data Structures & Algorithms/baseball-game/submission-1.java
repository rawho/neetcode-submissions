class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String op: operations){
            if("+".equals(op)){
                int top = st.pop();
                int newTop = st.peek();
                st.push(top);
                st.push(top + newTop);
                sum += st.peek();
            } else if ("D".equals(op)){
                st.push(st.peek() * 2);
                sum += st.peek();
            } else if ("C".equals(op)){
                sum -= st.pop();
            } else{
                st.push(Integer.parseInt(op));
                sum += st.peek();
            }
        }

        return sum;
    }
}