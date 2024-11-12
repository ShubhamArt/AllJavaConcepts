package generalQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Roughpractice {
    public static void main(String[] args) {
        String s1= new String("javatechie");
        String s2="javatechie";
        System.out.println(s1.intern());
        System.out.println(s1.intern().hashCode()==s2.hashCode());

        Map<Integer,String> map =new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            System.out.println(map.get(key));
        }
    }
}
