import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of patter: ");
        int n=sc.nextInt();
int k=n;
        // pattern1
        // for(int i=0;i<n;i++){
        //    for(int j=0;j<n;j++)
        //    { System.out.print("*");}
        //    System.out.println();
        // }

        // pattern2
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // pattern3
        //  for(int i=0;i<n;i++){
        //     for(int j=1;j<=i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
         
        // pattern4
        //  for(int i=1;i<=n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        
        // pattern5
        //  for(int i=n;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // pattern6
        //  for(int i=n;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    
        // pattern7
        // for(int i=0;i<n;i++){
        //     for(int j=n;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*i+1;j++){
        //         System.out.print("*");
        //     }
        //     n--;
        //     System.out.println();
        // }
    
        // pattern8
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*k+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     k--;
        // }
        
        // pattern 9
        // for(int i=0;i<n;i++){
        //     for(int j=k;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     k--;
        // }
        // k=n-1;
        // for(int i=0;i<=n;i++){
        //      for(int j=0;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=2*k+1;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     k--;
        // }
        
        // pattern 10
        // for(int i=0;i<=2*n-1;i++){
        //     if(i<=n){
        //         for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        //     if(i>=n){
        //         for(int j=k;j>0;j--){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //         k--;
        //     }
        // }

        // pattern 11
    int l=1;
        for(int i=0;i<n;i++){
        
            for(int j=0;j<=i;j++){
               l=l^1;
                System.out.print(l);
            }
            System.out.println();
        }

    }
}