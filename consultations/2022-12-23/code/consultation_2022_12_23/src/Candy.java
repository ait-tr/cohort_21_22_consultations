public class Candy {
    private String title;
    private double sugarContent;
    private String form;

    public String getForm() {
        return form;
    }

    public Candy(String title, double sugarContent, String form){
        this.title = title;
        this.sugarContent = sugarContent;
        this.form = form;
    }
    public String toString(){
        return String.format("%s %f %s", title, sugarContent, form);
    }

}
