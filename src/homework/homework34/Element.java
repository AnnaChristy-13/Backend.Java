package homework34;

public class Element {

    private Integer element;

    private String object;

    public Element(Integer element, String object) {
        this.element = element;
        this.object = object;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element=" + element +
                ", object='" + object + '\'' +
                '}';
    }
}
