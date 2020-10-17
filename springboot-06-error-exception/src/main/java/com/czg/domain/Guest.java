package com.czg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {

    @NotBlank(message = "{guest.name.notblank}")
    private String name;
    @NotBlank
    private String role;
}
