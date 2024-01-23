package com.sample;

import javax.sound.midi.Soundbank;
import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(); // Unique, Unordered
        hashSet.add(60);   //Adding element
        hashSet.add(70);
        hashSet.add(50);
        hashSet.add(50);
        hashSet.add(80);
        hashSet.add(90);
        hashSet.add(100);
        System.out.println("HashSet***" + hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(); // Unique, ordered
        linkedHashSet.add(10);  // adding elements
        linkedHashSet.add(20);
        linkedHashSet.add(9);
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(40);
        linkedHashSet.add(25);
        linkedHashSet.add(50);
        linkedHashSet.add(60);
        linkedHashSet.add(60);
        System.out.println("LINKED HASH SET****" + linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();// Unique and Sorted and Slowest
        treeSet.add(10); // Adding an Element
        treeSet.add(70);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(80);
        treeSet.add(80);
        treeSet.add(15);
        treeSet.add(70);
        treeSet.remove(80); // removing an element
        System.out.println("TREE SET****" + treeSet);
        treeSet.addAll(hashSet); // Adding a collection
        System.out.println("TREE SET****" + treeSet);
        System.out.println("************* Iterating the treeset using lambda");
        treeSet.forEach(element-> System.out.println(element));

        System.out.println("************* Iterating the treeset using Iterator");

        Iterator iterator= treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        treeSet.removeAll(hashSet); // removing collection elements
        System.out.println("TREE SET****" + treeSet);
        System.out.println(treeSet.size()); // Printing the size
        System.out.println(treeSet.contains(80)); // Checking if element is present
        System.out.println(treeSet.isEmpty()); // checking if it is empty
        treeSet.clear();  // Clearing the TreeSet
        System.out.println(treeSet.size());
        System.out.println(treeSet.equals(hashSet)); // comparing the two collections

    }
}
