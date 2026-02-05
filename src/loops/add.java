package loops;

public class add {
    public static void main(String[] args) {
        for (int i = 0; i<=10; i++){
//            System.out.println(2 + i);
            if(i%2 == 0){
                System.out.println("even");
                System.out.println(1 + i);
            }else{
                System.out.println("odd");
                continue;
//                break;
//                System.out.println(2 + i);
            }
        }
        System.out.println("this is after for loop");
    }
}
