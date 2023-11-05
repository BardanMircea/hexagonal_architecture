package com.yvens.hexa_impl.adapter.rest.stadium.dto;

import com.yvens.hexa_impl.adapter.jpa.team.entity.TeamEntity;

public class StadiumDto {

  private int id;
  private String name;
  private String city;
  private String team;

  public StadiumDto(int id, String name, String city, String team) {
    this.id = id;
    this.name = name;
    this.city = city;
    this.team = team;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}
