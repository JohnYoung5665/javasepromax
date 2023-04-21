import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("马斯克");
        list1.add("张旭");
        list1.add("雷军");
        list1.add("张三丰");

        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length() == 3).forEach(name-> System.out.println(name));

        /*ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            String str = Character.toString(list1.get(i).charAt(0));

            if (str.equals("张") && list1.get(i).length() == 3){
                list2.add(list1.get(i));
            }
        }*/

    }
}