package apps;

import utils.ArrayUtils;
import utils.InputUtility;

public class ArrayManipulation {

    public static void main(String[] args) {

        int[] grades = new int[10];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValidInteger("Enter grade " + (i + 1) + ": ");
        }

        double average = ArrayUtils.calcAverage(grades);

        System.out.println("GPA: " + average);
    }
}