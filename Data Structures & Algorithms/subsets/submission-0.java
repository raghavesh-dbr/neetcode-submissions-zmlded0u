class Solution {

    public List<List<Integer>> getSubset(int ind,List<Integer>arr,List<List<Integer>>ds,List<Integer> temp){
        if(ind==arr.size()){
            ds.add(new ArrayList(temp));
            return ds;
        }
        temp.add(arr.get(ind));
        getSubset(ind+1,arr,ds,temp);
        temp.remove(arr.get(ind));
        getSubset(ind+1,arr,ds,temp);
        return ds;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
       List<Integer> input = new ArrayList();
       for(int i : nums){
            input.add(i);
       }
        return getSubset(0,input,new ArrayList(),new ArrayList());
    }
}
