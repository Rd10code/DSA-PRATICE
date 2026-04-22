import java.util.*;
public class largestnumber {

    public static int largest(int arr[]){
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }

       public static int Smallest(int arr[]){
        int Small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Small){
                Small=arr[i];
            }
        }
        return Small;
    }

    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+10;
        }
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //  int lar = Integer.MIN_VALUE;
        //  System.out.println(lar);
        int arr[]={16,18,19,222,20,7777};
        int ans = largest(arr);
        int ans2 = Smallest(arr);
        // System.out.println(ans);
        // System.out.println(ans2);

        if(input.equalsIgnoreCase("Largest")){
            System.out.println(largest(arr));
        }else if(input.equalsIgnoreCase("Smallest")){
            System.out.println(Smallest(arr));
        }

        update(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
