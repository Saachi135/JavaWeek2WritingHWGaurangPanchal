package homework_week_6;

/**
     * Write a Java Programme using the following steps.
     * 1.1 Declare two instance variables.
     * 1.2 declare one instance variables.
     * 1.3 call both instance variables into the instance method inside the print statement
     * 1.4 declare the main method
     * 1.5 call the above instance method into the main method and run the programme
     */
    public class Programm_1 {
        // Declare two instance variable
        int a= 10;
        int b= 20;
        // 1.2 declare one instance variable
        //1.3 call both instance variable into the instance method inside the print statement
        public void instanceMethod(){
            System.out.println(a);
            System.out.println(b);
        }

        //1.4 Declare the main method.
        //1.5 call the above intance method into the main method and run the programme.
        public static void main(String[] args) {
            Programm_1 programm_1 = new Programm_1();
            programm_1.instanceMethod();
        }

    }
