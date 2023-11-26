import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class S_1_Anagram {
    public static boolean anagram(String a,String b)
    {
        if(a.length()!=b.length()) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            char char_a=a.charAt(i);
            char char_b=b.charAt(i);
            if(map.get(char_a)==null){
                map.put(char_a,0);
            }
            if(map.get(char_b)==null){
                map.put(char_b,0);
            }
           map.put(char_a,map.get(char_a)+1);
           map.put(char_b,map.get(char_b)-1);
        }
        for (int i : map.values()) {
            if(i!=0)return false;
        }
        return true;
        
    }
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        String[] command=read.readLine().trim().split(" "); 
        String a=command[0];
        String b=command[1];
        System.out.println(anagram(a,b));

    }
}
