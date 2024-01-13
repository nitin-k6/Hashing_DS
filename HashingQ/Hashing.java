import java.util.*;
public class Hashing{
    public static void majorityElement(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(int k : map.keySet()){
            if(map.get(k)> nums.length/3){
                System.out.println(k);
            }
        }
    }
    public static void main(String[] args){
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);
    }
}