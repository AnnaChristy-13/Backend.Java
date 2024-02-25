package homework14;

public class Task1 {
            public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 5};
            int[] array2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

            int n1 = array1.length + 1; // Размер массива + 1
            int n2 = array2.length + 1;

            int sum1 = n1 * (n1 + 1) / 2;
            int sum2 = n2 * (n2 + 1) / 2;

            int sumArray1 = 0;
            int sumArray2 = 0;

            for (int num : array1) {
                sumArray1 += num;
            }

            for (int num : array2) {
                sumArray2 += num;
            }

            int missingNumber1 = sum1 - sumArray1;
            int missingNumber2 = sum2 - sumArray2;

            System.out.println("Missing number in first array: " + missingNumber1);
            System.out.println("Missing number in second array: " + missingNumber2);
        }
    }

