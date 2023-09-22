package org.example._2023_09_22.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant participant) {
        participantList.add(participant);
        System.out.println("Participant [" + participant + "] was added to the team [" + name + "]");
    }

    public void playWith(Team team) {
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