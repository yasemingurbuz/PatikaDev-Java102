package RaceofThreads;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist4 = new ArrayList<Integer>();
        for (int i = 1; i <= 10000; i++) {
            arraylist.add(i);
        }
        for (int i = 1; i <= 10000; i++) {
            if (i <= 2500) {
                arraylist1.add(i);
            } else if (i <= 5000) {
                arraylist2.add(i);
            } else if (i <= 7500) {
                arraylist3.add(i);
            } else {
                arraylist4.add(i);
            }
        }
        NumberList list1 = new NumberList(arraylist1);
        NumberList list2 = new NumberList(arraylist2);
        NumberList list3 = new NumberList(arraylist3);
        NumberList list4 = new NumberList(arraylist4);

        Thread t1 = new Thread(list1);
        Thread t2 = new Thread(list2);
        Thread t3 = new Thread(list3);
        Thread t4 = new Thread(list4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }}
