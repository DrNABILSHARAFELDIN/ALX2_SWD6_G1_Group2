package basics;

public class ArraysExamples {
    public static void main(String[] args) {

    // 1. Integer Array
        int[] intArray = {10, 20, 30, 40, 50};
        for (int i : intArray) {
            System.out.println(i);
        }
            // Output: 10 20 30 40 50

    // 2. Double Array
        double[] doubleArray = {10.5, 20.5, 30.5, 40.5};
        for (double d : doubleArray) {
            System.out.println(d);
        }
            // Output: 10.5 20.5 30.5 40.5

    // 3. Character Array
        char[] charArray = {'J', 'a', 'v', 'a'};
        for (char c : charArray) {
            System.out.print(c);
        }
            // Output: Java

    // 4. String Array
        String[] stringArray = {"Hello", "World", "Java", "Arrays"};
        for (String s : stringArray) {
            System.out.println(s);
        }
            // Output: Hello World Java Arrays

    // 5. Boolean Array (exam mcq)
        boolean[] boolArray = {true, false, true, false};
        for (boolean b : boolArray) {
            System.out.println(b);
        }
            // Output: true false true false


    // 6. Array of Objects
            // Define a Person Class:
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            void display() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }


        // Create an Array of Person Objects:
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        for (Person person : people) {
            person.display();
        }
            // Output:
            // Name: Alice, Age: 30
            // Name: Bob, Age: 25
            // Name: Charlie, Age: 35


    }
}
