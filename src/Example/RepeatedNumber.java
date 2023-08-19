package Example;

public class RepeatedNumber {

    public static void main(String[] args) {

        int[] arr= new int[]{2,3,15,17,9,2,15};

        System.out.println("Duplicate Number in array :");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
