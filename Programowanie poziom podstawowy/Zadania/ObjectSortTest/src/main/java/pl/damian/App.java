package pl.damian;

import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<Integer> intValues = Arrays.asList(4,5,6,2);
        List<String> stringsValues = Arrays.asList("Jan", "Anna", "Damian");

        BubbleSort<Integer> integerBubbleSort = new IntBubbleSort();
        System.out.println(integerBubbleSort.sort(intValues));


        BubbleSort<String> stringBubbleSort = new StringBubbleSort();
        System.out.println(stringBubbleSort.sort(stringsValues));

    }
}
