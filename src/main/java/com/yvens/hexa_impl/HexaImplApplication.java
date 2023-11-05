package com.yvens.hexa_impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.yvens.hexa_impl.adapter.jpa.stadium.entity.StadiumEntity;
import com.yvens.hexa_impl.adapter.jpa.stadium.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yvens.hexa_impl.adapter.jpa.team.repository.TeamRepository;
import com.yvens.hexa_impl.adapter.jpa.team.entity.TeamEntity;

@SpringBootApplication
public class HexaImplApplication {

	private final TeamRepository teamRepository;
	private final StadiumRepository stadiumRepository;

	public HexaImplApplication(@Autowired TeamRepository teamRepository,
							   @Autowired StadiumRepository stadiumRepository){
		this.teamRepository = teamRepository;
		this.stadiumRepository = stadiumRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(HexaImplApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			List<TeamEntity> teams = new ArrayList<>();
			TeamEntity franceTeam = new TeamEntity("France");
			TeamEntity germanTeam = new TeamEntity("Allemagne");
			TeamEntity spanishTeam = new TeamEntity("Esapagne");
			teams.add(franceTeam);
			teams.add(germanTeam);
			teams.add(spanishTeam);
			this.teamRepository.saveAll(teams);

			Set<StadiumEntity> stadiums = new HashSet<>();
			StadiumEntity stad1 = new StadiumEntity("Bercy Arena","Paris", franceTeam);
			StadiumEntity stad2 = new StadiumEntity("Allianz Arena","Munchen", germanTeam);
			StadiumEntity stad3 = new StadiumEntity("Nou Camp","Barcelona", spanishTeam);
			stadiums.add(stad1);
			stadiums.add(stad2);
			stadiums.add(stad3);
			this.stadiumRepository.saveAll(stadiums);
		};
	}

}

// Petit exo à faire: 
// Créer une liste de stadium dans le CommandLineRunner et la renvoyé dans le stadiumController
// Lier un stade et une équipe par relation sql puis renvoyer un stade et son équipe lorsque je sélectionne un stade

// Event Storming: https://www.youtube.com/watch?v=0-ppfFuGB-I&ab_channel=YOUNUP
