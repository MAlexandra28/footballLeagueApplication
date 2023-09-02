package com.ironhack.demosecurityjwt.dtos;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data transfer object for passing information for adding a role to a user
 */
@Data
public class LeagueDTO {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class MedicationDto {
        @NotEmpty
        private String name;
        @NotEmpty
        private String ware;
        @Min(0)
        private double price;

    }
}