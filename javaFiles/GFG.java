// Java program to implement
// the above approach
class GFG
{
	public static double log2(int x)
	{
		return (Math.log(x) / Math.log(2));
	}

	// Function to find the minimum number of rats
	static int minRats(int n)
	{
		return (int)(Math.floor(log2(n)) + 1);
	}
	
	// Driver Code
	public static void main (String[] args)
	{
		// Number of bottles
		int n = 100;
	
		System.out.println("Minimum " + minRats(n) +
						" rat(s) are required");
	}
}

// This code is contributed by AnkitRai01
