// Создать класс Notebook с полями:
        // 1. Стоимость (int)
        // 2. Оперативная память (int)
        // Нагенерить объектов этого класса, создать список и отсортировать его в трех вариантах:
        // 1. По возрастанию цены
        // 2. По убыванию цены
        // 3. По оперативке по убыванию. Если оперативки равны - по убыванию цены.
        // 4.+ придумать свои параметры и отсортировать по ним

package Seminar3;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int notebookValue = 10;
        ArrayList<Notebook> notebooks1 = new ArrayList<>(notebookValue);
        
        fillArray(notebooks1, notebookValue);
        
        printInfo(notebooks1);
        System.out.println("Цена по возрастанию:");
        notebooks1.sort(new PriceUp());
        printInfo(notebooks1); 
        
        System.out.println("Цена по убыванию:");
        notebooks1.sort(new PriceDown());
        printInfo(notebooks1);

        System.out.println("Видеокарта: ");
        notebooks1.sort(new RAM());
        printInfo(notebooks1);

        System.out.println("Видеокарта и Цена: ");
        notebooks1.sort(new RAMandPrice());
        printInfo(notebooks1);
    }

    public static void printInfo(ArrayList<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            notebook.getNotebookInfo();
        };
        System.out.println();
    }

    public static void fillArray(ArrayList<Notebook> notebooks, int maxNotebooks) {
        for (int i = 0; i < maxNotebooks; i++) {
            notebooks.add(new Notebook());
        }
    }
}
