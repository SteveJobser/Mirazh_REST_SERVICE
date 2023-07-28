package kz.mirazh.rest_service.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SimpleJson {
    private String name;
    private int age;
    private String sex;
}
