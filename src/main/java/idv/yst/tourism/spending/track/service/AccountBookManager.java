package idv.yst.tourism.spending.track.service;

import java.util.List;

import com.google.common.base.Strings;

import idv.yst.tourism.spending.track.entity.AccountBook;
import idv.yst.tourism.spending.track.gateway.persistence.AccountBookDataAccessor;

public class AccountBookManager {
	AccountBookDataAccessor accountBookDataAccessor;
	private List<AccountBook> accountBooks;

	public AccountBookManager() {}

	public AccountBook createAccountBook() {
		return createAccountBook("newAccountBook", "");
	}

	public AccountBook createAccountBook(String name, String description) {
		AccountBook accountBook = new AccountBook();
		if (!Strings.isNullOrEmpty(name)) {
			accountBook.setName(name);
		}
		if (!Strings.isNullOrEmpty(description)) {
			accountBook.setDescription(description);
		}
		accountBookDataAccessor.createAccountBook(accountBook);
		return accountBook;
	}

	public List<AccountBook> getAllAccountBooks() {
		return getAllAccountBooks(false);
	}

	public List<AccountBook> getAllAccountBooks(boolean reload) {
		if (accountBooks == null || reload) {
			accountBooks = accountBookDataAccessor.getAllAccountBooks();
		}
		return accountBooks;
	}

	public AccountBook getAccountBookByName(String accountBookName) {
		for (AccountBook accountBook : getAllAccountBooks()) {
			if (accountBook.getName().equalsIgnoreCase(accountBookName)) {
				return accountBook;
			}
		}
		return null;
	}

	public boolean updateAccountBook(AccountBook accountBook) {
		return accountBookDataAccessor.updateAccountBook(accountBook);
	}

	public boolean deleteAccountBook(AccountBook accountBook) {
		return accountBookDataAccessor.deleteAccountBook(accountBook);
	}
}
