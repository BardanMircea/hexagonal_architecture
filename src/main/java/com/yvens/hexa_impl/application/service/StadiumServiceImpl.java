package com.yvens.hexa_impl.application.service;
import com.yvens.hexa_impl.domain.model.stadium.StadiumDomainModel;
import com.yvens.hexa_impl.domain.port.api.stadium.StadiumServicePort;
import com.yvens.hexa_impl.domain.port.spi.stadium.StadiumJpaPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumServiceImpl implements StadiumServicePort {
    private final StadiumJpaPort stadiumJpaPort;

    public StadiumServiceImpl(@Autowired StadiumJpaPort stadiumJpaPort){
        this.stadiumJpaPort = stadiumJpaPort;
    }

    @Override
    public List<StadiumDomainModel> getAllStadiums() {
        return this.stadiumJpaPort.getAllStadiums();
    }

    @Override
    public StadiumDomainModel getStadiumById(int id) {
        return this.stadiumJpaPort.getStadiumById(id);
    }
}
