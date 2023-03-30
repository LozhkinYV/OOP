package Seminar3;

import java.util.Comparator;

public class PriceUp implements Comparator<Notebook>{

    @Override
    public int compare(Notebook num1, Notebook num2) {
        return num1.getPrice() - num2.getPrice();
    }
}
