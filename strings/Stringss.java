package com.strings;

public class Stringss {
    public static void main(String[] args) {
        /* Mutable */
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("World");
        System.out.println(sb);


        /* insert() */
        sb.insert(1, "Java");
        System.out.println(sb);

        /* replace() */
        sb.replace(1, 3, "k");
        System.out.println(sb);

        /* delete() */
        sb.delete(1, 3);
        System.out.println(sb);

        /* reverse() */
        sb.reverse();
        System.out.println(sb);

        /* capacity()==>22 */

        StringBuilder str = new StringBuilder();
        System.out.println("initial Capacity=" + sb.capacity());
        str.append("Bangalore");
        System.out.println("After appending Capacity=" + sb.capacity());
        str.append("ha gsd hs hshsh  shsh shshs hs   hshshshshshshsh  shshshshshshsh");
        System.out.println("After 2nd time appending Capacity=" + sb.capacity());
        System.out.println(sb.length());

    }
}
