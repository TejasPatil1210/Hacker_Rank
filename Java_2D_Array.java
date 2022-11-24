/*

You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly 6 lines, each containing 6 integers seperated by spaces. Each integer will be between -9 and 9 inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19

Explanation

The hourglass which has the largest sum is:

2 4 4
  2
1 2 4

*/

import java.util.*;

class Solution {
    public static void main(String[] args) {
 
        int newArr[][]=new int[6][6];

        Scanner scan=new Scanner(System.in);
        for(int i=0;i<newArr.length;i++)
        {
            for(int j=0;j<newArr.length;j++)
            {
                newArr[i][j]=scan.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<newArr.length;i++)
        {
            for(int j=0;j<newArr.length;j++)
            {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }

        int sum=0;int max=0;
        for(int i=0;i<newArr.length-2;i++)
        {
            for(int j=0;j<newArr.length-2;j++)
            {
                sum=(newArr[i][j]+newArr[i][j+1]+newArr[i][j+2])+(newArr[i+1][j+1])+(newArr[i+2][j]+newArr[i+2][j+1]+newArr[i+2][j+2]);
           
            if(i==0&&j==0)
            {
                max=sum;
            }
            if(sum>max) max=sum;           
            }
        }
         System.out.println(max);
    }
}
