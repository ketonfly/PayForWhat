package leecode;



public class TwoSum {
	public static void main(String []args){
		int []numbers={2, 7, 11, 15};
		int target=9;
		int r[] = new int[2];
		r = new solution().twoSum(numbers, target);
		System.out.println("index1="+r[0]+", index2="+r[1]);
	}
}

class solution{
	public int[] twoSum(int[] numbers, int target) {
		
		int l = numbers.length;
		int result[] = new int[2];
        for(int i = 0 ;i<l;i++){
        	for(int j = i+1 ; j < l ; j++ ){
        		System.out.println(i+" " +j);
        		if(numbers[i] + numbers[j] == target){
        			result[0] = i+1;
        			result[1] = j+1;
        			return result;
        		}
        		
        			
        	}
        }
        return result;
    }
}

//modify my program
public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int l = numbers.length;
		int result[] = new int[2];
        for(int i = 0 ;i<l;i++){
        	if(hm.get(target - numbers[i])!=null){
        		if(hm.get(target-numbers[i]).intValue()!=i){
        			//这里面有问题，这个i必然是第二个数字
        			result[1] = i+1;
        			result[0] = hm.get(target-numbers[i]).intValue()+1;
        			return result;
        		}
        	}
        	else hm.put(numbers[i],i);
        }
        return result;
    }



// from internet
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] result = new int[2];
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < numbers.length; i++)
    	{
    		if (map.containsKey(target - numbers[i]))
    		{
    			result[0] = map.get(target-numbers[i]) + 1;
    			result[1] = i + 1;
    			break;
    		}
    		else
    		{
    			map.put(numbers[i], i);
    		}
    	}
        
        return result;
    }
}


