public class CulturalObject {
    private String title;
    private String adress;

    public String getTitle() {
        return title;
    }

    public CulturalObject(String title, String adress) {
        this.title = title;
        this.adress = adress;
    }

    public void customPrint() {
        System.out.println(title.toUpperCase());
    }

}
