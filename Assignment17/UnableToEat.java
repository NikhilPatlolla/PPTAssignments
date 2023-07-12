public class UnableToEat {

    public static int countStudents(int[] students, int[] sandwiches) {
        int unableToEat = 0;
        int n = students.length;
        int i = 0;
        int j = 0;

        while (i < n && j < sandwiches.length) {
            if (students[i] == sandwiches[j]) {
                i++; // Student takes the sandwich
                j++; // Move to the next sandwich in the stack
            } else {
                i++; // Move the student to the end of the queue
            }
        }

        unableToEat = n - j; // Calculate the number of students unable to eat

        return unableToEat;
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        int result = countStudents(students, sandwiches);
        System.out.println("Number of students unable to eat: " + result);
    }
}
