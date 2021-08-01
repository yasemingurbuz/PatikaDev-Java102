package RaceofThreads;
import java.util.ArrayList;
import java.util.List;

class NumberList implements Runnable{

   ArrayList<Integer> evenNumberList  = new ArrayList<Integer>();
    ArrayList<Integer> oddNumberList  = new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int id;

    public NumberList(ArrayList<Integer>arraylist) {
        super();
        this.id=0;
        this.list = arraylist;
    }

    @Override
    public void run() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Thread.currentThread().getName() + "  " + list.get(i));
            if (i % 2 == 0) {
                {
                    evenNumberList.add(id);
                }
            } else {
                oddNumberList.add(id);

            }
        }
    }
}