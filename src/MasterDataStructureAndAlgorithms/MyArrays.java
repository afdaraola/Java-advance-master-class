package MasterDataStructureAndAlgorithms;

import java.util.Arrays;
import java.util.Objects;

public class MyArrays {

    private Object[] data;
    private int Capacity;
    private int length;

    public MyArrays() {
        Capacity = 1;
        length = 0;
        data = new Object[1];
    }

    public Object get(int index) {
        return data[index];
    }

    public void push(Object obj) {
        if (Capacity == length) {

            data = Arrays.copyOf(data, Capacity + 1);
            Capacity += 2;
        }

        data[length] = obj;
        length++;
    }


    public Object Pop() {

        Object popped = data[length - 1];
        data[length - 1] = null;
        length--;

        return popped;
    }

    public Object delete(int index) {
        Object deletedItem = data[index];
        shiftItem(index);

        return deletedItem;
    }

    public void shiftItem(int index) {
        for (int i = index; i < length; i++) {
            data[i] = data[i + 1];
        }
        data[length - 1] = null;
        length--;
    }


    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();

        myArrays.push("Hello");
        myArrays.push("World");

        for (int i = 0; i < myArrays.length; i++) {
            System.out.println(myArrays.get(i));
        }

    }

}
