public class Input {
    String type;
    String name;
    String value;
    Input(String type, String name, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return type + name + value ;
    }
}
