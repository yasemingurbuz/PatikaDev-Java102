package ListClass;

public class MyList <T>{

    private int capacity;
    T[] list;
    T[] listcopy;
    //If the empty constructor is used, the initial size of the array should be 10.
    public MyList(){
        super();
        this.capacity = 10;
        this.list = (T[]) new Object[this.capacity];
        this.listcopy = (T[]) new Object[this.capacity];
    }
    //The initial value of the array should be taken from the capacity parameter.
    public MyList(int capacity){
        this.capacity = capacity;
        this.list = (T[]) new Object[this.capacity];
        this.listcopy = (T[]) new Object[this.capacity];
    }
    // Returns the number of elements in the array.
    public int size() {
        int size=0;
        for(Object l : list) {
            if(l != null) {
                size++;
            }
        }
        return size;
    }
    //returns the capacity of the array.
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int count = 0;
    //It should be used to add an element to the array of the class.
    // If there is not enough space in the array,
    // the array size should be doubled.
    public boolean add(T data) {
        int i =0,j=0,k=this.capacity;
        if(count == this.capacity) {
            this.capacity *=2;
            while(true) {
                listcopy[i] = list[i];
                i++;
                if(i == k) {
                    break;
                }
            }
            this.list = (T[]) new Object[this.capacity];
            while(true) {
                list[j] = listcopy[j];
                j++;
                if(j == k) {
                    break;
                }
            }
            this.listcopy = (T[]) new Object[this.capacity];
        }
        add(data,count);
        count++;
        return true;
    }

    private void add(T data,int count) {
        list[count] = data;
    }
    //Returns the value at the given index.
    // Returns null if invalid index is entered.
    public T get(int value) {
        int size = size();
        T i = list[value];
        if(value<0 || value >=size) {
            return null;
        }
        return i;

    }
    //should delete the data in the given index
    // and shift the data after the deleted index to the left.
    // Returns null if invalid index is entered.
    public void remove(int value) {
        int size = size();

        for(int i = value ; i<size;i++) {
            list[value] = list[value+1];
        }
        count--;
    }
    //should replace the data in the given index with a new one.
    // Returns null if invalid index is entered.
    public void set(int index,T value) {
        list[index] = value;
    }
    //A method that lists the elements in the array of the class.
    public String toString() {
        int size = size();
        String str = "";
        str+="[";
        for(int  i = 0 ; i <size ; i++) {
            if(list[i] != null) {
                if(list[i+1] == null) {
                    str = str+list[i];
                }else {
                    str = str+list[i]+",";
                }
            }
        }
        str+="]";
        return str;
    }
    //Indicates whether the list is empty.
    public boolean isEmpty() {
        int size = size();
        if(size == 0) {
            return true;
        }
        return false;
    }
    //Returns the index of the object given in the parameter in the list.
    // Returns -1 if the object is not in the list.
    public int indexOf(Object value) {
        int size = size();
        for(int i = 0 ; i<size ; i++) {
            if(list[i] == value) {
                return i;
            }
        }
        return -1;
    }
    //It tells the last index of the specified item in the list.
    // Returns -1 if the object is not in the list.
    public int lastIndexOf(Object value) {
        int size = size();
        for(int i = size ; i>=0 ; i--) {
            if(list[i] == value) {
                return i;
            }
        }
        return -1;
    }
    //Converts the items in the list into an array in the same order.
    public T[] toArray() {
        int size = size();
        T[] dizi = (T[]) new Object[size];
        for(int i = 0 ; i<size ; i++) {
            dizi[i] = list[i];
        }
        return dizi;
    }
    //Returns a list of the index range given in the parameter.
    public MyList<T> subList(int start,int finish) {
        MyList<T> liste = new MyList<T>();

        for(int i = start , j=0; i<=finish;i++,j++) {

            liste.add((T) list[i]);
        }
        return liste;
    }
    //It tells whether the value given in the parameter is in the array.
    public boolean contains(T value) {
        for(int i = 0 ; i<size();i++) {
            if(list[i] == value) {
                return true;
            }
        }
        return false;
    }
    //Deletes all items in the list, making it an empty list.
    public void clear() {
        this.list = (T[]) new Object[0];

        for(int i = 0 ; i<size();i++) {
            System.out.print(list[i]);
        }
    }
}
