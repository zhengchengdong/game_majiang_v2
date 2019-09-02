package com.gamemajiang.adapter.service;

import com.gamemajiang.domain.process.result.CreateGameResult;
import com.gamemajiang.domain.process.result.FinishGameResult;
import com.gamemajiang.domain.process.result.JoinGameResult;
import com.gamemajiang.domain.process.result.ReadyForGameResult;
import com.gamemajiang.domain.process.service.GameService;
import com.gamemajiang.domain.process.service.impl.GameServiceImpl;

public class GameServiceAdapter implements GameService {

	private GameServiceImpl gameServiceImpl;

	@Override
	public CreateGameResult createGame(String creatorPlayerId, String gameId) {
		CreateGameResult createGameResult = gameServiceImpl.createGame(creatorPlayerId, gameId);
		updateForQuery(createGameResult);
		return createGameResult;
	}

	@Override
	public JoinGameResult joinGame(String playerId, String gameId) {
		JoinGameResult joinGameResult = gameServiceImpl.joinGame(playerId, gameId);
		updateForQuery(joinGameResult);
		return joinGameResult;
	}

	@Override
	public ReadyForGameResult readyForGame(String playerId, String gameId) {
		ReadyForGameResult readyForGameResult = gameServiceImpl.readyForGame(playerId, gameId);
		updateForQuery(readyForGameResult);
		return readyForGameResult;
	}

	@Override
	public FinishGameResult finishGame(String gameId) {
		FinishGameResult finishGameResult = gameServiceImpl.finishGame(gameId);
		updateForQuery(finishGameResult);
		return finishGameResult;
	}

	private void updateForQuery(CreateGameResult createGameResult) {
		// TODO Auto-generated method stub
	}

	private void updateForQuery(JoinGameResult joinGameResult) {
		// TODO Auto-generated method stub
	}

	private void updateForQuery(ReadyForGameResult readyForGameResult) {
		// TODO Auto-generated method stub
	}

	private void updateForQuery(FinishGameResult finishGameResult) {
		// TODO Auto-generated method stub
	}

}
