package com.zsgs.zira.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@EnableAspectJAutoProxy
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId")
    private Long id;

    @Column(name = "projectName")
    private String name;

    @Column(name="Description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "leadId")
    private User user;
}
