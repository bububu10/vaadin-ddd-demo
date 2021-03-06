package com.example.demo.domain.model.user.summary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class UserSummaries {
    List<UserSummary> values;

    public UserSummaries(Set<UserSummary> values) {
        this.values = new ArrayList<>(values);
    }

    public UserSummaries(List<UserSummary> values) {
        this.values = values;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public boolean isSingle() {
        return values.size() == 1;
    }

    public boolean isMultiple() {
        return values.size() > 1;
    }

    public boolean hasDeletedSummary() {
        long deletedSummaryCount = values.stream()
                .filter(UserSummary::isDeleted)
                .count();
        return deletedSummaryCount != 0;
    }

    public void forEach(Consumer<UserSummary> consumer) {
        values.forEach(consumer);
    }

    public List<UserSummary> asList() {
        return Collections.unmodifiableList(values);
    }
}
