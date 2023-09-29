package org.example._2023_09_22.ex;

import com.github.javafaker.Faker;

import java.util.List;

public class Generator {
    private static final Faker FAKER = new Faker();
    public static <T extends Participant> T generateParticipant(TypeParticipant typeParticipant) {
        Participant participant = null;
        String name = FAKER.name().firstName();
        int age = generateAge(typeParticipant);

        switch (typeParticipant) {
            case ADULT -> participant = new Adult(name, age);
            case PUPIL -> participant = new Pupil(name, age);
            case STUDENT -> participant = new Student(name, age);
        }
        return (T) participant;
        /**
         * git@github.com:YefrAlex/HW_Summary.git
         */
    }

    //todo
    public static Class<?> checkTeamType(List<Team<? extends Participant>> teams) {
        if (teams.isEmpty()) {
            return null;
        }
        Team<? extends Participant> firstTeam = teams.get(0);
        Class<?> teamType = firstTeam.getClass();
        return teamType;
    }

    private static int generateAge(TypeParticipant typeParticipant) {
        int randomAge = 0;

        switch (typeParticipant) {
            case PUPIL -> randomAge = (int) (11 + (Math.random() * 15));
            case STUDENT -> randomAge = (int) (16 + (Math.random() * 21));
            case ADULT -> randomAge = (int) (22 + (Math.random() * 65));
        }
        return randomAge;
    }

    public static <T extends Participant> Team<? extends Participant> generateTeam(TypeParticipant typeParticipant) {
       return null;
    }
}