public class check2 {
    public static void main(String[] args) {
        String s="  -3456hy89";
  StringBuilder sb=new StringBuilder(s);
        boolean b=false;
        boolean g=true;
        int i=0;
        while(g){
            if(sb.charAt(0)=='-'){
                b=true;
                sb.deleteCharAt(0);
            }
            else if(sb.charAt(0)==' '){
                sb.deleteCharAt(0);
            }
            else break;
        }
        while(i<sb.length()){
            if(Character.isDigit(s.charAt(i))){
                sb.delete(i+1,sb.length());
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
        
        System.out.println(k);
    }
}
