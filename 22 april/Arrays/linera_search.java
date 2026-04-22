public class linera_search {

    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("Your element is at index: "+ " which is ");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int key = 7;
        int ans = search(arr, key);
        System.out.print(ans);

        
    }
}
