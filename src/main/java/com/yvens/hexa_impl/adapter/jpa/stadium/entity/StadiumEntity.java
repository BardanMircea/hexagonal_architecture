package com.yvens.hexa_impl.adapter.jpa.stadium.entity;

import com.yvens.hexa_impl.adapter.jpa.team.entity.TeamEntity;
import jakarta.persistence.*;
import org.springframework.data.repository.cdi.Eager;

@Entity
@Table(name = "stadiums")
public class StadiumEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String city;
  @OneToOne()
  @JoinColumn(name = "team_id")
  private TeamEntity team;

  public StadiumEntity(){};
  
  public StadiumEntity(String name, String city, TeamEntity team){
    this.name = name;
    this.city = city;
    this.team = team;
  }

  public TeamEntity getTeam() {
    return team;
  }

  public void setTeam(TeamEntity team) {
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
}
