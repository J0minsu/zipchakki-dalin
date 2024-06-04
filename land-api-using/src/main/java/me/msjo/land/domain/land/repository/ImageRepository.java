package me.msjo.land.domain.land.repository;

import me.msjo.land.domain.land.entity.TradeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<TradeHistory, Long> {
}
