import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


class AutoComplete{




public static void main(String args[]){






Scanner sc = new Scanner(System.in);


String ar[] = {"deer", "defer", "dear", "dog", "parrot"};


System.out.println("What is the starting autocomplete feature?");


String y = sc.next();


List<String> se = Arrays.stream(ar).filter(x -> x.indexOf(y) == 0).collect(Collectors.toList());


se.forEach(System.out::println);




}
}

