package idv.yst.tourism.spending.track.entity;

import java.util.List;

public class Expense {
	private ExpenseInfomation info;
	private String title;
	private double amount;
	private String remark;
	private List<ExpenseShared> shared;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<ExpenseShared> getShared() {
		return shared;
	}

	public void setShared(List<ExpenseShared> shared) {
		this.shared = shared;
	}

	public ExpenseInfomation getInfo() {
		return info;
	}

	public void setInfo(ExpenseInfomation info) {
		this.info = info;
	}
}
