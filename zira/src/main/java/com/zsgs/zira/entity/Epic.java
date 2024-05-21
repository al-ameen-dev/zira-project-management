package com.zsgs.zira.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "epic")
public class Epic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "epicId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "teamLeadId",nullable = false)
    private User user;

    @Column(name = "summary",length = 500)
    private String summary;

    @Column(name = "description",length = 500)
    private String description;

    @Column(name = "startDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;


}
