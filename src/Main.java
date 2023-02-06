public class Main {
    public static void main(String[] args) {
        Integer a = 7;
        Integer c = -9;
        int b = Integer.MAX_VALUE;
        String str = new String("Hello World");
        System.out.println(a.doubleValue());
        System.out.println("The max for integer value is " + b);
        System.out.println(str);
        System.out.println(Math.abs(c));
        System.out.println(Math.floor(500+Math.random()*501));

        System.out.println(str == "Hello World");
        System.out.println(str.equals("Hello World"));
        String d[] = str.split(" ");
        System.out.println(d[1]);
        System.out.println(str.contains("Wo"));

        char kata[] = str.toCharArray();
        kata[6] = 'w';
        System.out.println(kata);
    }
}
