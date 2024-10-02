public class Array {

    public static void main(String[] args) {
        // Part 1: For Loop to print numbers 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Part 2: Arrays and Methods
        String[] students = {"Bob", "Fred", "Sultan", "Safa"};
        double[] grades = {3.4, 3.2, 4.0, 3.9};

        // Invoking the getStudentGrades method twice with different integers
        System.out.println(getStudentGrades(2, students, grades));  // Sultan and 4.0
        System.out.println(getStudentGrades(3, students, grades));  // Safa and 3.9

        // Bonus 2: Array Reversal
        int[] arrayToReverse = {1, 2, 3, 4, 5};
        reverseArray(arrayToReverse);  // Reverse the array in place
        System.out.print("Reversed Array: ");
        for (int num : arrayToReverse) {
            System.out.print(num + " ");
        }
    }

    // Part 2: Method to get student names and grades (BONUS 1: Returning String)
    public static String getStudentGrades(int index, String[] students, double[] grades) {
        if (index < 0 || index >= students.length) {
            return "Invalid index";
        }
        return "Student: " + students[index] + ", Grade: " + grades[index];
    }

    // Bonus 2: Method to reverse an array in place
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap the elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }
}

