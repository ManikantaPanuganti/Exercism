import java.util.*;
class ResistorColorDuo {
    int value(String[] colors) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        HashMap <String,Integer> map= new HashMap<>();
        map.put("black",0);
        map.put("brown",1);
        map.put("red",2);
        map.put("orange",3);
        map.put("yellow",4);
        map.put("green",5);
        map.put("blue",6);
        map.put("violet",7);
        map.put("grey",8);
        map.put("white",9);
        String ans="";
          ans+=map.get(colors[0])+""+map.get(colors[1]);
        return Integer.parseInt(ans);
    }
}
