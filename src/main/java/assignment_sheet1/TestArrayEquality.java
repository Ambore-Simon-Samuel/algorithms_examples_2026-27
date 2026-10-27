package assignment_sheet1;
public class TestArrayEquality {
public static void main(String[] args) {

    int[] first = {1, 2, 3};
    int[] second = {3, 2, 1};
    int[] third = {1, 2, 4};


    System.out.println("Brute force:");
    System.out.println(ArrayEquality.bruteForceEqual(first, second));
    System.out.println(ArrayEquality.bruteForceEqual(first, third));

    System.out.println("Two pointers:");
    System.out.println(ArrayEquality.twopointerEqual(first, second));
    System.out.println(ArrayEquality.twopointerEqual(first, third));

  }
}