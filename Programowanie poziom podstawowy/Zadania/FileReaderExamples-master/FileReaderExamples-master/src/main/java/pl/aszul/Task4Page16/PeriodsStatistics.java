package pl.aszul.Task4Page16;

import java.time.LocalDate;
import java.util.*;

public class PeriodsStatistics {
    private Map<LocalDate, Integer> periods = new HashMap<>();
    private List<Map.Entry<LocalDate, Integer>> summaryListSortedByValue;
    private List<Map.Entry<LocalDate, Integer>> summaryListChronologically;

    public void addPeriod(LocalDate period, int passengers){
        if (periods.containsKey(period)){
            periods.replace(period, periods.get(period) + passengers);
        } else {
            periods.put(period, passengers);
        }
        summaryListSortedByValue = null;
        summaryListChronologically = null;
    }

    public void prepareSummary(){
        summaryListSortedByValue = new LinkedList<>();
        summaryListChronologically = new LinkedList<>();
        for (Map.Entry<LocalDate, Integer> entry : periods.entrySet()) {
            summaryListSortedByValue.add(new AbstractMap.SimpleImmutableEntry<>(entry.getKey(), entry.getValue()));
            summaryListChronologically.add(new AbstractMap.SimpleImmutableEntry<>(entry.getKey(), entry.getValue()));
        }

        Collections.sort(summaryListSortedByValue, new Comparator<Map.Entry<LocalDate, Integer>>() {
            public int compare(Map.Entry<LocalDate, Integer> o1, Map.Entry<LocalDate, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Collections.sort(summaryListChronologically, new Comparator<Map.Entry<LocalDate, Integer>>() {
            public int compare(Map.Entry<LocalDate, Integer> o1, Map.Entry<LocalDate, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
    }
    public Map.Entry<LocalDate, Integer> getMin(){
        if (summaryListSortedByValue == null)
            prepareSummary();
        return new AbstractMap.SimpleImmutableEntry<>(summaryListSortedByValue.get(0).getKey(),
                summaryListSortedByValue.get(0).getValue());
    }
    public Map.Entry<LocalDate, Integer> getMax(){
        if (summaryListSortedByValue == null)
            prepareSummary();
        return new AbstractMap.SimpleImmutableEntry<>(summaryListSortedByValue.get(summaryListSortedByValue.size() - 1).getKey(),
                summaryListSortedByValue.get(summaryListSortedByValue.size() - 1).getValue());
    }
    public  List<Map.Entry<LocalDate, Integer>> getSummarySortedByValue(){
        if (summaryListSortedByValue == null)
            prepareSummary();
        return summaryListSortedByValue;
    }
    public  List<Map.Entry<LocalDate, Integer>> getSummaryChronologically(){
        if (summaryListSortedByValue == null)
            prepareSummary();
        return summaryListChronologically;
    }
}