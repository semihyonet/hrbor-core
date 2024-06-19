package com.karpco.havegan.dto.jobs;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CreateJobRequest {
    private String name;
    private ArrayList<JobEvaluationTypeEnum> jobEvaluationTypeEnum;
}
