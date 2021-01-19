package idv.yst.tourism.entity;

import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;

import idv.yst.tourism.spending.track.entity.AccountBook;

public class Trip {
	private String name;
	private String description;
	private Date startDate;
	private Date endDate;
	private List<AccountBook> accountBooks;
	private List<Traveler> travelers;

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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<AccountBook> getAccountBooks() {
		if (accountBooks == null) {
			accountBooks = Lists.newLinkedList();
		}
		return accountBooks;
	}

	public void setAccountBooks(List<AccountBook> accountBooks) {
		this.accountBooks = accountBooks;
	}

	public void addAccountBook(AccountBook accountBook) {
		getAccountBooks().add(accountBook);
	}

	public List<Traveler> getTravelers() {
		if (travelers == null) {
			travelers = Lists.newLinkedList();
		}
		return travelers;
	}

	public void setTravelers(List<Traveler> travelers) {
		this.travelers = travelers;
	}

	public void addTravelers(Traveler traveler) {
		getTravelers().add(traveler);
	}

}
