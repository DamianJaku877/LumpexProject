package pl.aszul.Task2Page14;

import java.util.*;

public class PeriodsStatistics {
    private Map<Integer, SomePeriodOfTime> periods = new HashMap<>();

    public void addPeriod(int indexOfPeriod, int avgTemperature){
        if (periods.containsKey(indexOfPeriod)){
            periods.replace(indexOfPeriod, periods.get(indexOfPeriod).add(avgTemperature));
        } else {
            periods.put(indexOfPeriod, new SomePeriodOfTime());
        }
    }

    public List<Map.Entry<Integer, Integer>> getSortedSummaryList(){
        List<Map.Entry<Integer, Integer>> summaryList = new LinkedList<>();
        for (Map.Entry<Integer, SomePeriodOfTime> entry : periods.entrySet())
            summaryList.add(new AbstractMap.SimpleImmutableEntry<>(entry.getKey(), entry.getValue().avgTemperature()));

        Collections.sort(summaryList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        return summaryList;
    }

    public String getSummary(String periodName){
        List<Map.Entry<Integer, Integer>> sortedSummaryList = getSortedSummaryList();
        return "warmest " + periodName + " : " + sortedSummaryList.get(0).getKey() +
                " [" + sortedSummaryList.get(0).getValue() + "°C], and coldest " +
                periodName + " : " + sortedSummaryList.get(sortedSummaryList.size() - 1).getKey() +
                " [" + sortedSummaryList.get(sortedSummaryList.size() - 1).getValue() + "°C]";
    }
}