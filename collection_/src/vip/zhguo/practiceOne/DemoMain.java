package vip.zhguo.practiceOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        Dog a = new Dog("a", 12);
        Dog b = new Dog("b", 15);
        Dog c = new Dog("c", 18);
        List dogList = new ArrayList();
        dogList.add(a);
        dogList.add(b);
        dogList.add(c);
        for (Object o : dogList) {
            System.out.println(o);
        }

        Iterator iterator = dogList.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
}
