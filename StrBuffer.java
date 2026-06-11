public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mangesh ");
        // System.out.println(sb.length());
        sb.append("Shinde");
        sb.insert(0,"Java Developer ");
        System.out.println(sb);
    }
}
