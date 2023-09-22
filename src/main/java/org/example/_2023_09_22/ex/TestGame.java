package org.example._2023_09_22.ex;

public class TestGame {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Mik", 11);
        Pupil p2 = new Pupil("Ann", 13);

        Team<Pupil> pt1 = new Team<>("PT1");
        pt1.addNewParticipant(p1);
        pt1.addNewParticipant(p2);
    }
}
