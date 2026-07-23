
import java.util.ArrayList;




public class sorting {

//SELECTION
//     static void selection(int[] a){
//     int pass=0;
//     int i;
//     int min=0;
//     while(pass<a.length){
//         i=pass;
//         while(i<a.length-1){
//             System.out.println("comparing--"+a[pass]+","+a[i+1]);
//             if(a[min]>a[i+1]){
//                 min=i+1;
//                   System.out.println("minimum=="+min);
//             }
//             i++;
//             }
//         int temp=a[pass];
//         a[pass]=a[min];
//         a[min]=temp;
//         pass++;
//     }
//     for(int x:a){
//         System.out.print(x+" ");
//     }
// }

    // static void bubble(int[] a){
    //     int pass=0;
    //     while(pass<a.length){
    //         int ex=0;
    //         int i=0;
    //       while(i<a.length-1-pass) {
    //         System.out.println("comparing--"+a[pass]+","+a[i+1]);
    //         if(a[i]>a[i+1]){
    //             int temp=a[i];
    //             a[i]=a[i+1];
    //             a[i+1]=temp;
    //             ex++;
    //         }
    //         i++;
    //         }
            
    //         if(ex==0){
    //             break;
    //         }
    //         pass++;
            
    //     }
    //     System.out.println("out");
    //     for(int x:a){
    //                 System.out.print(x+" ");
    //             }
            

    // }

//INSERSTION
    // static void insertion(int[] a){
    //   int i=1;

    //   while(i<a.length){
    //     int key=a[i];
    //     int j=i-1;

    //     while(j>=0 && a[j]>key){
    //         System.out.println();
            
    //         a[j+1]=a[j];
    //         for(int x:a){
    //         System.out.print(x+" ");
    //     }
    //         j--;
    //     }
    //     a[j+1]=key;
    //     i++;
        
    //   }
    //     for(int x:a){
    //         System.out.print(x+" ");
    //     }

//MERGE SORTING
    static void merge(int[] a,int l,int mid,int h){
        ArrayList <Integer> temp=new ArrayList<>();
        int left=l,right=mid+1;
        while(left<=mid && right<=h){
            if(a[left]<=a[right]){
               temp.add(a[left++]);
            }
            else{
                temp.add(a[right++]);}
        }
        while(left<=mid){
           temp.add(a[left++]);
        }
        while(right<=h){
            temp.add(a[right++]);
        }
        for(int i=l;i<=h;i++){
            a[i]=temp.get(i-l);
        }
    }
    static void mergesort(int[] a,int l,int h){
       int mid=(l+h)/2;
       if(l>=h)return;
       mergesort(a, l, mid);
       mergesort(a, mid+1, h);
       merge(a, l, mid, h);
       

    }

      

       
    
    
    public static void main(String[] args) {
    int arr[]={13,46,24,52,20,9};
    int arr1[]={3,1,2,4,1,5,2,6,4};
    //selection(arr);
    //bubble(arr);
    //insertion(arr);
    mergesort(arr1, 0, arr1.length-1);
    for(int x:arr1){
        System.out.print(x+" ");
    }
    }
}

