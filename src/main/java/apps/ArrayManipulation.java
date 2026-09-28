package apps;

import utils.ArrayUtils;
import utils.InputUtility;

import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {

        int[] grades = new int[10];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = InputUtility.getValidInteger("Enter grade " + (i + 1) + ": ");
        }

        double average = ArrayUtils.calcAverage(grades);
        System.out.println("GPA: " + average);

        int highestGrade = ArrayUtils.findMax(grades);
        System.out.println("Highest grade: " + highestGrade);

        int lowestGrade = ArrayUtils.findMin(grades);
        System.out.println("Lowest grade: " + lowestGrade);

        int numberOfSeventies = ArrayUtils.count(grades, 70);
        System.out.println("Number of subjects with grade 70: " + numberOfSeventies);

        int mostFrequent = ArrayUtils.getMostFrequent(grades);
        System.out.println("Most frequent grade: " + mostFrequent);

        int aboveAverage = ArrayUtils.countGreaterThanAverage(grades);
        System.out.println("Number of subjects above GPA: " + aboveAverage);

        Scanner scanner = new Scanner(System.in);

        String[] texts = new String[10];

        for (int i = 0; i < texts.length; i++) {
            System.out.print("Enter text " + (i + 1) + ": ");
            texts[i] = scanner.nextLine();
        }

        String lastAlphabetically = ArrayUtils.findMax(texts);
        System.out.println("Last alphabetically: " + lastAlphabetically);

        String firstAlphabetically = ArrayUtils.findMin(texts);
        System.out.println("First alphabetically: " + firstAlphabetically);

        ArrayUtils.displayArray(grades);
        ArrayUtils.displayArray(texts);
    }
}