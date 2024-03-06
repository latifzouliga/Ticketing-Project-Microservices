package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@NoArgsConstructor
@Getter
@Setter
@Where(clause = "is_deleted=false")
public class Task extends BaseEntity {

    private String taskSubject;
    private String taskDetail;

    @Enumerated(EnumType.STRING)
    private Status taskStatus;

    @Column(columnDefinition = "DATE")
    private LocalDate assignedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User assignedEmployee;

    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;

}

/*
  {
    "taskSubject": "Building APIs",
    "taskDetail":"Building API with java and spring boot framework",
    "taskStatus":"OPEN",
    "assignedDate":"2024-10-10",
    "assignedEmployee":{
            "id": 5,
            "firstName": "mike",
            "lastName": "mike",
            "userName": "mike",
            "enabled": false,
            "phone": "1231231231",
            "role": {
                "id": 3,
                "description": "Employee"
            },
            "gender": "MALE"
        },
    "project":{
            "id": null,
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
            "startDate": null,
            "endDate": null,
            "projectDetail": "This is a sample project",
            "projectStatus": "IN_PROGRESS",
            "completeTaskCounts": 0,
            "unfinishedTaskCounts": 0
        }
  }
 */