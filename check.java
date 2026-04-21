import java.util.HashSet;
import java.util.Set;

public class check {
    static int Maxarea(int a,int b){
        return a*b;
    }
    
    public static void main(String[] args) {
        // String []strs=new String[2];
        // strs[0]="cir";
        // strs[1]="car";
        // //strs[2]="flawn";
        
        //  String k="";
        // if(strs.length == 1){
        //     k=strs[0];
        //     System.out.println(k);;
        // }
    
        //     int min=201;
        //         for(String l: strs){
        //             if(l.length()<min){
        //                 min=l.length();
        //             }
        //         }
                
        //     char c;
        //     char d;
        //     outer:
        //         for(int i=0;i<min;i++){
        //             // System.out.println(i);
        //             for(int j=0;j<strs.length-1;j++){
        //                 // System.out.println(i+","+j);
        //                 c=strs[j].charAt(i);
        //                 d=strs[j+1].charAt(i);
        //                 System.out.println(c+"-"+d);
        //                 if(c != d){
        //                 break outer;
        //                 }
        //                 if(j==strs.length-1){
        //                 k+=c;
        //                 }
        //             }
                    
        //         }
        
        
        // System.out.println(k);



        int []height= {1,8,6,2,5,4,8,3,7};
        //int k=0;
        // stop crating loops all the time
    //     for(int i=1;i<=height.length-1;i++){
    //         for(int j=i;j<height.length;j++){
    //             int z=Math.min(height[i-1], height[j]);
    //             k=Math.max(k,(j+1-i)*z);
    //             System.out.println(k);
    //         }
        
    // }

    //     int left=0;
    //     int right=height.length-1;
    //     while(left<right){
    //         int h=Math.min(height[left], height[right]);
    //         int w=right-left;
    //         k=Math.max(k, h*w);

    //         if(height[left]<height[right])left++;
    //         else right--;
    //     }


    // System.out.println(k);






//     String haystack = "hello";
//     String needle = "ll";

//       int i=0;


//       while(i<haystack.length()){
    
//         System.out.println(haystack.charAt(i)+","+needle.charAt(0));
        
//         if(haystack.charAt(i)==needle.charAt(0)){
//             int f=0;
//             for(int k=0;k<needle.length();k++){
//                 if(haystack.charAt(i+k)==needle.charAt(f)){
//                     f++;
//                 }
                
//             }
//          if(f==needle.length())break;
//         }
//         i++;
//       }
//       if(i==haystack.length())i=-1;
//     System.out.println(i);
//     
// 




// MY LOGIC FOR THE LONGEST COMMON SUBSTRING
//         String s="rrrrrr";
//         Set <Character> set =new HashSet<>();

//         int c=0;
//         int i=0;
//         int count=0;

//         while(i<s.length() && (s.length()-i)>=c){
//                 if( i<s.length()-1 && s.charAt(i)!=s.charAt(i+1)){
                
//                             for(int f=0;f<s.length()-i;f++){
//                                 char ch=s.charAt(f+i);
//                                 if(set.contains(ch)){
//                                     c=Math.max(c,set.size());
//                                     set.clear();
//                                     break;
//                                 }
//                                 set.add(ch);
                                
//                             }
//                             c=Math.max(c,set.size());
//                                     set.clear();
//                     i++;
//                 }
//                 else i++;
//                 c=Math.max(c,set.size());
//                 set.clear();
//         }
//         System.out.println(c);
//     }
// }



//Practice----43
//  String num1="196";
//  String num2="533";
//  if(num1.equals("0") || num2.equals("0")){
//          System.out.println("0");;
//        }
     
//      int n=num1.length();
//      int m=num2.length();
//      int []result=new int[n+m]; //array created

//      //multiplying the characters
//      for(int i=n-1;i>=0;i--) {
//         for(int j=m-1;j>=0;j--){
//             int d1=num1.charAt(i)-'0';
//             System.out.println("d1="+d1);
//             int d2=num2.charAt(j)-'0';
//             System.out.println("d2="+d2);

//             int sum=d1*d2+result[i+j+1];
//             System.out.println(sum);
//             result[i+j+1]=sum%10;
            
//             result[i+j]+=sum/10;

//         }
//      }
//       int start = 0;
//     while(start < result.length && result[start] == 0){
//         start++;
//     }

//     // Create char array manually
//     char[] ans = new char[result.length - start];

//     int idx = 0;
//     for(int i = start; i < result.length; i++){
//         ans[idx++] = (char)(result[i] + '0');
//     }
    
     
//    
// 

String s="  -3456hy89";
  StringBuilder sb=new StringBuilder(s);
        boolean b=false;
        boolean g=true;
        int i=0;
        while(g){
            if(sb.charAt(0)=='-'){
                b=true;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0)==' '){
                sb.deleteCharAt(0);
            }
        
            if(!Character.isDigit(s.charAt(i))){
                // sb.delete(i,sb.length()-1);
                // break;
                System.out.println(sb.charAt(i));
                i++;
                if(i==sb.length())g=false;
            }  
        }
        System.out.println(sb);
        // long k=0;

        // for(int j=0;j<sb.length();j++){
        //     int i=0;
        //     while(i<10){
        //         if(sb.charAt(j)==(char)(i+'0')){
        //             k=k*10+i;
        //             System.out.println(k);
        //             break;
        //         }
        //         i++;
        //     }
        // }
        //System.out.println(k);
    }
}