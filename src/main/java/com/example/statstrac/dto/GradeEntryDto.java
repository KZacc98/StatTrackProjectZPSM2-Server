package com.example.statstrac.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GradeEntryDto {
    private Long subjectId;
    private Double gradeValue;
    private String note;
}
