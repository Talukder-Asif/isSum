import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1;
        int n, i, j, target;
        boolean flag = false;
        System.out.print("Enter the length of the Array - ");
        n = sc.nextInt();
        arr1 = new int[n];
        for(i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the Target - ");
        target = sc.nextInt();
        for(i=0; i<n; i++){
            for(j = i+1; j<n; j++){
                if(arr1[i] + arr1[j] == target){
                    System.out.println(i + ", " + j );
                    flag = true;
                    break;
                }
            }
        }
        if(flag == false){
            System.out.println("No sum founded.");
        }
    }
}