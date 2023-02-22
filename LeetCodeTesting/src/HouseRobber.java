
public class HouseRobber {

	int [] nums = {2,7,9,3,1};
  //  int N = nums.length;
    
    // Special handling for empty array case.
    if (nums.length == 0) {
    	System.out.println(0);
    }
    int preMax =0, currMax =0;
    //1st subarray
    //this avoids the ends being adjacent 
    for(int i = 0; i<nums.length; i++){
        int t = currMax; 
        currMax = Math.max(preMax + nums[i], currMax);
        preMax = t; 
    }
    System.out.println("------------------------");
    System.out.println(currMax); 

	
}
