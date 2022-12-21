public class Main {
    public static void main(String[] args) {
        Museum historicalMuseoum = new Museum("Historical", "history of wars", "Berlin, Blabla str.", 15000);
        String x = historicalMuseoum.toString();
        System.out.println(historicalMuseoum.toString());
        CulturalObject monument = new CulturalObject("Bismark", "Berlin, Blabla sqr.");
        monument.customPrint();
        historicalMuseoum.customPrint();
    }
}