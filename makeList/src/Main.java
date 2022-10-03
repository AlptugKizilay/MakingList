import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Number of elements of the array: " + list.size());
        System.out.println("The capacity of the array: " + list.getCapacity());
        System.out.println("------------------");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.print();
        System.out.println("Number of elements of the array: " + list.size());
        System.out.println("The capacity of the array: " + list.getCapacity());
        System.out.println("------------------");
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        System.out.println("Number of elements of the array: " + list.size());
        System.out.println("The capacity of the array: " + list.getCapacity());
        System.out.println("-----------------");
        list.clear();

        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        System.out.print("2. Index : ");
        list.get(2);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.set(4, 500);
        list.remove(2);
        list.print();
        System.out.print("2. Index : ");
        list.get(2);

        list.clear();

        list.print();
        System.out.println("----------------");
        System.out.println("List situation: " + (list.isEmpty() ? "Empty" : "Full"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        System.out.println("List situation: " + (list.isEmpty() ? "Empty" : "Full"));


        System.out.println("First index of 20 : " + list.indexOf(20));
        System.out.println("First index of 100 :" + list.indexOf(100));
        System.out.println("Last index of 20 :" + list.lastIndexOf(20));

        System.out.println("-------------");
        Object[] copy = list.makeCopy();
        System.out.println(Arrays.toString(copy));
        System.out.println("First element of Object array :" + copy[0]);



        Object[] sub = list.sublist(0, 5);
        System.out.println("Sub array of object array: \n" + Arrays.toString(sub));
        System.out.println("My list contains 40: " + list.isContain(40));
        System.out.println("My list contains 700: " + list.isContain(700));


    }
}
