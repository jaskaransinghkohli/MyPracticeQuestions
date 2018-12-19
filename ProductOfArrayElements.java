import java.util.Scanner;

public class ProductOfArrayElements {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]= new int[N];
        int m=1000000007;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        long product=1;
        for (int i=0;i<N;i++)
            product=(product*arr[i])%m;
        System.out.println(product);
        sc.close();
    }
}
