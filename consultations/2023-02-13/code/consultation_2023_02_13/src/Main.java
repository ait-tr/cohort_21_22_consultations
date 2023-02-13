

public class Main {
    public static void main(String[] args) {
        StringProcessor trimString = (s) -> {
            System.out.println("hey!");
            return s.trim();
        };

        StringProcessor shortenString = (s) -> {
            //
            if (s.length() > 5) {
                return s.substring(0, 5) + "...";
            } else {
                return s;
            }
        };
        StringProcessor shortenStringVer2 = (s) -> (
                s.length() > 5 ? s.substring(0, 5) + "..." : s
        );

        StringProcessor indicateIfStratsWithB = (s) -> {

            if (s.startsWith("boo")) {
                return "bingo!";
            }
            return s;
        };
        StringProcessor indicateIfStratsWithBVer2 = (s) -> {
            if (!(s != null && !s.isEmpty())) {
                return "Empty String";
            }
            if (s.charAt(0) == 'b') {
                return "bingo!";
            }
            return s;
        };
        StringProcessor indicateIfStratsWithBVer3 = (s) -> {
            if (s == null || s.isEmpty()) {
                return "Empty String";
            }
            if (s.charAt(0) == 'b') {
                return "bingo!";
            }
            return s;
        };
        // a || b    <--> !(!a && !b) -- Закон де Моргана // De Morgan's Low
        // a && b    <--> !(!a || !b)
        System.out.println(indicateIfStratsWithBVer2.process(""));
    }
}