public class binary {
    public static int binary(int arr[],int key){
        int start =0,end=arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(mid==key){
                return mid;
            }
            if(mid<key){
                start = mid+1;  // right
            }
            else{
                end = mid-1; //left
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int key=6;
        System.out.print(binary(arr, key));
    }
}
