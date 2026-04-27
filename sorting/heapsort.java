
class Heapsort{
    int []a;
    int n;
    Heapsort(int[] a){
        n=a.length;
        this.a=a;
    
    }
    void heapify(int[] a,int n,int i){
        int parent=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && a[l] > a[parent])
            parent=l;
        if(r<n && a[r] > a[parent])
            parent=r;
        if(parent != i){
            a[i]=a[i]+a[parent];
            a[parent]=a[i]-a[parent];
            a[i]=a[i]-a[parent];
            heapify(a,n,parent);
        }
    }
    void sort(){
        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }
        for(int i=n-1;i>0;i--){
            a[0]=a[0]+a[i];
            a[i]=a[0]-a[i];
            a[0]=a[0]-a[i];
            heapify(a,i,0);
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            if(i<n-1)System.out.print(",");
        }
        System.out.print("]");
    }
}


public class heapsort {
    public static void main(String[] args) {
        int []a={7,2,3,1,6,8};
        Heapsort h=new Heapsort(a);
        h.sort();
    }
}
