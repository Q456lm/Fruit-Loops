public class stairs1{
    public static void main(String[] args){
        String cur_val = "";//Variable Define
        
        for (int i=1;i<11;i++){
            cur_val = cur_val + i;//Will simultaneously convert i to a string and add it to the previous values of i
            System.out.println(cur_val);//Display current line
        }
    }
}
