package com.yasarcan.jobportal.repository;

import com.yasarcan.jobportal.entity.JobPostActivity;
import com.yasarcan.jobportal.entity.JobSeekerApply;
import com.yasarcan.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerAplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);
    List<JobSeekerApply> findByJob(JobPostActivity job);
}
