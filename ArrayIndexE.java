public class ArrayIndexE {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3};
            int value=arr[5];
        }catch(ArrayIndexOutOfBoundsException N){
            System.out.println("Array problem"+N.getMessage());
        }
    }
}