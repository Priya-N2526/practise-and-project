package practise;

public class swap {
    int[] arr={10,20,30,40,50};
    int left=0;
    int right=arr.length-1;
    while(left<right){
        int temp=arr[left];
        arr[right]=arr[left];
        arr[left]=temp;
        left++;
        right--;
    }

}
