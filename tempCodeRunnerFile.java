    int i=1;

      while(i<a.length){
        int key=a[i];
        int j=i-1;

        //shift all large elements one position to the right 
        while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            i--;
        }
        
        //insert ket at its correct position
        a[j+1]=key;
        i++;
        
      }
        for(int x:a){
            System.out.println(x);
        }

      

       