package MatchFixture;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        List<String> teamsCopy = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Boluspor");
        teams.add("TrabzonSpor");

        if(teams.size()%2 != 0) {
            teams.add("Bay");
        }
        System.out.println("Takımlar");
        for(int i=0;i<teams.size();i++){
            System.out.println(" - "+teams.get(i));
        }
        System.out.println("");

        String countTeam = teams.get(0);


        teams.remove(countTeam);

        for(int i = 0 ; i< teams.size(); i++) {
            teamsCopy.add(teams.get(i));
        }

        for(int  i = 0 ; i <teamsCopy.size() ; i++) {

            System.out.println("Round "+(i+1));
            System.out.println(countTeam + " vs " + teamsCopy.get(teamsCopy.size()-1));
            for(int j = 0; j<teams.size()/2 ; j++) {
                System.out.println(teamsCopy.get(j) + " vs " + teamsCopy.get((teamsCopy.size()-1)-j-1));

            }

            System.out.println();
            teams.set(0, teamsCopy.get(teamsCopy.size()-1));
            for(int j = 0 ; j < teams.size()-1;j++) {
                teams.set(j+1,teamsCopy.get(j));
            }
            for(int j = 0 ; j < teams.size();j++) {
                teamsCopy.set(j,teams.get(j));
            }

        }
    }
}
