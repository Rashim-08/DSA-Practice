import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
    static List<Integer> union1(int[] a, int[] b) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        List<Integer> list=new ArrayList<>();
        for(int x:map.keySet()){
            list.add(x);
        }
        return list;
}
    
    
    static List<Integer> union2(int[] a,int[] b){

        Set<Integer> st=new TreeSet<>();
        for(int i:a){
            st.add(i);
        }
        for(int i:b){
            st.add(i);
        }
        return new ArrayList<>(st);
    }
    static int find(int[] a){
        int sum=1;
        int s=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];
            sum=sum+(i+2);
        }
        return sum-s;
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

    int arr[]={1,2,3,4,6};
    System.out.println(find(arr));

        
    }
}
