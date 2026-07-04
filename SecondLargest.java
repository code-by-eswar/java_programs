
import java.util.*;public class SecondLargest {
  

	public static void main(String[] args) {
		
		
    //by  used sorting
    /*int arr[] = {10, 324, 45, 90, 9808};
              Arrays.sort(arr);
              int seclar = arr[arr.length-2];
              System.out.println(seclar);
              */
    //by used for Loop 
    int arr[] = {10, 324, 45, 90, 9808};
    int lar = Integer.MIN_VALUE;
    int sec =Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>lar)
        {
            sec = lar;
            lar =arr[i];
        }
        else if(arr[i]>sec && arr[i]!=lar)
        {
            sec = arr[i];
        }
    }
    System.out.println(sec);
    
    
    
	}
}


//using streams