package com.LabXpert.prod;

import com.LabXpert.prod.entity.Analysis;
import com.LabXpert.prod.entity.Reagent;
import com.LabXpert.prod.entity.Patient;
import com.LabXpert.prod.entity.Sample;
import com.LabXpert.prod.entity.User;
import com.LabXpert.prod.entity.enums.AnalysisResult;
import com.LabXpert.prod.entity.enums.AnalysisStatus;
import com.LabXpert.prod.entity.enums.AnalysisType;
import com.LabXpert.prod.repository.AnalysisRepository;
import com.LabXpert.prod.repository.PatientRepository;
import com.LabXpert.prod.repository.ReagentRepository;
import com.LabXpert.prod.repository.SampleRepository;
import com.LabXpert.prod.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class LabXpertApplication {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private SampleRepository sampleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AnalysisRepository analysisRepository;

    @Autowired
    private ReagentRepository reagentRepository;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(LabXpertApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            // Create a new patient
            Patient newPatient = new Patient();
            newPatient.setFirstName("John");
            newPatient.setLastName("Doe");
            newPatient.setBirthDate(LocalDate.of(1990, 5, 15));

            // Save the new patient to the database
            patientRepository.save(newPatient);
            System.out.println("Patient saved with id: " + newPatient.getId());

            // Create a new sample
            Sample newSample = new Sample();
            newSample.setPatient(newPatient);
            newSample.setSampleType("Blood");
            newSample.setCollectionDate(LocalDate.now());

            // Save the new sample to the database
            sampleRepository.save(newSample);
            System.out.println("Sample saved with id: " + newSample.getId());

            // Create a new user
            User newUser = new User();
            newUser.setUsername("testuser");
            newUser.setPassword("password123");

            // Save the new user to the database
            userRepository.save(newUser);
            System.out.println("User saved with id: " + newUser.getId());

            // Create a new analysis
            Analysis newAnalysis = new Analysis();
            newAnalysis.setSample(newSample);
            newAnalysis.setTechnician(newUser); // Assign a technician to the analysis
            newAnalysis.setStatus(AnalysisStatus.PENDING); // Set status as an example
            newAnalysis.setResults(AnalysisResult.ANORMAL);

            // Save the new analysis to the database
            analysisRepository.save(newAnalysis);
            System.out.println("Analysis saved with id: " + newAnalysis.getId());

            // Create a new reagent
            Reagent newReagent = new Reagent();
            newReagent.setReagentName("Reagent1");

            // Save the new reagent to the database
            reagentRepository.save(newReagent);
            System.out.println("Reagent saved with id: " + newReagent.getId());
        };
    }


}

