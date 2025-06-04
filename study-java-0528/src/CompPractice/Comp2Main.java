package CompPractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Comp2Main {
    public static void main(String[] args) {
        Comparator<Comp2Car> comp = new Comparator<Comp2Car>() {
            @Override
            public int compare(Comp2Car o1, Comp2Car o2) {
                if (o1.year != o2.year)
                    return Integer.compare(o1.year,o2.year);
                if (!o1.name.equals(o2.name))
                    return o1.name.compareTo(o2.name);
                return Integer.compare(o1.price, o2.price);
            }
        };

        TreeSet<Comp2Car> set = new TreeSet<>(comp);

        set.add(new Comp2Car(1999, "소나타", 2000));
        set.add(new Comp2Car(1988, "프라이드", 700));
        set.add(new Comp2Car(2001, "그랜저", 2800));
        set.add(new Comp2Car(2012, "싼타페", 3500));
        set.add(new Comp2Car(2022, "GV80", 7000));
        set.add(new Comp2Car(1999, "GV80", 9000));

        Iterator<Comp2Car> iterator = set.iterator();
        while(iterator.hasNext()) {
            Comp2Car car = iterator.next();
            System.out.println(car.year + " " + car.name + " " + car.price);
        }
    }
}
