public class FirstExercise {
    public static void main(String[] args) {

        if (args.length > 1) {
            String userName = args[0];
            int age = Integer.parseInt(args[1]);
            String city = args[2];

            System.out.println("User Information:");
            System.out.println("Name: " + userName);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
        } else {
            System.out.println("THe user information must be an argument: Name Age City");
        }

    }

}
