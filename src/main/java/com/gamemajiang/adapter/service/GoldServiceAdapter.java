package com.gamemajiang.adapter.service;

import com.gamemajiang.domain.process.result.CreatePlayerGoldAccountResult;
import com.gamemajiang.domain.process.result.DepositResult;
import com.gamemajiang.domain.process.service.GoldService;
import com.gamemajiang.domain.process.service.impl.GoldServiceImpl;

public class GoldServiceAdapter implements GoldService {

	private GoldServiceImpl goldServiceImpl;

	@Override
	public CreatePlayerGoldAccountResult createPlayerGoldAccount(String playerId) {
		CreatePlayerGoldAccountResult createPlayerGoldAccountResult = goldServiceImpl.createPlayerGoldAccount(playerId);
		updateForQuery(createPlayerGoldAccountResult);
		return createPlayerGoldAccountResult;
	}

	@Override
	public DepositResult deposit(String playerId, int gold) {
		DepositResult depositResult = goldServiceImpl.deposit(playerId, gold);
		updateForQuery(depositResult);
		return depositResult;
	}

	private void updateForQuery(CreatePlayerGoldAccountResult createPlayerGoldAccountResult) {
		// TODO Auto-generated method stub
	}

	private void updateForQuery(DepositResult depositResult) {
		// TODO Auto-generated method stub
	}

}
