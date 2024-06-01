package me.msjo.land.domain.images.repository;

import me.msjo.land.domain.images.entity.TradeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<TradeHistory, Long> {
}
