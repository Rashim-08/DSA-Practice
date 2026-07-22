import java.util.*;
public class hashprac {

            public static String start(HashMap<String,String> tick){
                HashMap<String,String> revtickets=new HashMap<>();
                for(String key:tick.keySet()){
                    revtickets.put(tick.get(key),key);
                }
                for(String key:tick.keySet()){
                    if(!revtickets.containsKey(key)){
                        return key;
                    }
                }
            return null;
            }

            public static void itinary(HashMap<String,String> tick,String s){
                //you wrote this code
                    //  for(String key:tick.keySet()){
                    //     key=s;
                    //     System.out.print(s);
                    //     s=tick.get(key);
                    //     if(!tick.containsKey(s)){
                    //         System.out.print("-->"+s);
                            
                    //     }
                    //     else System.out.print("-->");
                    //  }

                //learned
                    while(tick.containsKey(s)){
                        System.out.print(s+"-->");
                        s=tick.get(s);
                    }
                    System.out.print(s);
                }
    public static void main(String[] args) {

//1-given an integer array of size n,find all elements that apper more than {n/3} times.
        // HashMap<Integer,Integer> hash=new HashMap<>();
        // //num-key and frequency-value
        //  int[] nums={1,2};
        //  for(int i=0;i<nums.length;i++){
        //     if(hash.containsKey(nums[i])){
        //         hash.put(nums[i],hash.get(nums[i])+1);
        //     }
        //     else{
        //         hash.put(nums[i],1);
        //     }
        //  }
        //  for(int key:hash.keySet()){
        //     if(hash.get(key)>=nums.length/3){
        //         System.out.println(key);
        //     }
        //  }
        
//2-Union of two arrays
    // int[] arr1={3,5,7,2};
    // int[] arr2={6,8,2,3,0,8,7};
    //HashSet<Integer> set=new HashSet<>();
    // for(int i=0;i<arr1.length;i++){
    //         set.add(arr1[i]);
    // }
    // for(int i=0;i<arr2.length;i++){
    //         set.add(arr2[i]);
    // }

    // for(int key:set){
    //     System.out.print(key+",");
    // }

//3- intersetction 
    // int[] arr1={3,5,7,2};
    // int[] arr2={6,8,2,3,0,8,7};
    // int count=0;
    // for(int i=0;i<arr1.length;i++){
    //     set.add(arr1[i]);
    // }
    // for(int i=0;i<arr2.length;i++){
    //     if(set.contains(arr2[i])){
    //         count++;
    //         System.out.println(arr2[i]);
    //         set.remove(arr2[i]);
    //     }
    // }

//4--find max and min frequencied elemnet
    // Map<Integer,Integer> mp= new HashMap<>();
    // int a[]={4,3,2,5,5,2,7,9,2,1,4,2,0,1};
    // for(int i=0;i<a.length;i++){
    //     mp.put(a[i],mp.getOrDefault(a[i], 0)+1);
    // }
    // int maxele=0,maxfre=0;
    // int minele=0,minfre=a.length;
    // for(Map.Entry<Integer,Integer> e:mp.entrySet()){
    //     int element=e.getKey();
    //     int count=e.getValue();
    //     if(count>maxele){ maxele=element; maxfre=count;}
    //     if(count<minfre){ minele=element;minfre=count;}
    // }
    // System.out.println("Max frequency element=="+maxele+"with max frequency="+maxfre);
    // System.out.println("Min Frequency element=="+minele+"with min frequency="+minfre);

//5--itinary
    // HashMap<String,String> tickets=new HashMap<>();
    // tickets.put("chennai","begeluru");
    // tickets.put("delhi","goa");
    // tickets.put("mumbai","delhi");
    // tickets.put("goa","chennai");

    // String start=start(tickets);
    // itinary(tickets, start);

//6--subarray sum
        int arr[]={1,2,-2,3,1};
        int k=6;
        int sub[]=new int[arr.length];
        int sum=0;
        int i=0;
            for(int x:arr){
                sum+=x;
                sub[i]=sum;
                i++;
            }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        for(int j=0;j<sub.length;j++){
            if(map.containsKey(sub[j]-k)){
                ans += map.get(sub[j]-k);
            }
            map.put(sub[j],map.getOrDefault(sub[j],0)+1);
        }
       System.out.println(ans);

    }
}
