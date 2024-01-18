package com.softelse.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.games.entities.Game;

public interface GameRepositoy extends JpaRepository<Game, Long>{

}
