import java.util.HashMap;
import java.util.Iterator;

public class DZ6 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) {
        addToHMap(0);
        addToHMap(3);
        addToHMap(33);
        addToHMap(67);
        addToHMap(46);
        addToHMap(12);
        addToHMap(91);
        addToHMap(32);
        addToHMap(73);
        addToHMap(58);
        System.out.println(isEmpty());

        printConsole();
        System.out.println();
        try {
            System.out.println(printOneEl(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToHMap(Integer number){
        hMap.put(number, OBJ);
    }


    private static boolean isEmpty(){
        return hMap.isEmpty();
    }


    private static void printConsole(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }


    private static int printOneEl(int index){
        return (Integer)hMap.keySet().toArray()[index];
    }
}