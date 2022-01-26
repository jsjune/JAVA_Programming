package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2309_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int sum = 0;
        int[] arrDwarf = new int[9];
        int[] fakeDwarf = new int[2];

        for (int i = 0; i < 9; i++) {
            arrDwarf[i] = Integer.parseInt(br.readLine());
            sum += arrDwarf[i];
        }
        Arrays.sort(arrDwarf);


        boolean flag = false;

        for (int i = 0; i < 9; i++) {
            if (flag == true) {
                break;
            }
            sum -= arrDwarf[i];
            for (int j = i + 1; j < 9; j++) {
                sum -= arrDwarf[j];
                if (sum == 100) {
                    fakeDwarf[0] = arrDwarf[i];
                    fakeDwarf[1] = arrDwarf[j];
                    flag = true;
                    break;
                }
                sum += arrDwarf[j];
            }
            sum += arrDwarf[i];
        }
        for (int i = 0; i < 9; i++) {
            if (arrDwarf[i] != fakeDwarf[0] && arrDwarf[i] != fakeDwarf[1]) {
                sb.append(arrDwarf[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
