import java.util.*;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array){
        TreeSet<Character> alphabet = new TreeSet<>();
        TreeSet<Character> set = new TreeSet<>();
        for(char i = 'A';i<='z';i++){
            alphabet.add(i);
        }
        for(char c: array){
            set.add(c);
        }
        TreeSet<Character> result = (TreeSet<Character>) alphabet.subSet(set.first(),set.last());
        result.removeAll(set);
        return result.first();
    }
    /********************************Лучшее решение*/
    public static char findMissingLetter1(char[] array) {

        char start = array[0];
        for (char c: array) {
            if (start != c) return start;
            start++;
        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));;
    }
}
