package com.example.statstrac.model;

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
    private Long subjectId;

}
