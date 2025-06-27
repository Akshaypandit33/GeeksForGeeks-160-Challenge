package Arrays.Easy;


// Problem: Find the second largest element in an array
// Source: GFG
// Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
// Difficulty: Easy
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr ={10,10,10,5};
        System.out.println(findLargest(arr));
    }
    public static int findLargest(int[] arr) {
        int max=-1;
        int max2 =-1;
        for(int i=0; i<arr.length;i++)
        {
            if(max < arr[i])
            {
                if((max != max2))
                {
                    max2 = max;
                }
                max = arr[i];
            }
            else if((arr[i] > max2) &&( max != arr[i]))
            {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
