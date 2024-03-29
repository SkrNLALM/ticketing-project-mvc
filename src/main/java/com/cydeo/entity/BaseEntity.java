package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseEntity {

    private Long id;
    private  LocalDateTime insertDateTime;
    private Long InsertUserid;
    private LocalDateTime lastUpdateDateTime;
    private Long lastUpdateUserid;

}
