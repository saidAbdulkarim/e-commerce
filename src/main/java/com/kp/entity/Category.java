package com.kp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;   
  /*  @OneToMany(fetch = FetchType.LAZY,  mappedBy = "category")
    private Set<CategoryType> categoriesType = new HashSet<>();*/
}
