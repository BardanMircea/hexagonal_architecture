package com.yvens.hexa_impl.domain.model.team;

public class TeamDomainFactory {

  public static TeamDomainModel createFrenchTeam() {
    return new TeamDomainModel(1, "XV de France", "France");
  }

  public static TeamDomainModel createNewZealandTeam() {
    return new TeamDomainModel(2, "All Blacks", "New Zealand");
  }
}
