package com.yasarcan.jobportal.services;

import com.yasarcan.jobportal.entity.JobPostActivity;
import com.yasarcan.jobportal.entity.JobSeekerApply;
import com.yasarcan.jobportal.entity.JobSeekerProfile;
import com.yasarcan.jobportal.repository.JobSeekerAplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerApplyService {

    private final JobSeekerAplyRepository jobSeekerAplyRepository;

    @Autowired
    public JobSeekerApplyService(JobSeekerAplyRepository jobSeekerAplyRepository) {
        this.jobSeekerAplyRepository = jobSeekerAplyRepository;
    }

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId) {
        return jobSeekerAplyRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job) {
        return jobSeekerAplyRepository.findByJob(job);
    }

    public void addNew(JobSeekerApply jobSeekerApply) {
        jobSeekerAplyRepository.save(jobSeekerApply);
    }
}
