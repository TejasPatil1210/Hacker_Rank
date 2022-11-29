/*

Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

1
2
3
Hello
World

Do not use method overloading because your answer will not be accepted.

*/

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Integer integer[]={new Integer(1),new Integer(2),new Integer(3)};
        String string[]={"Hello","World"};
        Solution.single(integer);
        Solution.single(string);
        
    }
    
    public static void single(Object obj[])
    {
        for(Object object:obj)
        {
            System.out.println(object);
        }
    }
}