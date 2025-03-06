public class Notes {

    /*
    Chapter 2: 2.1 -- 2.8

     #Print
        System.out.print("Hello World"); this will print "Hello World" and not go to the next line

        System.out.println("Hello World"); this will print "Hello World" and go to the next line

        System.out.println("Welcome\nto\nJava\nProgramming!"); 

        System.out.printf("%s", "Hello World"); this is a formated print statement
    
    #Class
        public class Notes {}

        every java program must have a class declaration

        a public class must have the same name as the file name

        By convention, class names begin with a capital letter and
        capitalize the first letter of each word

        A class name is an identifier

        identifier: a series of characters consisting of letters, digits, uderscores, and dollar signs.
            does not begin with a digit
        
    #Methods
        public static void main(String[] args) {}

        main method is the entry point of the program

    #Compilation
        javac Notes.java

    #Execution
        java Notes  (this will run the program, Notes.class)

    #Variables
        int x = 10;

    #Operators
        + addition
        - subtraction
        * multiplication
        / division
        % modulus
        ++ increment
        -- decrement

    #import
        import java.util.Random;

        import java.util.Scanner; this will import the Scanner class, which is used to read input from the user

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int num2 = input.nextInt();

    
    Chapter 3: 3.1 – 3.5

    #Set and Get Methods 
    public class Account {
        private String name;  // instance variable

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        
    }



    #Compiling and executing a program with multiple classes
        javac Class.java ClassTest.java

        if directory has only these files: Class1.java and Class2.java
        then can compile:

        java *.java

        execute:

        java ClassTest

    
    #String
        are a package in java.lang, which is implicitly imported into every java program






    */
    
}
