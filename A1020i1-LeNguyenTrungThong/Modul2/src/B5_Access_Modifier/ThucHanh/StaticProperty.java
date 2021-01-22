package B5_Access_Modifier.ThucHanh;

public class StaticProperty {
    private String name;
    private String color;
    public static int number;

    StaticProperty(String name, String color){
        this.name = name;
        this.color = color;
        number++;
    }

    void display() {
        System.out.println(name + " " + color + " " + number);
    }


    public void main(String[] args) {
        StaticProperty car1 = new StaticProperty("mazda", "blue");
        car1.display();
        StaticProperty car2 = new StaticProperty("toyota", "red");
        car2.display();
    }
}
