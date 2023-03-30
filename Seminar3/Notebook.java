package Seminar3;

import java.util.concurrent.ThreadLocalRandom;

public class Notebook{
    private static long id;

    private String notebookId;
    private int price;
    private int ram;
    private int[] memory = {256, 512, 1024, 2048, 4096, 8192, 16384};
    
    static {
        id = 1L;
    }

    public Notebook(){
        this.notebookId = "Notebook_" + id++;
        this.price= ThreadLocalRandom.current().nextInt(1000);
        this.ram = memory[ThreadLocalRandom.current().nextInt(7)];
    }

    public int getPrice() {
        return this.price;
    }

    public int getRam() {
        return this.ram;
    }

    public void getNotebookInfo() {
        System.out.println(this.notebookId + ": RAM=" + this.ram + "Mb, Price=" + this.price + "руб.");
    }
}

