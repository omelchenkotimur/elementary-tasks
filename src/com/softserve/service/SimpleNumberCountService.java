package com.softserve.service;

import com.softserve.util.Util;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumberCountService {
    public ArrayList simpleNumberCountWhichSquareLessThenInput(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i * i < number; i++) {
            if (Util.checkSimple(i))
                list.add(i);
        }
        return (ArrayList) list;
    }
}
