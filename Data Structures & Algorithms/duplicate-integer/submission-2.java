class Solution {
        public boolean hasDuplicate(int[] nums) {
                Map<Integer,Integer> map = new HashMap();
                        for(int i: nums){
                                    if(map.containsKey(i)){
                                                    int value = map.get(i);
                                                                    map.put(i,value+1);
                                                                                }
                                                                                            else{
                                                                                                            map.put(i, 1);
                                                                                                                        }
                                                                                                                                }
                                                                                                                                        System.out.println(map.toString());
                                                                                                                                                for(int i: map.keySet()){
                                                                                                                                                            if(map.get(i)>1)
                                                                                                                                                                            return true;           
                                                                                                                                                                                    }
                                                                                                                                                                                            return false;
                                                                                                                                                                                                }
                                                                                                                                                                                                }
