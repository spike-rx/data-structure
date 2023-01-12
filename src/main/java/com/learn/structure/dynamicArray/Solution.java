package com.learn.structure.dynamicArray;

/*?*?
Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int x: nums) {
            if(!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
