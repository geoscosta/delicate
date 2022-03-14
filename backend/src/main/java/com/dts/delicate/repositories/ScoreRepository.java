package com.dts.delicate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dts.delicate.entities.Score;
import com.dts.delicate.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
