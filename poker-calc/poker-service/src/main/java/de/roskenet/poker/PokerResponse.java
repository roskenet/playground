package de.roskenet.poker;

import java.util.List;

public class PokerResponse {

    private String board;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public List<PokerHand> getHands() {
        return hands;
    }

    public void setHands(List<PokerHand> hands) {
        this.hands = hands;
    }

    private List<PokerHand> hands;
}
