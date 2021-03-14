package com.rundef.poker;

import de.roskenet.poker.PokerHand;
import de.roskenet.poker.PokerResponse;
import java.util.ArrayList;

public class Console
{
	public static PokerResponse calculateOdd(String[] args, long maxIterations) throws Exception
	{
		boolean isBoard = false;
		String board = "";
		ArrayList<String> handsStr = new ArrayList<>();
		ArrayList<Hand> hands = new ArrayList<>();

		for (String s: args) {
			if(s.equals("-b")) {
				isBoard = true;
				continue;
			}


			if(isBoard) {
				board = s;
				isBoard = false;
			}
			else {
				handsStr.add(s);
			}
		}

		if(handsStr.size() < 2) {
			throw new Exception("You must enter at least 2 hands");
		}





		EquityCalculator calculator = new EquityCalculator(maxIterations);

		if(!board.isEmpty()) {
			calculator.setBoardFromString(board);
		}
		
		for(int i = 0; i < handsStr.size(); i++) {
			Hand h = Hand.fromString(handsStr.get(i));
			hands.add(h);
			calculator.addHand(h);
		}


		long startTime = System.currentTimeMillis();
		calculator.calculate();
		long elapsedTime = System.currentTimeMillis() - startTime;


		calculator.printBoard();
		System.out.println("");

		var strings = new ArrayList<String>();

		var pokerResponse = new PokerResponse();

		if(!board.isEmpty()) {
			pokerResponse.setBoard(board);
		}
		var handList = new ArrayList<PokerHand>();

		for(int i = 0; i < hands.size(); i++) {
			HandRanking hr = calculator.getHandRanking(i);
			HandEquity he = calculator.getHandEquity(i);

			String preprend = calculator.boardIsEmpty() ? "~" : "";

			strings.add(String.format("Player %d: %s - %s --- %s%s", 1+i, hands.get(i), hr, preprend, he));

//			System.out.println(String.format("Player %d: %s - %s --- %s%s", 1+i, hands.get(i), hr, preprend, he));

			var pokerHand = new PokerHand();
			pokerHand.setHand(hands.get(i).toString());
			pokerHand.setProbability(he.getEquity());
			pokerHand.setRating(hr.toString());
			handList.add(pokerHand);
		}

		pokerResponse.setHands(handList);

		if(calculator.boardIsEmpty()) {
			float elapsedSeconds = elapsedTime / 1000.0f;
			
			System.out.println("");
			System.out.println(String.format("Simulated %d random boards in %.1f seconds", calculator.getMaxIterations(), elapsedSeconds));
//			pokerResponse.getHands().stream().map(h -> h.setAccurate(false));
            pokerResponse.getHands().forEach(h -> h.setAccurate(false));
		}
		return pokerResponse;
	}
}