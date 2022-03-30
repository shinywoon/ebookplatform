package com.example.EbookEc.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class EbookDTO {

    private Long id;
    private String title;
    private String writer;
    private String src;

}
