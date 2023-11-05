package com.yvens.hexa_impl.domain.model.game;

import com.yvens.hexa_impl.domain.model.team.TeamDomainModel;

import java.util.Date;

public class GameDomainModel {

  private int id;
  private Date date;
  private TeamDomainModel homeTeam;
  private TeamDomainModel awayTeam;
  private String score;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public TeamDomainModel getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(TeamDomainModel homeTeam) {
    this.homeTeam = homeTeam;
  }

  public TeamDomainModel getAwayTeam() {
    return awayTeam;
  }

  public void setAwayTeam(TeamDomainModel awayTeam) {
    this.awayTeam = awayTeam;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

}
