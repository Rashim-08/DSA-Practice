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
     int []nums={1,2,6,3,5,4};
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
    int n=nums.length;
    for(int i=0;i<n;i++){
        while( nums[i]>0 //ignoring negative numbers
            && nums[i]<=n //ifnoring numbers greater than array length
            && nums[nums[i]-1]!= nums[i] //avoiding infinite swapping
            ){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
    }
    for(int i=0;i<n;i++){
        if(nums[i]!=i+1){
            System.out.println(i);
        }
    }
    System.out.println(n+1);

    
    }
}
