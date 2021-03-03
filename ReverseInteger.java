/*
Problem 7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/


import java.util.Scanner;
public class ReverseInteger
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the NUMBER: ");
		int x = sc.nextInt();
		Solution ob = new Solution();
		System.out.print(ob.reverse(x));
		
	}
}
class Solution {
    public int reverse(int x) {
        int sum = 0;
        while (x != 0)
        {
            int r = x % 10;
            int result = sum * 10 + r;
            x = x / 10;  
            if ((result - r) / 10 != sum)
            {
                return 0;
            }
            sum = result;
        }
        return sum;
    }
}