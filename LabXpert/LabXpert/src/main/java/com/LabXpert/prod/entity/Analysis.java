package com.LabXpert.prod.entity;


import com.LabXpert.prod.entity.enums.AnalysisResult;
import com.LabXpert.prod.entity.enums.AnalysisStatus;
import com.LabXpert.prod.entity.enums.AnalysisType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "analyses")
public class Analysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sample_id", nullable = false)
    private Sample sample;

    @ManyToOne
    @JoinColumn(name = "technician_id", nullable = false)
    private User technician;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AnalysisStatus status;


    public AnalysisType getAnalyseType() {
        return AnalyseType;
    }

    public void setAnalyseType(AnalysisType analyseType) {
        AnalyseType = analyseType;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AnalysisType AnalyseType;

    @Enumerated(EnumType.STRING)
    @Column(name = "results")
    private AnalysisResult results;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date")
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "comments")
    private String comments;

    public Analysis(Long id, Sample sample, User technician, AnalysisStatus status, AnalysisResult results, Date startDate, Date endDate, String comments) {
        this.id = id;
        this.sample = sample;
        this.technician = technician;
        this.status = status;
        this.results = results;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comments = comments;
    }

    public Analysis() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public User getTechnician() {
        return technician;
    }

    public void setTechnician(User technician) {
        this.technician = technician;
    }

    public AnalysisStatus getStatus() {
        return status;
    }

    public void setStatus(AnalysisStatus status) {
        this.status = status;
    }

    public AnalysisResult getResults() {
        return results;
    }

    public void setResults(AnalysisResult results) {
        this.results = results;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
