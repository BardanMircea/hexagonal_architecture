package com.yvens.hexa_impl.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;
import com.yvens.hexa_impl.domain.port.api.team.TeamServicePort;
import com.yvens.hexa_impl.domain.port.spi.team.TeamJpaPort;

@Service
public class TeamServiceImpl implements TeamServicePort {

  private TeamJpaPort teamJpaPort;

  public TeamServiceImpl(TeamJpaPort teamJpaPort) {
    this.teamJpaPort = teamJpaPort;
  }

  @Override
  public List<TeamDomainModel> getTeams() {
    // Logique à implmenter au besoin avant de retourner les données
    return this.teamJpaPort.getAllTeams();
  }

  @Override
  public TeamDomainModel getTeamById(int id) {
    // Logique à implmenter au besoin avant de retourner les données
    return this.teamJpaPort.getTeamById(id);
  }
  
}
