
package com.pixida.study.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public record UserRequest(
    @NotBlank String name, @NotBlank @Email String email) {

}
