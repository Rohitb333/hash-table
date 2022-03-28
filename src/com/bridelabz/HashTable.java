package com.bridelabz;

import  java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> marks = new Hashtable<>();

        // Put names and marks in the hash table
        marks.put("Rohit",65);
        marks.put("Shubham",80);
        marks.put("Dipak",90);
        marks.put("Raj",75);
        marks.put("Rahul",70);
        marks.put("Sujit",60);
        marks.put("Sampada",67);

        System.out.println("=========================================================");
        System.out.println("The Student marks hash table:  \n" + marks + "\n\n");

        String maxKey = "";
        int maxMark = 0;
        for (String key : marks.keySet()){
          // for all keys in the keyset
          if (maxMark < marks.get(key)){
              maxKey = key;
              maxMark = marks.get(key);
          }
        }
        System.out.println("=========================================================");
        System.out.println("The Student " + maxKey + " got highest marks, marks: " + maxMark);
    }
}
