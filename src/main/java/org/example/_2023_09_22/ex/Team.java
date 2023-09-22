package org.example._2023_09_22.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, List<T> participantList) {
        this.name = name;
        this.participantList = participantList;
    }

    public void addNewParticipant(Participant participant) {
        participantList.add((T) participant);
        System.out.println("Participant [" + participant + "] was added to the team [" + name + "]");
    }

    //team.playWith(team2);
    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();

        int i = random.nextInt(2);
        if(i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
    }
}