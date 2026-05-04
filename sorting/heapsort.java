
class H{
    int []a;
    int n;

    H(int[] a){
        this.a = a;
        n = a.length;
    }
    void heapify(int[] a,int n,int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l<n && a[l] > a[largest])
            largest = l;

        if (r<n && a[r] > a[largest])
            largest = r;
        if (largest != i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
    
            heapify(a,n,largest);
        }
    }
    void sort(){
        for (int i = n/2-1 ; i>=0; i--){
            heapify(a,n,i);
        }
        for (int i = n-1; i>0 ; i--){
           int temp = a[0]; 
           a[0] = a[i];
           a[i] = temp;
            heapify(a,i,0);
        }
        System.out.print("[");
        for(int i = 0; i<n ; i++){
            System.out.print(a[i]);
            if(i<n-1)System.out.print(",");
        }
        System.out.print("]");
    }
}


public class heapsort {
    public static void main(String[] args) {
        int []a={7,2,3,1,6,8};
        H h=new H(a);
        h.sort();
    }
}
