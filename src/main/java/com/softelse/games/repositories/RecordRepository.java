package com.softelse.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.games.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
