package day4;
import java.util.Scanner;
import java.util.Random;

public class Day4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int[] array = new int[n];
        int i = 0;
        while(i<n) array[i++] = (int)(Math.random() * 11);
        System.out.println("Длина массива: " + array.length);
        int greater8 = 0;
        int equals1 = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        i = 0;
        while(i<n) {
            if (array[i] > 8) greater8++;
            if (array[i] == 1) equals1++;
            if (array[i] % 2 == 0) even++;
            if (array[i] % 2 == 1) odd++;
            sum += array[i++];
        }
        System.out.println("Количество чисел больше 8: " + greater8);
        System.out.println("Количество чисел равных 1: " + equals1);
        System.out.println("Количество чётных чисел: " + even);
        System.out.println("Количество нечётных чисес: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("---------------------------------------------------------");
        int[] ar2 = new int[100];
        i=0;
        while(i<100) ar2[i++] = (int)(Math.random() * 10001);
        int max = ar2[0];
        int min = ar2[0];
        int end0 = 0;
        int sumEnd0 = 0;
        for(int el: ar2) {
            if(el>max) max = el;
            if(el<min) min = el;
            if(el%10 == 0) {
                end0++;
                sumEnd0 += el;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + end0);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sumEnd0);
        System.out.println("---------------------------------------------------------");
        int[][] matrix = new int[12][8];
        int indMaxString = 0;
        int sumMaxString = 0;
        for(int ind =0; ind<matrix.length; ind++) for(int j = 0; j<matrix[ind].length; j++) matrix[ind][j] = (int)(Math.random() * 51);
        for(int ind = 0; ind<matrix.length; ind++) {
            int cur = 0;
            for(int j = 0; j<matrix[ind].length; j++) cur += matrix[ind][j];
            if(cur > sumMaxString) {
                sumMaxString = cur;
                indMaxString = ind;
            }

        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + indMaxString);
        System.out.println("---------------------------------------------------------");
        int sumThree = ar2[0] + ar2[1] + ar2[2];
        int firstEl = 0;
        for (int j = 2; j<99; j++) if(ar2[j-1] + ar2[j] + ar2[j+1] > sumThree) {
            sumThree = ar2[j-1] + ar2[j] + ar2[j+1];
            firstEl= j-1;
        }
        System.out.println(sumThree);
        System.out.println(firstEl);


        }

    }


