package ListClass;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in Array  : " + list.size());
        System.out.println("Array Capacity  : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of Elements in Array : " + list.size());
        System.out.println("Array Capacity : " + list.getCapacity());
        System.out.println("----------------------------------------");

        System.out.println("Indeks : " + list.indexOf(40));
        System.out.println("Indeks :" + list.indexOf(100));
        System.out.println("Indeks : " + list.lastIndexOf(100));

        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("----------------------------------------");
        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in Array : " + list.size());
        System.out.println("Array Capacity : " + list.getCapacity());
        System.out.println("----------------------------------------");

        System.out.println("Value at index 2 : " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("New value at index 2 : " + list.get(2));

        System.out.println(list.toString());
        Object[] dizi = list.toArray();
        System.out.println("First element of Object array :" + dizi[3]);

        System.out.println("----------------------------------------");
        MyList<Integer> altMyList = list.subList(0, 3);
        System.out.println(altMyList.toString());

        System.out.println("----------------------------------------");

        System.out.println("Value 20 in my list: " + list.contains(20));
        System.out.println("Value 120 in my list : " + list.contains(120));
        System.out.println("----------------------------------------");

        list.clear();
        System.out.println(list.toString());

    }
}
