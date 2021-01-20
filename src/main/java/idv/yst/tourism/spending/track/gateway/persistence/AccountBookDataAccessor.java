package idv.yst.tourism.spending.track.gateway.persistence;

import java.util.List;

import idv.yst.tourism.spending.track.entity.AccountBook;

public interface AccountBookDataAccessor {

	public boolean createAccountBook(AccountBook accountBook);

	public List<AccountBook> getAllAccountBooks();

	public boolean updateAccountBook(AccountBook accountBook);

	public boolean deleteAccountBook(AccountBook accountBook);

}
