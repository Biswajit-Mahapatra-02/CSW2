package CSW0704;

import java.util.*;

public class SetInterfaceQuestion {
    public static Set <Integer> HS = new HashSet<>();
    public static Set <Integer> TS = new TreeSet<>();
    public static Set <Integer> LHS = new LinkedHashSet<>();
    public static Map <String, Integer> HM = new HashMap<>();
    public static Map <String, Integer> TM = new TreeMap<>();
    public static Map <String, Integer> LHM = new LinkedHashMap<>();

    public static void main(String[] args) {
        HS.add(8);
        HS.add(1);
        HS.add(3);
        HS.add(4);
        HS.add(2);
        HS.add(6);
        HS.add(5);
        HS.add(123);
        HS.add(43);
        HS.add(432);
        HS.add(12);
        HS.add(543);
        HS.add(364);
        //HS give output in random order
        HS.add(8);
        HS.add(null);
        System.out.println("HashSet: "+HS);

        TS.add(8);
        TS.add(1);
        TS.add(3);
        TS.add(4);
        TS.add(2);
        TS.add(6);
        TS.add(5);
        TS.add(7);
        //TreeSet gives output in sorted order
        TS.add(8);
//        TS.add(null); NullPointerException
        System.out.println("TreeSet: "+TS);

        LHS.add(8);
        LHS.add(1);
        LHS.add(3);
        LHS.add(4);
        LHS.add(2);
        LHS.add(6);
        LHS.add(5);
        LHS.add(7);
        // LHS gives output in order of insertion
        LHS.add(8);
        LHS.add(null);
        System.out.println("LinkedHashSet: "+LHS);

        HM.put("A",1);
        HM.put("Q2b",2);
        HM.put("C",3);
        HM.put("D",4);
        HM.put("E",5);
        HM.put("F",6);
        HM.put("A",1);
        HM.put(null,23);
        HM.put(null,35);
        HM.put("Test",null);
        HM.put("Test1",null);
        HM.put("Test2",null);
        System.out.println("HashMap: "+HM);

        TM.put("A",1);
        TM.put("Q2b",2);
        TM.put("C",3);
        TM.put("D",4);
        TM.put("E",5);
        TM.put("F",6);
        TM.put("A",1);
//        TM.put(null,23); NullPointerException
//        TM.put(null,35);
        TM.put("Test",null);
        TM.put("Test1",null);
        TM.put("Test2",null);
        System.out.println("TreeMap: "+TM);

        LHM.put("A",1);
        LHM.put("Q2b",2);
        LHM.put("C",3);
        LHM.put("D",4);
        LHM.put("E",5);
        LHM.put("F",6);
        LHM.put("A",1);
        LHM.put(null,23);
        LHM.put(null,35);
        LHM.put("Test",null);
        LHM.put("Test1",null);
        LHM.put("Test2",null);
        System.out.println("LinkedHashMap: "+LHM);
    }
}
