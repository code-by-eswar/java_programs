import java.util.Arrays;

class LargestElement
{
  public static void main(String args[])
  {
     int arr[] = {10, 324, 45, 90, 9808};
    int max= arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
           max = arr[i];
           
        }
    }
    System.out.println(max);


    //enhanced for loop
    //enhanced for loop 
    
    int arr1[] = {5,6,3,4,1,4};
    
    int max1 = arr1[0];
    
    for( int num:arr1)
    {
        if(num>max)
        {
            max1 = num;
            
        }
    }
    System.out.println(max1);


    //using streams
     int[] arr3 = {12, 45, 2, 89, 34};
    
    OptionalInt max3 = Arrays.stream(arr3)
              .max()
              .getAsInt();
    System.out.println(max3.orElse(-1));

  }
}