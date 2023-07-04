import java.util.*;

public class DZ3 {

    static void UdalenieChet(List<Integer> arrList) {
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        System.out.println("Остаток после удаления чётных: " + arrList);

    }
    static Integer MaxNum(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        return max;
    }
    static Integer MinNum(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        return min;
    }
    static Double FindSredn(List<Integer> arrList) {
        int sum = 0;
        double sr;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        }
        sr = sum / arrList.size();
        return sr;
    }

    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList(Arrays.asList(8, 453, 4, 7, 182, 309, 17, 57, 47, 33));
        System.out.println("Изначальный список: " + list_num);
        System.out.println("Минимальное значение: " + MinNum(list_num));
        System.out.println("Максимальное значение: " + MaxNum(list_num));
        System.out.println("Среднее значение: " + FindSredn(list_num));
        UdalenieChet(list_num);
    }
}