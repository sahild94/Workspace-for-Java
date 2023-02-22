
public class HouseRobber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newline = System.lineSeparator();
		int [] nums = {2,7,9,3,4,1};
		 int N = nums.length;
		    
		    // Special handling for empty array case.
		    if (nums.length == 0) {
		    	System.out.println(0);
		    }
		    int preMax =0, currMax =0;
		    //1st subarray
		    //this avoids the ends being adjacent 
		    for(int i = 0; i<nums.length; i++){
		        int t = currMax; 
		        System.out.printf("value of i " + i +" " );
		        System.out.printf("value of old preMax: "+ preMax + " ");
		        System.out.printf("value of currMax: "+ currMax + " ");
		     		        
		        currMax = Math.max(preMax + nums[i], currMax);
		        System.out.printf(newline + "value of house "+ nums[i]);
		        System.out.println(newline+ "value of pre + house " + (preMax + nums[i]));
		        preMax = t; 
		        System.out.println("value of new MAX/current "+currMax);
		        System.out.println("------------------------");
		    }
		    System.out.println("------------------------");
		    System.out.println(currMax); 


	}

}
