public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        sb.insert(1, "o");
        System.out.println(sb);
        sb.append("s");
        System.out.println(sb);
        sb.setCharAt(0,'s');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        }
    }
