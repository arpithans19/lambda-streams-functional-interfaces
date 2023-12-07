package com.lambda;

import java.util.*;

class myComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return -1;

        } else if (o2>o1) {
            return 1;

        }else if (o1==o2)
        {
            return 0;
        }
        return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
    }
}

public class LwithCollections {
    public static void main(String[] args) {
        //List-duplicates are allowed, maintain insertion order

        ArrayList<String> al = new ArrayList<>(3);
        al.add("a");
        al.add("b");
        al.add("b");
        System.out.println(al);

        /*Comparator without Lambda*/
        ArrayList<Integer> aln = new ArrayList<>();
        aln.add(20);
        aln.add(90);
        aln.add(900);
        aln.add(80);
        System.out.println(aln);//before using comparator
        //after using comparator
        Collections.sort(aln, new myComparator());
        System.out.println(aln);

        /*sets*/
        //Set- no duplicates are allowed, not maintain insertion order
        HashSet<String> h = new HashSet<>();
        h.add("a");
        h.add("b");
        h.add("ppp");
        System.out.println(h);


        /*using Comparator with Lambda with SETS*/

        TreeSet<Integer> ts = new TreeSet<>((o1, o2) -> ((o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));
        ts.add(39);
        ts.add(30);
        ts.add(32);
        ts.add(38);
        System.out.println(ts);
        System.out.println("after using Comparator:" + ts);

        /*MAP*/

        //Map- Key-value based, key is unique ,value can be duplicate
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "arpitha");
        hm.put("r", "ramcharan");
        hm.put("b", "shankar");
        hm.put("c", "arpitha");
        System.out.println(hm);


        TreeMap<Integer,String> tm=new TreeMap<>((o1, o2) -> ((o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));
        tm.put(1,"arpitha");
        tm.put(8,"Shankar");
        tm.put(3,"Sudhiir");
        tm.put(5,"uzfs");
        tm.put(2,"usdkjskj");
        System.out.println(tm);
    }
}
