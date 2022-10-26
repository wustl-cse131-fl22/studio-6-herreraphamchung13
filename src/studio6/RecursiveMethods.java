package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
			if(n==0)
			{
				return 0;
			}
			else
			{
				double power = Math.pow(0.5,n);
				return power + geometricSum(n-1);
			}
			// FIXME compute the geometric sum for the first n terms recursively
			
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p%q==0)
		{
			return q;
		}
			// FIXME compute the gcd of p and q using recursion
		else
		{
			int remainder = p%q;
			return gcd(q,remainder);
		}
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] array2  = new int [array.length];
		int count2= array.length-1;
		int reverse2= 0;
		 clone(array,count2,reverse2,array2);
		 return array2;
			// FIXME create a helper method that can recursively reverse the given array
			
		
	}
	public static void clone(int[] array, int count1, int reverse1, int[] array2)
	{
		if(array.length%2==0)
			if(!(reverse1>count1)) {
				int count = count1;
				int reverse = reverse1;
				array2[reverse] = array[count];
				array2[count]=array[reverse];
				count=count-1;
				reverse=reverse+1;
				 clone (array, count, reverse,array2);
			}
		if(array.length%2!=0)
			if(reverse1==count1) {
				int count = count1;
				int reverse = reverse1;
				array2[reverse] = array[count];
				array2[count]=array[reverse];
				count=count-1;
				reverse=reverse+1;
				 clone (array, count, reverse,array2);
			}
		
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
