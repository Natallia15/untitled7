import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Input input = new Input(" Head", "Nose", "Strategy");
        Input input1 = new Input(" Header", "Fun", "utf-8");
        Input input2 = new Input(" Eyes", "Neck", "Milk");

        ArrayList<Input> list = new ArrayList<>();
        list.add(input);
        list.add(input1);
        list.add(input2);
        for (int i = 0; i < list.size(); i++){
            if ( list.get(i).name.equals("Nose")){
                System.out.println(list.get(i).toString());

            }
        }
    }
}
