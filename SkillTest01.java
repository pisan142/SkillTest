/*
 * SkillTest01
 * A series of tests to check some basic Java skills
 * The file must be run using "-ea" option which enables assertions
 */

class SkillTest01 {

    // Test 1
    public static void test1() {
        System.out.println("Test 1");
        System.out.println("Fix the following expression");
        assert (3 + 2 == 10);
        System.out.println("Test 1 passed");
    }

    public static void test2() {
        System.out.println("Test 2");
        System.out.println("Write a for loop to add numbers 1 to 10");
        int sum = 0;
        // TODO: Write a for loop to add numbers 1 to 10
        assert (sum == 55);
        System.out.println("Test 2 passed");
    }

    public static void test3() {
        System.out.println("Test 3");
        System.out.println("Write a while loop to add numbers 1 to 20");
        int sum = 0;
        // TODO: Write a while loop to add numbers 1 to 20
        assert (sum == 210);
        System.out.println("Test 3 passed");
    }

    public static int add(int x, int y) {
        // Part of Test 4, returns the sum of two numbers
        return 0;
    }

    public static void test4() {
        System.out.println("Test 4");
        System.out.println("Write a function that takes two integer and returns their sum");
        // TODO: Write a function named add to add two numbers
        int result = add(3, 5);
        assert (result == 8);
        System.out.println("Test 4 passed");
    }

    public static int maxOf3(int x, int y, int z) {
        // Part of Test 5, returns the largest number
        return 0;
    }

    public static void test5() {
        System.out.println("Test 5");
        System.out.println("Write a function to return the largest of 3 integers");
        // TODO: Write a function to return the largest of 3 integers
        assert 7 == maxOf3(3, 5, 7);
        assert 7 == maxOf3(7, 5, 3);
        assert 7 == maxOf3(3, 7, 5);
        System.out.println("Test 5 passed");
    }

    public static int maxOfArray(int[] myArray) {
        // Part of Test 6, returns the largest number
        return 0;
    }

    public static void test6() {
        System.out.println("Test 6");
        System.out.println("Write a function to return the largest in given array");
        // TODO: Write a function to return the largest in given array
        int[] arr = { 3, 50, 7, 9, 11, 20 };
        assert 50 == maxOfArray(arr);
        System.out.println("Test 6 passed");
    }

    public static int largestSum(int[][] myArray2) {
        // Part of Test 7, returns the return the array with the largest sum
        return 0;
    }

    public static void test7() {
        System.out.println("Test 7");
        System.out.println("Write a function to return the array with the largest sum");
        // TODO: Write a function to return the array with the largest sum
        int[][] arr = { { 3, 50, 7 }, { 9, 11, 20 }, { 10, 3 }, { 100, 200 }, { 5, 4, 7, 8, 9 } };
        assert 300 == largestSum(arr);
        System.out.println("Test 7 passed");
    }

    public static char mostFrequent(String str) {
        // Part of Test 8, returns most frequent letter
        return 'a';
    }

    public static void test8() {
        System.out.println("Test 8");
        System.out.println("Write a function to return the most frequent letter in given string");
        // TODO: return the most frequent letter in given string
        String s1 = "hello";
        assert 'l' == mostFrequent(s1);
        String s2 = "goodbye";
        assert 'o' == mostFrequent(s2);
        System.out.println("Test 8 passed");
    }

    public static char onlyOnce(String str) {
        // Part of Test 9, returns character that appears only once
        return 'a';
    }

    public static void test9() {
        System.out.println("Test 9");
        System.out.println("Write a function to return the letter that appears only once");
        // TODO: return the letter that appears only once
        String s1 = "aaaabbbbccccd";
        assert 'd' == onlyOnce(s1);
        String s2 = "nnndjnndoookdjennkejnnefnnjfknnnnfgjgnknkghmhknhllinilli"
        assert 'm' == onlyOnce(s2);
        System.out.println("Test 9 passed");
    }

    public static boolean isSubstring(String needle, String haystack) {
        // Part of Test 10, return true if substring
        return true;
    }

    public static void test10() {
        System.out.println("Test 10");
        System.out.println("Write a function to return true if the first string is a substring of second string");
        // TODO: return true if substring
        String needle = "hello";
        String haystack = "wherecanwehidehelloandnotshowit"
        assert isSubstring(needle, haystack);
        String haystack2 = "wherecanwehidehel loandnotshowit"
        assert ! isSubstring(needle, haystack);
        System.out.println("Test 10 passed");
    }

    public static void main(String[] args) {
        System.out.println("This is SkillTest01");
        System.out.println("Make changes as necessary so the program runs all the tests");
        System.out.println("If successful, you should see the message that says 'All tests passed'");

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();

        System.out.println("*** All tests passed ***");
        System.out.println("*** 10 XP earned, you are now Level-2 Java Master");
    }
}
