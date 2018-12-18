//prime Number
import java.util.Scanner;
class test2 {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        System.out.print("2"+" ");

        for(int i=3;i<=N;i++){
            int j=2;
            for( ;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j)
                System.out.print(i+" ");
        }
    }
}



