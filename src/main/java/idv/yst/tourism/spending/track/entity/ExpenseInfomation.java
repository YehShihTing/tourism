package idv.yst.tourism.spending.track.entity;

import java.util.Date;

public class ExpenseInfomation {
	private Date date;
	private String location;
	private String ledger;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLedger() {
		return ledger;
	}

	public void setLedger(String ledger) {
		this.ledger = ledger;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
