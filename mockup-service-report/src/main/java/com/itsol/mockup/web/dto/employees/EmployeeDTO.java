package com.itsol.mockup.web.dto.employees;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

/**
 * @author anhvd_itsol
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDTO {

    Long id;
    String username;
    String password;
    String fullName;
    Set<String> roles;
}
