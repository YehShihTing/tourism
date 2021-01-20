package idv.yst.tourism.spending.track.service;

import java.util.List;

import idv.yst.tourism.spending.track.entity.AccountBook;
import idv.yst.tourism.spending.track.gateway.persistence.AccountBookDataAccessor;

public class AccountBookManager {
	AccountBookDataAccessor accountBookDataAccessor;

	public boolean createAccountBook(AccountBook accountBook) {
		return accountBookDataAccessor.createAccountBook(accountBook);
	}

	public List<AccountBook> getAllAccountBooks() {
		return accountBookDataAccessor.getAllAccountBooks();
	}

	public boolean updateAccountBook(AccountBook accountBook) {
		return accountBookDataAccessor.updateAccountBook(accountBook);
	}

	public boolean deleteAccountBook(AccountBook accountBook) {
		return accountBookDataAccessor.deleteAccountBook(accountBook);
	}
}
