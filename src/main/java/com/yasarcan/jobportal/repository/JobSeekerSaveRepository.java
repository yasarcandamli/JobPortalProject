package com.yasarcan.jobportal.repository;

import com.yasarcan.jobportal.entity.JobPostActivity;
import com.yasarcan.jobportal.entity.JobSeekerProfile;
import com.yasarcan.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);
    List<JobSeekerSave> findByJob(JobPostActivity job);
}
