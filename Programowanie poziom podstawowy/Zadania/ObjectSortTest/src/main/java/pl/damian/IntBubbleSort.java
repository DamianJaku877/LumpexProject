package pl.damian;

import java.util.List;

public class IntBubbleSort implements BubbleSort<Integer>{

    public List<Integer> sort(List <Integer> values){

            int range = values.size();
            int tempNumber;
            do {
                for (int i=0; i<range -1 ; i++) {
                    if (values.get(i) > values.get(i + 1)) {
                        tempNumber = values.get(i);
                        values.set(i, values.get(i + 1));
                        values.set(i + 1, tempNumber);
                    }
                }
                range--;
            } while (range > 1);
            return values;
        }
    }