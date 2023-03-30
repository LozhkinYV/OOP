package Seminar3;

import java.util.Comparator;

public class PriceDown implements Comparator<Notebook> {

    @Override
    public int compare(Notebook num1, Notebook num2) {
        return num2.getPrice() - num1.getPrice();
    }
    
}

