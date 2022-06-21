package lesson.Exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class dZ2 {



    public static void main(String[] args) {


        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"4", "3", "2", "1"}, {"2", "3", "4", "1"}, {"5", "6", "7", "8"}};

        System.out.println(arr + "  ");

        try {
            try {
                int result = check(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
         catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int check (String [][] arr) throws MyArraySizeException, MyArrayDataException{
        int count = 0;
            if (arr.length !=4) {
            throw new MyArraySizeException();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                for (int j = 0; j < arr[i].length; j++) {
                    {
                        try {
                            count = count + Integer.parseInt(arr[i][j]);
                    }
                        catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }

                    }

                }

            }

       return count;
           }


}