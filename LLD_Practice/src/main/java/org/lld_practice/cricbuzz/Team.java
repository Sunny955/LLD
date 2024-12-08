package org.lld_practice.cricbuzz;
import java.util.List;
import java.util.Queue;
public class Team {
    String teamName;
    Queue<Player> players;
    List<Player> bench;

    // who is next batsmen
    PlayerBattingController battingController;

    // who is next bowler
    PlayerBowlingController bowlingController;
}
