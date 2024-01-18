package com.softelse.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.games.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}
