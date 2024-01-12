package com.LabXpert.prod.entity;



import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "samples")
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column(name = "sample_type")
    private String sampleType;

    @Column(name = "collection_date")
    private LocalDate collectionDate;

    @OneToMany(mappedBy = "sample", cascade = CascadeType.ALL)
    private List<Analysis> analyses;

    public Long getId() {
        return id;
    }

    public Sample(Long id, Patient patient, String sampleType, LocalDate collectionDate, List<Analysis> analyses) {
        this.id = id;
        this.patient = patient;
        this.sampleType = sampleType;
        this.collectionDate = collectionDate;
        this.analyses = analyses;
    }

    public Sample() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public LocalDate getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(LocalDate collectionDate) {
        this.collectionDate = collectionDate;
    }

    public List<Analysis> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<Analysis> analyses) {
        this.analyses = analyses;
    }
}
