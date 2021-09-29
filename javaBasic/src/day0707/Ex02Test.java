package day0707;

import util.ArrayUtil;

public class Ex02Test {
	public static void main(String[] args) {
		double [] arr = new double[0];

        // 1. double [] 기준
        // A. size()
        System.out.println("1-A. size(): " + ArrayUtil.size(arr));
        // B. isEmpty()
        System.out.println("1-B. isEmpty(): " + ArrayUtil.isEmpty(arr));
        
        // 현재 배열에 int 값을 몇개 추가해보자
        arr = ArrayUtil.add(arr, 3);
        arr = ArrayUtil.add(arr, 6);
        arr = ArrayUtil.add(arr, 9);
        arr = ArrayUtil.add(arr, 2);
        arr = ArrayUtil.add(arr, 4);
        System.out.println("-------------");
        System.out.println("double 값 추가 이후");
        System.out.println("-------------");
        // 1-C. size() 
        System.out.println("1-C. size(): " + ArrayUtil.size(arr));
        // 1-D. isEmpty()
        System.out.println("1-D. isEmpty(): " + ArrayUtil.isEmpty(arr));
        // 1-E. get()
        System.out.println("1-E. get(2): " + ArrayUtil.get(arr, 2));
        // 1-F. contains()
        System.out.println("1-F. contains(2): " + ArrayUtil.contains(arr, 2));
        System.out.println("1-F. contains(450): " + ArrayUtil.contains(arr, 450));
        // 1-G. indexOf()
        System.out.println("1-G. indexOf(2): " + ArrayUtil.indexOf(arr, 2));
        System.out.println("1-G. indexOf(450): " + ArrayUtil.indexOf(arr, 450));
        // 1-H. add(arr, index, e)
        System.out.println("1-H. add() 전 get(2): " + ArrayUtil.get(arr, 2));
        arr = ArrayUtil.add(arr, 2, 30);
        System.out.println("1-H. add() 후 get(2): " + ArrayUtil.get(arr, 2));
        // 1-I. set()
        System.out.println("1-I. set() 전 size(): " + ArrayUtil.size(arr));
        System.out.println("1-I. set() 전 get(2): " + ArrayUtil.get(arr, 2));
        double temp = ArrayUtil.set(arr, 2, 80);
        System.out.println("1-I. set() 후 size(): " + ArrayUtil.size(arr));
        System.out.println("1-I. set() 후 get(2): " + ArrayUtil.get(arr, 2));
        System.out.println("1-I. set() 원래 값: " + temp);
        // 1-J. remove()
        System.out.println("1-J. remove() 전 get(2): " + ArrayUtil.get(arr, 2));
        System.out.println("1-J. remove() 전 size(): " + ArrayUtil.size(arr));
        arr = ArrayUtil.remove(arr, 2);
        System.out.println("1-J. remove() 후 get(2): " + ArrayUtil.get(arr, 2));
        System.out.println("1-J. remove() 후 size(): " + ArrayUtil.size(arr));
        
        // 1-K. removeByElement()
        System.out.println("1-K. removeByElement() 전 indexOf(9): "+ ArrayUtil.indexOf(arr, 9));
  //      arr = ArrayUtil.removeByElement(arr, 9);
        System.out.println("1-K. removeByElement() 후 indexOf(9): "+ArrayUtil.indexOf(arr, 9));
        
        
    }
}

