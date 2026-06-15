class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("+")){
                res.add(res.get(res.size()-1) + res.get(res.size()-2));
            } else if (operations[i].equals("C")){
                res.remove(res.size()-1);
            } else if (operations[i].equals("D")){
                res.add(res.get(res.size()-1) * 2);
            } else{
                res.add(Integer.parseInt(operations[i]));
            }
            
            
        }
        int sum = 0;
        for(int r: res){
            sum += r;
        }

        return sum;
        
    }
}