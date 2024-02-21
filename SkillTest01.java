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

    public static void main(String[] args) {
        System.out.println("This is SkillTest01");
        System.out.println("Make changes as necessary so the program runs all the tests");
        System.out.println("If successful, you should see the message that says 'All tests passed'");

        test1();
        test2();
        test3();
        test4();

        System.out.println("*** All tests passed ***");
        System.out.println("*** 10 XP earned, you are now Level-2 Java Master");
    }
}
