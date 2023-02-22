import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String strTmpl = "I like Java!!!";
        final String strJava = "Java";
        final String strILike = "I like";
        final String strExclamationMarks = "!!!";

        System.out.print("Нравится ли вам Java? (прим.отв. - \"" + strTmpl + "\"):  ");
        String str = in.nextLine();

        if (!str.contains(strJava)
                || !str.startsWith(strILike)
                || !str.endsWith(strExclamationMarks)) {
            return;
        }

        System.out.println(str.toUpperCase());
        String str2 = str.replace('a', 'o');
        System.out.println(str2.substring(7,11));
    }
}