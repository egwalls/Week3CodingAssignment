package Week3.Week3CodingAssignment;

import java.util.*;
public class Week3CodingAssignment {
    public static void main(String[] args) {
        int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 102 };
        System.out.println("Last age minus first: " + (ages[ages.length - 1] - ages[0]));
        double ageSum = 0.0;
        for (int age : ages) {
            ageSum += age;
        }
        System.out.printf("The average age is %.2f\n", ageSum/ages.length);

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        double nameSum = 0.0;
        for (String name : names) {
            nameSum += name.length();
        }
        System.out.printf("The average length of names in the array is %.2f\n", nameSum/names.length);
        String namesConcat = names[0];
        for (int i = 1; i < names.length; i++) {
            namesConcat += ", " + names[i];
        }
        System.out.println(namesConcat);

        //you access the last element of an array by using array[array.length - 1]
        //you access the first element of an array by using array[0]

        int[] nameLengths = new int[names.length];
        for (int i = 0; i < nameLengths.length; i++) {
            nameLengths[i] = names[i].length();
        }
        int nameArraySum = 0;
        for (int length : nameLengths){
            nameArraySum += length;
        }
        System.out.println("The sum of the lengths in the array is " + nameArraySum);
        System.out.println(repeatWord("Hi", 5));
        System.out.println(fullName("Bruce", "Wayne"));
        int[] arr3 = {35, 29, 83};
        System.out.println("This array has a sum greater than 100: " + isGreaterThan100(arr3));
        double[] arr4 = {30.2, 29.5, 67.8};
        System.out.println("The average of this array is " + averageOfArray(arr4));
        double[] arr5 = {389.8, 293.2, 394.1};
        double[] arr6 = {39.5, 29.4, 10.2};
        System.out.println("The first array has a larger average: " + isArrayAverageLarger(arr5, arr6));
        System.out.println("Is it both hot out and I have enough money for a drink? " + willBuyDrink(true, 7.24));
        int[] arr7 = {14, 53, 63, 55, 3, 87};
        System.out.println("The median of this array is: " + medianOfArray(arr7));


    }

    public static String repeatWord(String word, int n) {
        String output = "";
        for (int i = 0; i <= n; i++){
            output += word;
        }
        return output;

    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static boolean isGreaterThan100(int[] array){
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        if (sum > 100) {
            return true;
        }
        return false;
    }

    public static double averageOfArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum/array.length;
    }

    public static boolean isArrayAverageLarger(double[] arr1, double[] arr2){
        double sum1 = 0;
        double sum2 = 0;
        for (double num : arr1) {
            sum1 += num;
        }
        for (double num : arr2) {
            sum2 += num;
        }
        if (sum1/arr1.length > sum2/arr2.length){
            return true;
        }
        return false;
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if (isHotOutside == true && moneyInPocket >= 10.50){
            return true;
        }
        return false; 
    }

    //this method looks through an array and returns the median
    //median, like average, can be useful for understanding a dataset
    //because median is the "centermost value"
    //I chose to calculate median because it is just a little more complicated
    //than finding the average or largest or smallest value in an array
    
    public static int medianOfArray(int[] arr){
        Arrays.sort(arr); //sort the array using the inbuilt sort method, to use this you need to import java.utils
        if (arr.length % 2 != 0) {
            return arr[(arr.length)/2];
        }
        return ((arr[(arr.length - 1) / 2]) + (arr[(arr.length)/2]))/2;
    }
}
