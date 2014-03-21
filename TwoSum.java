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
