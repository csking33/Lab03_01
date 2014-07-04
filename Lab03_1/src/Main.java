
public class Main 
{
	public static void main(String[] args)
	{
		double[] nums = new double[100];
		//Create array of 100 random numbers
		for(int i = 0; i < nums.length; i++){
			nums[i] = Math.random();
		}		
		printArray(nums);
		
		
		for(int i = 0; i < nums.length; i++)
		{
			//Check number at each index against every number in array
			//If number at first index is less than number at the second index
			//Switch values so that smallest number moves to end of array.
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[i] < nums[j])
				{
					double x = nums[i];
					nums[i] = nums[j];
					nums[j] = x;
				}
			}
		}
		
		printArray(nums);
	}
	
	public static void printArray(double[] d){
		for(int i = 0; i < d.length; i++){
			System.out.print("Value at index " + i + " = ");
			System.out.println(d[i]);
		}
		System.out.println();
	}
}
