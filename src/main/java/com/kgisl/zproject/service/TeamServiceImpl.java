package com.kgisl.zproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kgisl.zproject.entity.Team;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

    @Override
    public Team createTeam(Team team) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Team> getTeams() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Team findByTeamId(int teamid) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Team updateTeam(int teamid, Team team) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteTeamById(int teamid) {
        // TODO Auto-generated method stub
        
    }
    
}
