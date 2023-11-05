package com.yvens.hexa_impl.adapter.jpa.team.entity;

import com.yvens.hexa_impl.adapter.jpa.stadium.entity.StadiumEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class TeamEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  @OneToOne(mappedBy = "team")
  private StadiumEntity stadium;

  public TeamEntity() {}
  public TeamEntity(String name) {
    this.name = name;
  }

  public StadiumEntity getStadium() {
    return stadium;
  }

  public void setStadium(StadiumEntity stadium) {
    this.stadium = stadium;
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

}