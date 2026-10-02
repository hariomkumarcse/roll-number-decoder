package com.hariom.rolldecoder.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "roll_number_search_log")
public class RollNumberSearchLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "roll_number", nullable = false, length = 32)
    private String rollNumber;

    @Column(name = "searched_at", nullable = false)
    private LocalDateTime searchedAt;

    @Column(name = "successful", nullable = false)
    private boolean successful;

    @Column(name = "failure_reason", length = 255)
    private String failureReason;

    public RollNumberSearchLog() {
    }

    public RollNumberSearchLog(String rollNumber, LocalDateTime searchedAt, boolean successful, String failureReason) {
        this.rollNumber = rollNumber;
        this.searchedAt = searchedAt;
        this.successful = successful;
        this.failureReason = failureReason;
    }

    public Long getId() {
        return id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public LocalDateTime getSearchedAt() {
        return searchedAt;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getFailureReason() {
        return failureReason;
    }
}
