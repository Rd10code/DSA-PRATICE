public class sorted_array {
    public static void sorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;

                }
            }
        }
    }

    public static void comapre(int arr[] , int arr2[]){
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,44,1,38};
        sorted(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
