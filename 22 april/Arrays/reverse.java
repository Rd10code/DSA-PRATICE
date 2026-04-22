public class reverse {
    public static int find(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(arr[i]+" "+i);
                return i;
            }
        }
        return -1;
    }

    public static void revers(int arr[]){
        int start =0 ;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        find(arr, 5);

        revers(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}
