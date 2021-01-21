package idv.yst.tourism.spending.track.controller;

import idv.yst.tourism.spending.track.entity.AccountBook;
import idv.yst.tourism.spending.track.presenter.TravelSpendingTrackPresenter;
import idv.yst.tourism.spending.track.service.AccountBookManager;

public class TravelSpendingTrackController {
	private AccountBookManager accountBookManager;
	private TravelSpendingTrackPresenter travelSpendingTrackPresenter;

	public TravelSpendingTrackController(TravelSpendingTrackPresenter travelSpendingTrackPresenter) {
		this.travelSpendingTrackPresenter = travelSpendingTrackPresenter;
		accountBookManager = new AccountBookManager();
	}

	public void getAllAccountBooks() {
		travelSpendingTrackPresenter.listAllAccountBooks(accountBookManager.getAllAccountBooks());
	}

	public void createNewAccountBook(String name, String description) {
		travelSpendingTrackPresenter.displayNewAccountBook(accountBookManager.createAccountBook(name, description));
	}

	public void saveAccountBook(AccountBook accountBook) {
		travelSpendingTrackPresenter.updateAccountBookResult(accountBookManager.updateAccountBook(accountBook));
	}
}
