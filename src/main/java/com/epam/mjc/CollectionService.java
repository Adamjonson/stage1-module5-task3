package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> myList;
        myList = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        return myList;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        //throw new UnsupportedOperationException("You should implement this method.");
        List<String> myList = new ArrayList<>();
        myList = list.stream().map(value -> value.toUpperCase()).collect(Collectors.toList());
        return myList;
    }

    public Optional<Integer> findMax(List<Integer> list) {
        //throw new UnsupportedOperationException("You should implement this method.");

        Optional<Integer> max = list.stream().max(Integer::compare);
        return max;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        //throw new UnsupportedOperationException("You should implement this method.");
        //Optional<Integer> min = list.stream().min(Integer::compare);
        Optional<Integer> minOptional = null;
        Integer minNum = null;
        for (List<Integer> lint : list){
            Optional<Integer> myMin = lint.stream().min(Integer::compare);
            Integer myIntegerMin = Integer.valueOf(myMin.get());
            if (minNum == null || myIntegerMin.intValue() < minNum.intValue()){
                minOptional = myMin;
                minNum = myIntegerMin;
            }
            //minNum = Integer.valueOf(myMin.get());
        }
        return minOptional;
    }

    public Integer sum(List<Integer> list) {
        Integer sum = list.stream().reduce(0, (a, b) -> a+b);
        return sum;
    }
}
