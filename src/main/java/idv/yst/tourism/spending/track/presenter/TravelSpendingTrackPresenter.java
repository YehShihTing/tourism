package idv.yst.tourism.spending.track.presenter;

import java.util.List;

import idv.yst.tourism.spending.track.entity.AccountBook;

public interface TravelSpendingTrackPresenter {
	public void listAllAccountBooks(List<AccountBook> accountBooks);

	public void updateAccountBookResult(Boolean result);

	public void displayNewAccountBook(AccountBook accountBook);
}
