public class pattern {
    public static void pattern1(){
        // 1
        // 12
        // 123
        // 1234

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        pattern1();
    }
}
