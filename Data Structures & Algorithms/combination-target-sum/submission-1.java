class Solution {
    // private static List<List<Integer>> combinationSum2(int ind, List<Integer> arr,
    //                                                       List<List<Integer>> ds,
    //                                                       List<Integer> temp,
    //                                                       int target) {
    //         if (ind == arr.size()) {
    //             if (target == 0) {
    //                 ds.add(new ArrayList<>(temp));
    //             }
    //             return ds;
    //         }

    //         // take current element (if it does not exceed target)
    //         if (arr.get(ind) <= target) {
    //             temp.add(arr.get(ind));
    //             combinationSum2(ind, arr, ds, temp, target - arr.get(ind));
    //             temp.remove(temp.size() - 1);
    //         }

    //         // not take current element
    //         combinationSum2(ind + 1, arr, ds, temp, target);

    //         return ds;
    //     }

    private static List<List<Integer>> combinationSum2(int ind, int[] arr,
                                                          List<List<Integer>> ds,
                                                          List<Integer> temp,
                                                          int target) {
            if (ind == arr.length) {
                if (target == 0) {
                    ds.add(new ArrayList<>(temp));
                }
                return ds;
            }

            // take current element (if it does not exceed target)
            if (arr[ind] <= target) {
                temp.add(arr[ind]);
                combinationSum2(ind, arr, ds, temp, target - arr[ind]);
                temp.remove(temp.size() - 1);
            }

            // not take current element
            combinationSum2(ind + 1, arr, ds, temp, target);

            return ds;
        }    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
     return combinationSum2(0,nums,new ArrayList(),new ArrayList(),target);
    }
}
