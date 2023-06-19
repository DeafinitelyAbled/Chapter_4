public class MethodTheType {
    public static <TheType extends Comparable<TheType>>
    TheType Triple(TheType i1, TheType i2, TheType i3) {
        TheType result = i1;
        if (result.compareTo(i2) < 0) {
            result = i2;
        }
        if (result.compareTo(i3) < 0) {
            result = i3;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "Oscar";
        String s2 = "James";
        String s3 = "Andrew";

        Integer i1 = 10;
        Integer i2 = 20;
        Integer i3 = 30;

        Character ch1 = 'w';
        Character ch2 = 'a';
        Character ch3 = 'm';

        System.out.println("Items: " + s1 + " " + s2 + " " + s3 + " ");
        System.out.println("Result: " + Triple(s1, s2, s3));
        System.out.println("");
        System.out.println("Items: " + i1 + " " + i2 + " " + i3 + " ");
        System.out.println("Result: " + Triple(i1, i2, i3));
        System.out.println("");
        System.out.println("Items: " + ch1 + " " + ch2 + " " + ch3 + " ");
        System.out.println("Result: " + Triple(ch1, ch2, ch3));
        System.out.println("");
    }

}