package org.github.lokiafro;

import java.util.List;

public class Player {

    private String name;
    private String team;
    private List<String> teamMates;

    public Player(String name, String team, List<String> teamMates) {
        this.name = name;
        this.team = team;
        this.teamMates = teamMates;
    }


    // constructor and setters omitted
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public List<String> getTeamMates() {
        return teamMates;
    }

    @Override
    public String toString() {
        return "Player[name="+name+"]";
    }
}