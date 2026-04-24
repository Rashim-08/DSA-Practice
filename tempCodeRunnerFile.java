        String s="0-1";
  StringBuilder sb=new StringBuilder(s);
        boolean b=false;
        
        
        while(sb.length()>0){
            if(sb.charAt(0)=='-'){
                b=true;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0)==' '){
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0)=='0'){
                sb.deleteCharAt(0);
            }
            else{
                break;
            };
        }
        int i=0;
        
        while(i<sb.length()){
            if(!Character.isDigit(sb.charAt(i))){
                System.out.println(i);
                sb.delete(i,sb.length());
                break;
            } 
            i++;
        } 
        
        System.out.println(sb);
        long k=0; 

        for(int j=0;j<sb.length();j++){
            int p=0;
            while(i<10){
                if(sb.charAt(j)==(char)(p+'0')){
                    k=k*10+p;
                    System.out.println(k);
                    break;
                }
                p++;
            }
        }
        if(b==true){
            k=-k;
        }