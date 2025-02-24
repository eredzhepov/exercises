import java.util.ArrayList;
import java.util.List;

public class MaketheDeadfishSwim {
    public static int[] parse(String data) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < data.length(); i++){
            switch (data.charAt(i)){
                case 'i': count++;
                break;
                case 'd': count--;
                break;
                case 's': count*=count;
                break;
                case 'o': list.add(count);
                break;
                default: continue;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray(); // Implement me! :)
    }
    public static void main(String[] args) {
       parse("iiisdosodddddiso");
    }
}
