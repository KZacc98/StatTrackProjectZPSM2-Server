package com.example.statstrac.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Subject")
public class Subject {

    @Id
    @SequenceGenerator(
            name = "subject_sequence",
            sequenceName = "subject_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "subject_sequence"
    )
    private Long subjectId;
    private String title;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "subject_id",
            referencedColumnName = "subjectId"
    )
    private List<Grade> gradeList=new ArrayList<>();




    public Subject(String title) {
        this.title = title;
    }


}
