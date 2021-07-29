package PatikaStore;

import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    public Brand(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public static TreeSet<Brand> brands() {
        TreeSet<Brand> brands = new TreeSet<Brand>();
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));

        return brands;

    }
    public static String brand(int id) {
        for(Brand brand : brands()) {
            if(brand.getId() == id) {
                return brand.getName();
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand brand) {
        return this.getName().compareTo(brand.getName());
    }

}

