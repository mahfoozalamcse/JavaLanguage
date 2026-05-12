package part2;

public class switchData {
    public static void main(String[] args) {
        //old switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                break;
        }

        // java 14+ switch
          switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Invalid day");
        }

        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid day";
        };
        System.out.println(result);
    }
}
