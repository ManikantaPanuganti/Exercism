import java.util.*;
public class PangramChecker {

    public boolean isPangram(String input) {
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String s="abcdefghijklmnopqrstuvwxyz";
        char[] array=s.toCharArray();
        List<Character> li=new ArrayList<Character>();
        for(char a:array){
            li.add(a);
        }
        input=input.toLowerCase();
        array=input.toCharArray();
        for(char a:array){
            li.remove(new Character(a));
        }
       // System.out.println("Is pangram"+li.isEmpty());



        return li.isEmpty();
    }
   /* public static void main(String[] args){
        PangramChecker pc=new PangramChecker();
        pc.isPangram("abcdefghijklnopqrstuvwxyz");
    }*/
}
