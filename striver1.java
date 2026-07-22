import java.util.Scanner;
class solution


public class striver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //1.
    // int num=sc.nextInt();
    // int rev=0;
    // while(num>0){
    //     rev=rev*10+(num%10);
    //     num=num/10;
    // }
    // System.out.println(rev);

    //2.
    // int num=sc.nextInt();
    // int sum=0;
    // int l=0;
    // int n = num;
    // while(n>0){
    //     l++;
    //     n=n/10;
    // }
    // int k=num;
    // while(num>0){
    //     sum+=Math.pow(num%10, l);
    //     num/=10;
    // }
    // if(k==sum)System.out.println("true");
    // else System.out.println("false");

    //3.
    // int num=sc.nextInt();
    // int i=1;
    // String s="";
    // while(i<=num){
    //     if(num%i==0){
    //         s=s+","+String.valueOf(i);
    //     }
    //     i++;
    // }
    // System.out.println(s);

    //4.
    // int num=sc.nextInt();
    // int i=1;
    // int sum=0;
    // while(i<=num){
    //     System.out.println("-------"+num%i);
    //     if(num%i==0){
    //         System.out.println("entered");
    //         sum++;
    //         if(sum>2){
    //             System.out.println("not prime");
    //             break;
    //         }
    //     }
    //     i++;
    // }
    // if(sum==2)System.out.println("its a prime");
 
    //5.
    // int[] arr={1,3,2,1,6,5,3,1};
    // int[] hash =new int[arr.length];
    // for (int i=0;i<arr.length;i++) {
    //     hash[arr[i]]+=1; 
    // }
    // System.out.print("enter number of items to be searched:-");
    // int q=sc.nextInt();
    // while(q-- != 0){
    //     System.out.print("Which element:-");
    //     int number=sc.nextInt();
    //     System.out.print("Answer:-");
      
    //     try {
    //              System.out.print(hash[number]);
                
    //         }
    //     catch (Exception e) {
    //         System.out.print("Element not found");
    //     }
    //     System.out.println();
    // }

    //6.
    // int[] hash =new int[25];
    // String s="abcefjhfwbafaufksdopfnhfg";

    // for(int i=0;i<s.length();i++){
    //     hash[s.charAt(i)-'a']++;
    // }
    // System.out.print("ALPHABETS TO BE SEARCHED:-");
    // int q=sc.nextInt();
    // while(q-->0){
    //     System.out.print("ELEMENT-");
    //     char c=sc.next().charAt(0);   
      
    //     System.out.print(hash[c-'a']);
       
    //     System.out.println();
    // }

    //7.
    
   
}

    }
