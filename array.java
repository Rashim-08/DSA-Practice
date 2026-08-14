public class array {
    // static boolean check(int[] nums) {
    //     int count=0;
    //     for(int i=0;i<nums.length-1;i++){
    //     System.out.println(i);
    //         if(nums[i]>nums[i+1]){
    //         System.out.println(i+1);
    //         if(i+1 > (nums.length)/2) count=nums.length-i+1;
    //         else count=i+1;  
    //         }
    //     System.out.println(count);
    //     if(count==0)return true;
    //     int a[]=new int[nums.length];
    //     for(int j=0;j<nums.length;j++){
    //         a[j]=nums[(j+count)% nums.length];
    //         System.out.println(a[j]);
    //     }
    //     for(int k=0;k<nums.length-1;k++){
    //         if(a[k]>a[k+1])return false;
            
    //     }
    //     }
    //     return true;
    // }
    // static int max2(int[] a){
    //     if(a.length<2)return -1;
    //     int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
    //     for(int i:a){
    //        if(i>max)max=i;
    //        if(max!=i && i>max2){
    //         max2=i;
    //        } 
    //     }
    //     return max2;
    // }

    // static void rotate(int[] nums, int k) {
    //      if(k>nums.length)k=k%nums.length;
    //     if(k==0)return;
    //     int a[]=new int[nums.length];
    //     int j=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(i+k>6){
    //             j=i+k-nums.length;
    //         }
    //         else{
    //             j=i+k;
    //         }
    //         a[j]=nums[i];
    //     }
    //     nums=a.clone();
    //     for(int x:nums){
    //         System.out.println(x);
    //     }
        
    // }

//union using map:
//     static List<Integer> union1(int[] a, int[] b) {
//         TreeMap<Integer,Integer> map=new TreeMap<>();
//         for(int i=0;i<a.length;i++){
//             map.put(a[i],map.getOrDefault(a[i],0)+1);
//         }
//         for(int i=0;i<b.length;i++){
//             map.put(a[i],map.getOrDefault(a[i],0)+1);
//         }

//         List<Integer> list=new ArrayList<>();
//         for(int x:map.keySet()){
//             list.add(x);
//         }
//         return list;
// }
    
    
//     static List<Integer> union2(int[] a,int[] b){

//         Set<Integer> st=new TreeSet<>();
//         for(int i:a){
//             st.add(i);
//         }
//         for(int i:b){
//             st.add(i);
//         }
//         return new ArrayList<>(st);
//     }
//     static int find(int[] a){
//         int sum=1;
//         int s=0;
//         for(int i=0;i<a.length;i++){
//             s=s+a[i];
//             sum=sum+(i+2);
//         }
//         return sum-s;
//     }

//   static int XOR(int[] a){
//     int xorr=0;
//     for(int i:a){
//         System.out.print(xorr+"^"+i+"=");
//         xorr ^=i;
//         System.out.println(xorr);
//     }
//     return xorr;
//   }

    static int sub(int[] a,int k){
        int n=a.length;
        int right=0,left=0;
        int maxlen=0;
        int sum=a[0];

        while(right<n){

            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
            System.out.println(sum);
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }

            right++;
            if(right<n){
                sum+=a[right];
            }
        }
        return maxlen;
    }
    static int sub1(int[] a,int k){
        int maxlen=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=a[i];
            for(int j=i+1;j<a.length;j++){
                sum=sum+a[j];
                if(sum==k){maxlen=Math.max(maxlen,j-i+1);}
            }
        }
        return maxlen;
    }

    static int[] sortColors(int[] a) {
       int low=0;
       int mid=0;
       int high=a.length-1;

       while(mid<=high){
        System.out.println(a[mid]);
        if(a[mid]==0){
            int temp=a[low];
            a[low]=a[mid];
            a[mid]=temp;
            low++;
            
        }
        if(a[mid]==2){
            int temp1=a[mid];
            a[mid]=a[high];
            a[high]=temp1;
            high--;
        }
        if(a[mid]==1)mid++;
       }
       return a;
    }
    public static void main(String[] args) {
        // int arr1[]={4,7,2,3,9,7,0};
        // int arr2[]={1,4,7,2,9,6,0,3,5,7};
        //int k=3;
        //rotate(nums,k);
       //System.out.println(max2(nums));
    //    union1(arr2, arr2);
    //    System.out.println(union1(arr2, arr2));
    //    System.out.println(union2(arr2, arr2));

    int arr[]={2,0,2,1,1,0};
    // System.out.println(sub(arr,10));
       // sortColors(arr);
        // for(int i:arr){
        //     System.out.println(i);
        // }
    // System.out.println(sub1(arr,10));
    // Arrays.sort(arr);
    // for(int i:arr){
    //     System.out.println(i);
    // }

    //HashMap<Integer,Integer> map=new HashMap<>();
    // int a[]={10, 22, 12, 3, 0, 6};
    // int pos=a[a.length-1];
    // ArrayList<Integer> n=new ArrayList<>();
    // n.add(pos);
    // for(int i=a.length-1-1;i>=0;i--){
    //     if(a[i]-pos>0){
    //         pos=a[i];
    //         n.add(pos);
    //     }
    // }
    // Collections.reverse(n);
    // System.out.println(n);
    
//      int a[][]={{1,0,1},{1,0,1},{1,1,1}};
//      int x=1;
//      int y=1;
//      for(int i=0;i<a.length;i++){
//         if(a[i][0]==0)x=0;
//      }
//      for(int i=0;i<a[0].length;i++){
//         if(a[0][i]==0)y=0;
//      }
     
//      for(int i=0;i<a.length;i++){
//         for(int j=1;j<a[0].length;j++){
//             if(a[i][j]==0){
//                 a[0][j]=0;
//                 a[i][0]=0;
//             }
//         }
//      }

//  for(int i=1;i<a.length;i++){
//         for(int j=1;j<a[0].length;j++){
//            if(a[0][j]==0)a[i][j]=0;
//            if(a[i][0]==0)a[i][j]=0;
//         }
        
//      }

//      for(int i=0;i<a.length;i++){
//         if(x==0)a[i][0]=0;
//      }
//      for(int i=0;i<a[0].length;i++){
//         if(y==0)a[0][i]=0;
//      }

//       for(int i=0;i<a.length;i++){
//         for(int j=0;j<a[0].length;j++){
//            System.out.print(a[i][j]);
//         }
//         System.out.println();
//      }

    //int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    // int m[]=new int[a.length];
    // int k=0;
    // int i,j;
    // int n=a.length;
    // int f;
    // int temp;
    // while(k<=(n-1)/2){
    //     i=k;
    //     j=k;
    //     f=0;
    //     while(j<n-k){
    //         m[f]=a[i][j];
           
    //         f++;
    //         j++;
    //     }
       
    //     j--;
    //     f=0;
    //     while(i<n-k){
    //         temp=a[i][j];
    //         a[i][j]=m[f];
    //         m[f]=temp;
            
    //         f++;
    //         i++;
    //     }
      
    //     i--;
    //     f=0;
    //     while(j>=k){
    //          temp=a[i][j];
    //         a[i][j]=m[f];
    //         m[f]=temp;
           
    //         f++;
    //         j--;
    //     }
       
    //     j++;
    //     f=0;
    //     while(i>=k){
    //          temp=a[i][j];
    //         a[i][j]=m[f];
    //         m[f]=temp;
           
    //         f++;
    //         i--;
    //     }
      
    //     i++;
    //     f=0;
    //     while(j<n-k){
    //         a[i][j]=m[f];
           
    //         f++;
    //         j++;
    //     }
       
    //     k++;
    // }
    // for(int h=0;h<n;h++){
    //     System.out.println("-");
    //     for(int s=0;s<n;s++){
    //         System.out.println(a[h][s]);
            
    //     }
    // }

    // int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    // int i=0,j=0;
    // int k=0;
    // int m=a.length;
    // ArrayList<Integer> q=new ArrayList<>();
    // int n=a[0].length;
    //     while (k<=(m/2)) { 
            
    //         while(j<n-k){
    //             q.add(a[i][j]);
    //             j++;
    //         }
    //         j--;
    //         i++;

    //         while(i<m-k){
    //             q.add(a[i][j]);
    //             i++;
    //         }
    //         i--;
    //         j--;

    //         while(j>=k){
    //             q.add(a[i][j]);
    //             j--;
    //         }
    //         j++;
    //         i--;

    //         while(i>k){
    //             q.add(a[i][j]);
    //             i--;
    //         }
    //         i++;
    //         j++;
    //         k++;
    //     }

    //   for(int o:q){
    //     System.out.println(o);
    //   }  

    int a[]={5,6,7,10,33,45,98,22,101,100,78};
    int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
    for(int i:a){
        if(i>max1){
            max2=max1;
            max1=i;
        }
        else if(i>max2 && i!=max1){
            max2=i;
        }
    }
    System.out.println(max2);
    }
}
