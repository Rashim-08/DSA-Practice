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






    String haystack = "hello";
    String needle = "ll";

      int i=0;


      while(i<haystack.length()){
    
        System.out.println(haystack.charAt(i)+","+needle.charAt(0));
        
        if(haystack.charAt(i)==needle.charAt(0)){
            int f=0;
            for(int k=0;k<needle.length();k++){
                if(haystack.charAt(i+k)==needle.charAt(f)){
                    f++;
                }
                
            }
         if(f==needle.length())break;
        }
        i++;
      }
      if(i==haystack.length())i=-1;
    System.out.println(i);
    }
}
