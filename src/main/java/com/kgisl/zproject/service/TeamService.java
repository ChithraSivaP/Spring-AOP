package com.kgisl.zproject.service;

import java.util.List;

import com.kgisl.zproject.entity.Team;

public interface TeamService {
    public Team createTeam(Team team);
    public List<Team> getTeams();
    public Team findByTeamId(int teamid);
    public Team updateTeam(int teamid,Team team);
    public void deleteTeamById(int teamid); 
}
