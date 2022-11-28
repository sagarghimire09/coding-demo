package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//	    OrderInterface order = new OrderInterfaceImpl();
//	    order.getOrder(111);

//        Object[] nestedArray = new Object[] {"1", "2", "3", new Object[] {"blue", "yellow", "red"}, "5"};
//	    printArray(nestedArray, "");

        int[] arr = {-25, -3, -1, 1, 5, 25};
        Arrays.stream(sortedArray(arr)).forEach(System.out::println);
    }

    public static void printArray(Object[] nestedArray, String index) {
        for(int i=0; i<nestedArray.length; i++) {
            if(nestedArray[i] instanceof String) {
                System.out.println((index == "" ? "" : index + ".") + i +":"+nestedArray[i]);
            }else {
                printArray((Object[]) nestedArray[i], String.valueOf(i));
            }
        }
    }

//           -25
//           -3
//           -1
//            1
//            5
//            25
    public static int[] sortedArray(int[] arr) {
//        return Arrays.stream(arr).map(a->a*a).sorted().toArray();
        int left = 0;
        int right = arr.length - 1;
        int[] answer = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            int temp = 0;
            if(Math.abs(arr[left]) < Math.abs(arr[right])) {
                temp = arr[right];
                right--;
            }else {
                temp = arr[left];
                left++;
            }
           answer[i] = temp * temp;
        }
        return answer;
    }

    public static boolean isBeautifulString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else
                map.put(str.charAt(i), 1);
        }

        for(int i='a'; i<'z'; i++){
            if(map.containsKey((char) i) && map.containsKey((char) i+1)) {
                if(map.get((char)i) < map.get((char) i+1))
                    return false;
            }
        }
        return true;
    }
}
