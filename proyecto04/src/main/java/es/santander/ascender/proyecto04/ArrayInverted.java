package es.santander.ascender.proyecto04;

public class ArrayInverted {
    public int
        int [] numbers = new int[]

        for (int i = 0; i < array.length; i++);{
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
            System.out.println(tmp);
        }

    }
}