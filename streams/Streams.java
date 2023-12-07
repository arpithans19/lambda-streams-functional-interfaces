package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(38);
        arrayList.add(43);
        arrayList.add(86);
        arrayList.add(21);
        arrayList.add(67);
        System.out.println(arrayList);


        //filtering all even numb from list and make other list

        /*without streams*/
        List<Integer> list = new ArrayList<>();
        for (Integer i1 : arrayList) { //assigning arraylist for i1

            //multiply by 2
            list.add(i1 * 2);
//            System.out.println(list);

            //even number
            if (i1 % 2 == 0) {
                list.add(i1);
            }
        }
        System.out.println(list);


        /*with streams - Java 1.8 vesrion*/
        //even num
        List<Integer> list1 = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

        //multiply
        List<Integer> list2 = arrayList.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(list2);


        ArrayList<String> als = new ArrayList<>();
        als.add("Arpitha");
        als.add("Ravi");
        als.add("Me");
        als.add("He");
        als.add("US");

        //length of string greater than or equal to 7(>=9)
        List<String> si = als.stream().filter(s -> s.length() >= 4).collect(Collectors.toList());
        System.out.println(si);

        //convert all elements into uppercase
        List<String> sUpper = als.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(sUpper);

        //length of string greater than or equal to 7(>=9)- count elemts
        long lsCount = als.stream().filter(s -> s.length() >= 4).count();
        System.out.println("Count "+lsCount);

        //default sorting(Ascending)
        List<Integer> lSort = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(lSort);

        //for customised sorting-using Comparator(descending -> -i1.compareTo(i2) (or) i2.compareTo(i1)
        List<Integer> lCustomsort = arrayList.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Custom Sort "+lCustomsort);

        //getting minimum and maximum value from stream(max() and min())
        Integer mini = arrayList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("min()-" + mini);

        Integer maxi = arrayList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Max: "+maxi);


        //forEach() - using lambda Expression
        arrayList.forEach(i -> System.out.println(i));

        //forEach() - using method reference
        als.forEach(System.out::println);


        //toArray()- arrayList to Array
        Integer array[] = arrayList.toArray(Integer[]::new);
        System.out.println(array);
        for (Integer i : array
        ) {
            System.out.println(i);

        }


        //stream.Of() - for values
        Stream st = Stream.of(10, 9, 92, 839, 28989, 80);
        st.forEach(System.out::println);

        //Stream.of - using for Arrays
        Double[] d = {10.2, 20.9, 29.9};
        Stream doub = Stream.of(d);
        doub.forEach(System.out::println);


    }

}

