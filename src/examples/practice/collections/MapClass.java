package examples.practice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        //    simple example of Map
        Map<String, Integer> m = new HashMap<>();
        m.put("abc", 1);
        m.put("acb", 3);
        m.put("bac", 5);
        m.put("bca", 3);
        System.out.println("Using String key with HashMap:    "+ m);
        for (Map.Entry<String, Integer> hms : m.entrySet()){
            System.out.println("Key: "+hms.getKey()+" - Value: "+ hms.getValue());
        }

        Map<Integer, Integer> hmi = new HashMap<>();
        hmi.put(1,1);
        hmi.put(2,1);
        hmi.put(3,4);
        hmi.put(4,2);
        hmi.put(5,3);
        hmi.put(6,3);
        System.out.println("\nUsing integer key with HashMap:    "+hmi);

        Map<Character, String> hmc = new HashMap<>();
        hmc.put('a',"Android");
        hmc.put('b',"Studio");
        hmc.put('c',"Kotlin");
        hmc.put('d',"Java");
        hmc.put('e',"Ble");
        hmc.put('f',"IoT");
        System.out.println("\nUsing the Character Key and String value: "+hmc);
        for (Map.Entry<Character, String> hcs : hmc.entrySet()){
            System.out.println("Key: "+hcs.getKey()+" - Value: "+hcs.getValue());
        }

        Map<String, Integer> tm = new TreeMap<>();
        tm.put("java", 1);
        tm.put("kotlin", 1);
        tm.put("ble", 1);
        tm.put("iot", 1);
        tm.put("android", 1);
        System.out.println("\nUsing the String key with TreeMap:   "+tm);

        Map<Character, Integer> tmc = new TreeMap<>();
        tmc.put('a',1);
        tmc.put('b',1);
        tmc.put('c',9);
        tmc.put('d',1);
        tmc.put('e',10);
        tmc.put('f',9);
        System.out.println("\nUsing the Character key and Integer Value: "+tmc);
        for (Map.Entry<Character, Integer> tmi : tmc.entrySet()){
            System.out.println("Key: "+tmi.getKey()+" - Value: "+tmi.getValue());
        }
        int resi = tmc.get('f');
        System.out.println(resi);


        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("java",1);
        lhm.put("kotlin",1);
        lhm.put("android",1);
        lhm.put("iot",1);
        lhm.put("ble",1);
        lhm.put("wifi",1);
        System.out.println("\nUsing the String key with LinkedHashMap: "+lhm);
        int res =  lhm.get("iot");
        System.out.println(res);

        System.out.println("\nCONTAINS KEY (android): "+ lhm.containsKey("android"));
        System.out.println("\nCONTAINS value (10): "+ lhm.containsValue(10));
        lhm.clear();
        System.out.println("Lhm values after cleared: "+lhm);

    }
}






