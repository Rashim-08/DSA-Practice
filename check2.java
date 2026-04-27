import java.util.ArrayList;
import java.util.List;

public class check2 {
    public static void main(String[] args) {
        //QUESTION 8------------------------
//         String s="0-1";
//   StringBuilder sb=new StringBuilder(s);
//         boolean b=false;
//         int zero=0;
        
//         while(sb.length()>0){
//             if(sb.charAt(0)=='-'){
//                 b=true;
//                 sb.deleteCharAt(0);
//                 break;
//             }
//             else if(sb.charAt(0)==' '){
//                 sb.deleteCharAt(0);
//             }
//             else if(sb.charAt(0)=='+'){
//                 sb.deleteCharAt(0);
//                 break;
//             }
//             else{
//                 break;
//             };
//         }
//         int i=0;
        
//         while(i<sb.length()){
//             if(!Character.isDigit(sb.charAt(i))){
//                 //System.out.println(i);
//                 sb.delete(i,sb.length());
//                 break;
//             } 
//             i++;
//         } 
        
//         System.out.println(sb);
//         long k=0; 

//         for(int j=0;j<sb.length();j++){
//             int p=0;
//             while(i<10){
//                 if(sb.charAt(j)==(char)(p+'0')){
//                     k=k*10+p;
//                     //System.out.println(k);
//                     break;
//                 }
//                 p++;
//             }
//         }
//         if(b==true){
//             k=-k;
//         }
        
//   System.out.println(k);

     //QUESTION2---------------------------------
        // String s="rashi is a good ";
        //  boolean t=true;
        // int count=0;
        //     int i=s.length()-1;
        //     while(s.length()>0){
        //         System.out.println(s.charAt(i));
        //         if(s.charAt(i)==' ' && count>0)break;
        //         if(s.charAt(i)==' ' && count==0)i--;
        //         else{
        //             count++;
        //             i--;
        //         }
               
                    
        //         }
                
        
        // System.out.println(count);

    //QUESTION 41-----------------------------
     //int []nums={1,2,6,3,5,4};
    //int i=0;
    //     int j=nums.length-1;
    //     int num=1;
    //     int min1,min2,min;
    //     while(i<nums.length && j>=0){
    //         if(nums[i]==num)num++;
    //         else i++;
    //         if(nums[j]==num)num++;
    //         else j--;                                
    //     }
    //  System.out.println("----"+num);

    //chatgptied-----------------
    // int n=nums.length;
    // for(int i=0;i<n;i++){
    //     while( nums[i]>0 //ignoring negative numbers
    //         && nums[i]<=n //ifnoring numbers greater than array length
    //         && nums[nums[i]-1]!= nums[i] //avoiding infinite swapping
    //         ){
    //             int temp=nums[i];
    //             nums[i]=nums[temp-1];
    //             nums[temp-1]=temp;
    //         }
    // }
    //hell-0
    //int []nums ={7,4,78,9,8};

    //  String []s=new String[nums.length];
    //  for(int i=0;i<nums.length;i++)
    //     s[i]=String.valueOf(nums[i]); //converts number into String

    //  Arrays.sort(s,(a, b) -> (b + a).compareTo(a+b));

    //  if (s[0].equals("0")) System.out.println("0");
     
//     int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//    int k=matrix.length*matrix[0].length;
//    int  num=0;
//    List<Integer> array= new ArrayList<>();
//    int pass=0;
//    int m=matrix.length;
//    int n=matrix[0].length;
//    int top=0;
//    int bottom=m-1;
//    int left=0;
//    int right=n-1;


//    while(num<k){

//         while(j<(n-pass-1)){
//             array.add(matrix[i][j]);
           
//             num++;
//             j++;
//         }

//         while(i<(m-pass-1)){
//             array.add(matrix[i][j]);
          
//             num++;
//             i++;

//         }

//         while(j>pass){
//             array.add(matrix[i][j]);
            
//             num++;
//             j--;

//         }
//         pass++;

//         while(i>pass-1){
//             array.add(matrix[i][j]);
          
//             num++;
//             i--;

//         }  
//         i=pass;
//         j=pass;
//    }
//     System.out.println(array);

    // 
    // String str="e34567";
    // if (str == null || str.isEmpty() || str.charAt(0) == 'e') {
    //     System.out.println(false);
    // }

    // // Allowed characters set
    // String allowed = "e.+-0123456789";

    // for (int i = 0; i < str.length(); i++) {
    //     char ch = str.charAt(i);
    //     // If any character is not in the allowed string, return false
    //     if (allowed.indexOf(ch) == -1) {
    //     System.out.println(false);
            
    //     }
    // }
    //     System.out.println(true);


//     int []nums={5,2,6,1};
//    List<Integer> counts=new ArrayList<>();
//     int k=0;

//     for(int i=0;i<nums.length;i++){
//         int count=0;
//         for(int j=i+1;j<nums.length;j++){
//             if(nums[j]<nums[i])count++;
//         }
//         counts.add(count);
//         k++;
//     }
//     System.out.print("[");
//     for(int i=0;i<counts.size();i++){
//         System.out.print(counts.get(i));
//         if(i<counts.size()-1)System.out.print(",");
//     }
//     System.out.print("]");
    

    //QSTION NUMBER 118.
    int numsRows=5;
    List<List<Integer>> m=new ArrayList<>();
    
   for(int i=0;i<numsRows;i++){
        List<Integer> row =new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0 || j==i)row.add(1);
            else{
                int sum =m.get(i-1).get(j-1)+m.get(i-1).get(j);
                row.add(sum); 
                }
            }
            m.add(row);//additing a row 
        }
    
        System.out.println(m);
    
}
}
