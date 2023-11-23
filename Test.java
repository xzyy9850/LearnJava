import java.util.HashMap;
import java.util.Map;



public class Test{

    public static void main(String[] args){
        int n = 100;
        int sum = 0;
        for(;n > 0; n--){
            sum += n * (n + 1) / 2;
        }
        System.out.println(sum);

        // double a1 = 3;
        // double a2 = 5;
        // double a3 = 1;
        // double a4 = 3.4;
        // double a5 = 2;
        // double a6 = 50;

        // double aveTotal = (a1 + a2 + a3 + a4 + a5 + a6) / 6;
        // System.out.println(aveTotal);

        double a[] = {3 , 5 , 1 , 3.4 , 2 , 50};
        double total = 0;
        for(int i = 0; i < a.length; i++){
            total += a[i] ;
        }
        double aveTotal = total / a.length ;
        System.out.println(aveTotal);

        int b[] = new int[100];
        for(int i = 0; i < 100; i++){
            b[i] = (int)(Math.random() * 100);
        }
        Map<Integer,Integer> hMap = new HashMap<>();

        for (int i : b) {
            hMap.put(i,0);
        }
        hMap.put(101, 0);
        hMap.put(-1, 0);
        
        System.out.println(hMap.size());
        System.out.println(hMap);
        
    }

}

