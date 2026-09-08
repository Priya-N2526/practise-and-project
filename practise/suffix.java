package practise;

public class suffix {
    public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    int n=arr.length;
    
    for(int i=n-2;i>=0;i--){
        arr[i]=arr[i+1]+arr[i];
}
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
}
}