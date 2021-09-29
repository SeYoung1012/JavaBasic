package day0707;

// ArrayUtil의 메소드들을 테스트 하는 클래스
import util.ArrayUtil;

public class Ex01Test {
    public static void main(String[] args) {
        // 이제 우리가 크기가 알아서 늘어나는 배열을 만들었기 때문에
        // 이제는 배열을 초기화해줄때 크기를 0으로 초기화해준다.

        int[] arr = new int[0];

        // 1. int[] 기준
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
        System.out.println("int 값 추가 이후");
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
        int temp = ArrayUtil.set(arr, 2, 80);
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
        arr = ArrayUtil.removeByElement(arr, 9);
        System.out.println("1-K. removeByElement() 후 indexOf(9): "+ArrayUtil.indexOf(arr, 9));
        
        
    }
}








