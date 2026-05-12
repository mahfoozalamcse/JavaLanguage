package part2;

public class StringJava {
    public static void main(String[] args) {
        String str = "Hello World!";
        String str2 = "Hello World!";

        System.out.println(str.equals(str2));

        String str3 = new String("Hello World!");
        System.out.println(str.equals(str3));

        String str4 = new String("Hello World!");
        System.out.println(str3 == str4);

        String a = "java";
        String b = new String("java");

        System.out.println(a == b); // false different object in memory

        System.out.println(a.equals(b)); // true

        // String is immutable
        // eg.
        String str5 = "Hello World!";
        str5.concat(" How are you?");

        System.out.println(str5); // so they will not change

        // why immutable
        // 1. performance
        // 2. thread safety
        // 3. security
        // 4. string pool


        // String operation create new object
       // eg.
       String str6 = "Hello World!";
       String str7 = str6.concat(" How are you?");

       System.out.println(str7); // so they will add changes

       // common method
       // 1. length()
       // 2. charAt()
       // 3. substring()
       // 4. indexOf()
       // 5. toUpperCase()
       // 6. toLowerCase()
       // 7. trim()

       String s = "Java";
       System.out.println(s.toLowerCase());
       System.out.println(s);

       // example all method
       String s1 = "Java";
       System.out.println(s1.length());
       System.out.println(s1.charAt(1));
       System.out.println(s1.substring(2));
       System.out.println(s1.indexOf('a'));
       System.out.println(s1.toUpperCase());
       System.out.println(s1.toLowerCase());
       System.out.println(s1.trim());



       // Diffrence StringBuilder and StringBuffer
       // StringBuilder is thread safe
       // StringBuffer is not thread safe
       // StringBuilder is more efficient
       
       // eg StringBuilder
       StringBuilder sb = new StringBuilder("mahfooz");
       sb.append("alam");
       System.out.println(sb);

       // eg StringBuffer
       StringBuffer sb1 = new StringBuffer("mahfooz");
       sb1.append("alam");
       System.out.println(sb1);

       // method
       // 1. append()
       // 2. insert()
       // 3. delete()
       // 4. replace()
       // 5. reverse()
       // 6. toString()

       // example all method
       StringBuffer sb2 = new StringBuffer("mahfooz");
       sb2.append("alam");
       System.out.println(sb2);

       StringBuffer sb3 = new StringBuffer("mahfooz");
       sb3.insert(1, "alam");
       System.out.println(sb3);

       StringBuffer sb4 = new StringBuffer("mahfooz");
       sb4.delete(1, 4);
       System.out.println(sb4);

       StringBuffer sb5 = new StringBuffer("mahfooz");
       sb5.replace(1, 4, "alam");
       System.out.println(sb5);

       StringBuffer sb6 = new StringBuffer("mahfooz");
       sb6.reverse();
       System.out.println(sb6);

       StringBuffer sb7 = new StringBuffer("mahfooz");
       System.out.println(sb7.toString());

       // example all method StringBuilder
       StringBuilder sb8 = new StringBuilder("mahfooz");
       sb8.append("alam");
       System.out.println(sb8);

       StringBuilder sb9 = new StringBuilder("mahfooz");
       sb9.insert(1, "alam");
       System.out.println(sb9);

       StringBuilder sb10 = new StringBuilder("mahfooz");
       sb10.delete(1, 4);
       System.out.println(sb10);

       StringBuilder sb11 = new StringBuilder("mahfooz");
       sb11.replace(1, 4, "alam");
       System.out.println(sb11);

       StringBuilder sb12 = new StringBuilder("mahfooz");
       sb12.reverse();
       System.out.println(sb12);

       StringBuilder sb13 = new StringBuilder("mahfooz");
       System.out.println(sb13.toString());


       // example intern
       String s2 = new String("java");
        String s3 = s1.intern();
       System.out.println(s2 == s3); // false
     }
}
