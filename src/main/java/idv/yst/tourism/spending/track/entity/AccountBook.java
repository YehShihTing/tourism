package idv.yst.tourism.spending.track.entity;

import java.util.List;

import com.google.common.collect.Lists;

public class AccountBook {
	private String name;
	private String description;
	private List<Expense> expenses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Expense> getExpenses() {
		if (expenses == null) {
			expenses = Lists.newLinkedList();
		}
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
}
