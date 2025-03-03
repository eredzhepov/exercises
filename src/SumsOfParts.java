import java.util.LinkedList;

public class SumsOfParts {

    public static int[] sumParts(int[] ls) {
        int summ = 0;
        LinkedList<Integer> list = new LinkedList<>();
//        for(int i = 0; i<= ls.length; i ++){
//            summ = 0;
//            for(int j = i; j < ls.length; j++){
//                summ+=ls[j];
//            }
//            result[i] = summ;
//        } 1-й вариант не срабатывает на быстрых числах
        list.add(0,0);
        for(int i = ls.length-1; i >=0; i--){
           summ+=ls[i];
           list.add(0,summ);
        }
        System.out.println(list);
        int[] example1 = list.stream().mapToInt(i->i).toArray();
        return example1;
    }

    public static void main(String[] args) {
        sumParts(new int[] {0, 1, 3, 6, 10});
    }
}
