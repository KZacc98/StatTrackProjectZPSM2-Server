package com.example.statstrac.model;

import com.example.statstrac.dto.GradeEntryDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="Grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gradeId;
    private Double gradeValue;
    private String note;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    @JsonIgnore
    private Subject subject;

}
