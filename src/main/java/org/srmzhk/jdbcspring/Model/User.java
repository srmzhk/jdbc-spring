package org.srmzhk.jdbcspring.Model;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
}
