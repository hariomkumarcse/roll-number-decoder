package com.hariom.rolldecoder.repository;

import com.hariom.rolldecoder.model.entity.RollNumberSearchLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RollNumberSearchLogRepository extends JpaRepository<RollNumberSearchLog, Long> {

    List<RollNumberSearchLog> findTop10ByOrderBySearchedAtDesc();
}
