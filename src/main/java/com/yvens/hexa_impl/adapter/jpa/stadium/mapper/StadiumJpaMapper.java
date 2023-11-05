package com.yvens.hexa_impl.adapter.jpa.stadium.mapper;

import java.util.ArrayList;
import java.util.List;

import com.yvens.hexa_impl.adapter.jpa.team.mapper.TeamJpaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yvens.hexa_impl.adapter.jpa.stadium.entity.StadiumEntity;
import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;

@Component
public class StadiumJpaMapper {

  private final TeamJpaMapper teamJpaMapper;

  public StadiumJpaMapper(@Autowired TeamJpaMapper teamJpaMapper){
    this.teamJpaMapper = teamJpaMapper;
  }
  public StadiumDomainModel toStadiumDomainModel(StadiumEntity stadiumEntity) {
    return new StadiumDomainModel(stadiumEntity.getId(), stadiumEntity.getName(), stadiumEntity.getCity(), teamJpaMapper.toTeamDomainModel(stadiumEntity.getTeam()));
  }

  public List<StadiumDomainModel> toStadiumDomainModelList(List<StadiumEntity> stadiumEntityList) {
    List<StadiumDomainModel> stadiumDomainModelList = new ArrayList<>();
    for (StadiumEntity stadiumEntity : stadiumEntityList) {
      stadiumDomainModelList.add(toStadiumDomainModel(stadiumEntity));
    }
    return stadiumDomainModelList;
  }

}
