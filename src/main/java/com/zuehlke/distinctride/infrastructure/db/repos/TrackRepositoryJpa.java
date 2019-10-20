package com.zuehlke.distinctride.infrastructure.db.repos;

import com.zuehlke.distinctride.infrastructure.db.entities.TrackDbEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrackRepositoryJpa extends JpaRepository<TrackDbEntity, Integer> {
}
