import java.util.Arrays;

public class BuildTower {
    public static String[] towerBuilder(int n){
        String[] result = new String[n];
        for(int i = 1; i<=n;i++){
            StringBuilder b = new StringBuilder();
            for(int j = n ; j > i; j--){
                b.append(" ");
            }
            for(int j = 0; j < i*2 - 1; j++){
                b.append("*");
            }
            for(int j = n; j > i; j--){
                b.append(" ");
            }
            result[i-1] = b.toString();
        }
        Arrays.stream(result).forEach(System.out::println);
        return  result;
    }
    public static void main(String[] args) {
        towerBuilder(6);
        System.out.println();
    }
}
