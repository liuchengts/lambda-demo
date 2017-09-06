import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by apple on 2017/9/6.
 * 针对map的操作
 */
public class Test {
    static Map<Integer, String> map;
    static List<Integer> list;
    static Integer[] array;

    static {
        map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "赵六");
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        list.add(3);
        list.add(3);
        list.add(4);
        array = list.toArray(new Integer[list.size()]);
    }

    public static void main(String args[]) {
        System.out.println("test...");
        testFor_value();
    }

    /**
     * 循环
     */
    private static void testFor() {
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("*************************");
        list.stream().forEach(i -> System.out.println(i));
    }

    /**
     * 循环比较值
     */
    private static void testFor_value() {
        for (Integer i : list) {
            if (i == 3) {
                System.out.println(i);
            }
        }
        System.out.println("找出list中某个值是3的内容输出**********************");
       Integer c= list.stream().filter(integer -> integer.equals(3)).findFirst().get();
        System.out.println(c);

        System.out.println("找出list中某个值是3的个数*************************");
        //找出list中某个值是3的个数
        long count = list.stream().filter(integer -> integer.equals(3)).count();
        System.out.println(count);

        System.out.println("找出list中某个值是3的内容并组成新的对象*************************");
        //找出list中某个值是3的个数
        list = list.stream().filter(integer -> integer.equals(3)).collect(Collectors.toList());

        System.out.println("*************************");
        //找出list中某个值是3的个数
        Integer s= list.stream().filter(integer -> integer.equals(5)).findFirst().get();
        System.out.println(s);
    }

    private static void testMap() {

    }
}
