package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> arr_list = new ArrayList<Integer>();
        LinkedList <Integer> link_list = new LinkedList<Integer>();

        arr_list.add(6);
        arr_list.add(15);

        link_list.add(6);
        link_list.add(15);


        System.out.println("Adding element to the beginning:");
        long start_time = System.nanoTime();
        arr_list.add(1);
        long estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 1 element to the beginning, ArrayList: " + estimated_time);

        start_time = System.nanoTime();
        link_list.add(1);
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 1 element to the beginning, LinkedList: " + estimated_time);
        System.out.println();


        System.out.println("Adding elements to the beginning:");
        start_time = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            arr_list.add(i);
        }
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 20 elements to the beginning, ArrayList: " + estimated_time);

        start_time = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            link_list.add(i);
        }
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 20 elements to the beginning, LinkedList: " + estimated_time);
        System.out.println();

        System.out.println("Adding element in the center:");
        start_time = System.nanoTime();
        arr_list.add(arr_list.size()/2, 40);
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 1 element in the center, ArrayList: " + estimated_time);

        start_time = System.nanoTime();
        link_list.add(link_list.size()/2,40);
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 1 element in the center, LinkedList: " + estimated_time);
        System.out.println();

        System.out.println("Adding elements in the center:");
        start_time = System.nanoTime();
        for (int i = 20; i < 40; i++) {
            arr_list.add(arr_list.size()/2,i);
        }
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 20 elements in the center, ArrayList: " + estimated_time);

        start_time = System.nanoTime();
        for (int i = 20; i < 40; i++) {
            link_list.add(link_list.size()/2,i);
        }
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 20 elements in the center, LinkedList: " + estimated_time);
        System.out.println();

        System.out.println("Adding element to the end:");
        start_time = System.nanoTime();
        arr_list.add(arr_list.size(),50);
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 1 element to the end, ArrayList: " + estimated_time);

        start_time = System.nanoTime();
        link_list.add(link_list.size(),50);
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 1 element to the end, LinkedList: " + estimated_time);
        System.out.println();

        System.out.println("Adding element to the end:");
        start_time = System.nanoTime();
        for (int i = 51; i < 71; i++) {
            arr_list.add(arr_list.size(),i);
        }
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 20 elements to the end, ArrayList: " + estimated_time);

        start_time = System.nanoTime();
        for (int i = 51; i < 71; i++) {
            link_list.add(link_list.size(),i);
        }
        estimated_time = System.nanoTime() - start_time;
        System.out.println("Time of adding 20 elements to the end, LinkedList: " + estimated_time);
    }
}
