import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        HashMap<String,String> map=new HashMap<>();
        map.put("G","C");
        map.put("C","G");
        map.put("T","A");
        map.put("A","U");
        String result="";
        for(int i=0;i<dnaStrand.length();i++){
          result+=map.get(Character.toString(dnaStrand.charAt(i)));
        }
        return result;
    }

}
