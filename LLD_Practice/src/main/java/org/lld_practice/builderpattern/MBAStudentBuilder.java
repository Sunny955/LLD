package org.lld_practice.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Management Studies");
        subs.add("Economics");
        subs.add("Accounts");
        this.subjects = subs;
        return this;
    }
}
