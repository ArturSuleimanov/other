package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("OK");
        list.add("poka");
        list = list.stream().map(el -> String.valueOf(el.length())).collect(Collectors.toList());
        System.out.println(list);

    }
}
