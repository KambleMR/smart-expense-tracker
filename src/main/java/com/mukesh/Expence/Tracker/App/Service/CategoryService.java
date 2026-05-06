package com.mukesh.Expence.Tracker.App.Service;

import java.util.List;
import java.util.Map;

import com.mukesh.Expence.Tracker.App.Model.Expence;
import com.mukesh.Expence.Tracker.App.Model.User;

public interface CategoryService {

    /**
     * Returns the total expense amount for each category for a given user.
     * Example: { "Food" -> 2500.0, "Transport" -> 1500.0 }
     */
    Map<String, Double> getCategoryTotals(User user);

    /**
     * Returns a map where key = category name and value = list of expenses in that category.
     * Example: { "Food" -> [Expence1, Expence2], "Transport" -> [Expence3] }
     */
    Map<String, List<Expence>> getExpensesGroupedByCategory(User user);
}
