package Seminar4;

import java.util.ArrayList;
import java.util.Iterator;

public class Box<T extends Fruit> implements Iterable<T> {
    private int mass = 0;
    private ArrayList<T> box;

    public Box () {
        this.box = new ArrayList<>();
    }

    public void add(T fruit) {
        box.add(fruit);
        mass += fruit.getWeight();
    }

    public int getWeight() {
        return this.mass;
    }

    public void moveTo(Box<? super T> target) {
        int i = 0;
        while (i < this.box.size()) {
            target.add(this.box.get(i));
            this.mass -= this.box.get(i).getWeight();
            this.box.remove(i);

            if (i > 0) {
                i--;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return box.iterator();
    }
}

