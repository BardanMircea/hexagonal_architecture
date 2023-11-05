package com.yvens.hexa_impl.adapter.rest.stadium;

import com.yvens.hexa_impl.adapter.rest.stadium.dto.StadiumDto;
import com.yvens.hexa_impl.adapter.rest.stadium.mapper.StadiumRestMapper;
import com.yvens.hexa_impl.domain.port.api.stadium.StadiumServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {

    private final StadiumServicePort stadiumServicePort;
    private final StadiumRestMapper stadiumRestMapper;

    public StadiumController(@Autowired StadiumServicePort stadiumServicePort,
                             @Autowired StadiumRestMapper stadiumRestMapper){
        this.stadiumServicePort = stadiumServicePort;
        this.stadiumRestMapper = stadiumRestMapper;

    }

    @GetMapping("/{id}")
    public ResponseEntity<StadiumDto> getStadiumById(@PathVariable int id){
        try {
            StadiumDto stadiumDto = this.stadiumRestMapper.toStadiumDto(this.stadiumServicePort.getStadiumById(id));
            return ResponseEntity.ok(stadiumDto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("")
    public ResponseEntity<List<StadiumDto>> getAllStadiums() {
        try {
            List<StadiumDto> stadiumDtoList = this.stadiumRestMapper.toStadiumDtoList(this.stadiumServicePort.getAllStadiums());
            return ResponseEntity.ok(stadiumDtoList);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}