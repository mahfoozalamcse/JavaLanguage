package String;

public class String4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mahfooz");
        System.out.println(sb.length());
        System.out.println(sb.indexOf("f"));
        System.out.println(sb.charAt(3));
        System.out.println(sb.indexOf("a", 0));
        System.out.println(sb.lastIndexOf("o"));
        System.out.println(sb.capacity());
        System.out.println(sb.isEmpty());

        sb.append("alam");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0, 4));
        System.out.println(sb.replace(0, 5, "alam"));
    }
}
