/*
Получить List из N случайных целых чисел


    *  Заполнить лист так, что бы числа шли по возрастанию
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(getRandomList(10));
        System.out.println(getRandomList(5));
        System.out.println(getRandomList(15));
    }

    public static int getRandomNumber(){

        int min = -1000;//Integer.MIN_VALUE;
        int max =1000; //Integer.MAX_VALUE;

        int rnd = (int)(((long)max-min+1)*Math.random()+min);
        return rnd;
    }

    public  static ArrayList<Integer> getRandomList(int size){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            result.add(getRandomNumber());
        }
        return result;
    }

}