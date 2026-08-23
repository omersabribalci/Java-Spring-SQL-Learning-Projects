package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class WorkintechList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (!(this.contains(o))) {
            return super.add(o);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this);

    }

    @Override
    public boolean remove(Object o) {
        sort();
        return super.remove(o);
    }


}
