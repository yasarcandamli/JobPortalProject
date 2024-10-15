package com.yasarcan.jobportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    private int id;
}
