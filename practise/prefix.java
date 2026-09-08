package practise;

public class prefix {
    public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    System.out.print(arr[0]+" ");
    for(int i=1;i<arr.length;i++){
        arr[i]=arr[i-1]+arr[i];
        System.out.print(arr[i]+" ");
    }
}
}
