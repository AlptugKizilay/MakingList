import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int capacity = 10;
    private T[] tempArray;

    public MyList() {
        this.array = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    public int size() {
        int numberEle = 0;
        for (int i = 0; i < this.capacity; i++) {
            if (array[i] != null) {
                numberEle++;
            }
        }
        return numberEle;
    }

    public void add(T data) {
        if (size() >= getCapacity()) {
            setCapacity(getCapacity() * 2);
            this.tempArray = array;
            this.array = (T[]) new Object[this.capacity];
            this.array = Arrays.copyOf(tempArray, getCapacity());
        }

        for (int i = 0; i < getCapacity(); i++) {
            if (array[i] == null) {
                array[i] = data;
                break;
            }
        }
    }

    public void get(int index) {
        if (index < getCapacity() && index >= 0) {
            System.out.println(this.array[index]);
        } else {
            T a = null;
            System.out.println(a);
        }
    }

    public void remove(int index) {
        for (int i = index; i < getCapacity(); i++) {
            if (i == getCapacity() - 1) {
                this.array[i] = null;
                break;
            } else {
                this.array[i] = this.array[i + 1];
            }
        }
    }

    public void set(int index, T data) {
        if (index < getCapacity() && index >= 0) {
            this.array[index] = data;
        } else {
            T a = null;
            System.out.println(a);
        }
    }

    public void print() {
        System.out.println(Arrays.toString(this.array));

    }

    public int indexOf(T data) {
        for (int i = 0; i < getCapacity(); i++) {
            if (this.array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = getCapacity() - 1; i >= 0; i--) {
            if (this.array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        for (int i = 0; i < getCapacity(); i++) {
            if (this.array[i] != null) {
                return false;
            }
        }
        return true;
    }

    public Object[] makeCopy() {
        Object[] copy = Arrays.copyOf(this.array, getCapacity());

        return copy;

    }
    public void clear(){

        setCapacity(10);
        this.array = (T[]) new Object[this.capacity];

    }
    public Object[] sublist(int start, int finish){
        Object[] sub = Arrays.copyOfRange(this.array,start,finish);
        return sub;
    }
    public boolean isContain(T data){
        for(int i=0; i<getCapacity(); i++) {
            if(this.array[i] == data){
                return true;
            }
        }
        return false;
    }


    public void show() {
        for (T i : array)
            System.out.println(i);
    }

    public T[] getTempArray() {
        return tempArray;
    }

    public void setTempArray(T[] tempArray) {
        this.tempArray = tempArray;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
