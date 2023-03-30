package Seminar3;

import java.util.Comparator;

public class RAM implements Comparator<Notebook> {

    @Override
    public int compare(Notebook num1, Notebook num2) {
        return num1.getRam() - num2.getRam();
    }
    
}
