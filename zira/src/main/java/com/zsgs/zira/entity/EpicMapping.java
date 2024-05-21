package com.zsgs.zira.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "epicMapping")
public class EpicMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mapId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "epidId",nullable = false)
    private Epic epic;

    @ManyToOne
    @JoinColumn(name="projectId",nullable = false)
    private Project project;


}
