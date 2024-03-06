package com.cydeo.dto;

import com.cydeo.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.cydeo.enums.Status;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class ProjectDTO {

    private Long id;
    private String projectName;
    private String projectCode;
    private UserDTO assignedManager;



    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    private String projectDetail;
    private Status projectStatus;

    private int completeTaskCounts;
    private int unfinishedTaskCounts;


}

/*
 localhost:8762/cydeo/project/api/v1/project
{
  "id": 1,
  "projectName": "Sample Project",
  "projectCode": "PRJ001",
  "assignedManager": null,
  "startDate": "2024-03-01",
  "endDate": "2024-04-01",
  "projectDetail": "This is a sample project",
  "projectStatus": "IN_PROGRESS",
  "completeTaskCounts": 0,
  "unfinishedTaskCounts": 0
}
 */

/*
   {
  "id":10,
  "projectName": "API Project",
  "projectCode": "PRJ01",
  "assignedManager": {
            "id": 3,
            "firstName": "lat",
            "lastName": "zoulig",
            "userName": "zouliga",
            "enabled": false,
            "phone": "1231231231",
            "role": {
                "id": 2,
                "description": "Manager"
            },
            "gender": "MALE"
        },
  "startDate": "2024-03-01",
  "endDate": "2024-04-01",
  "projectDetail": "This is a sample project",
  "projectStatus": "IN_PROGRESS",
  "completeTaskCounts": 0,
  "unfinishedTaskCounts": 0
}
 */