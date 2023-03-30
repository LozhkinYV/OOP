package Seminar3;

import java.util.Comparator;

public class RAMandPrice implements Comparator<Notebook> {

    @Override
    public int compare(Notebook num1, Notebook num2) {
        int r = num2.getRam() - num1.getRam();

        if (r == 0) {
            return num1.getPrice() - num2.getPrice();
        }

        return r;
    }
    
}

