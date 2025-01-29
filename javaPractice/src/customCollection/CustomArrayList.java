package customCollection;

import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {
    @Override
    public boolean add(T t) {
        if (this.contains(t))
            return Boolean.TRUE;
        else
            return super.add(t);
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(10);
        customArrayList.add(20);
        customArrayList.add(30);
        customArrayList.add(20);

        System.out.println(customArrayList);

        customArrayList.remove(Integer.valueOf(30));
        System.out.println(customArrayList);
        System.out.println("Size : " + customArrayList.size());
    }
}
