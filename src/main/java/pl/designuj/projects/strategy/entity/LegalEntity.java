package pl.designuj.projects.strategy.entity;

import lombok.Builder;
import lombok.Getter;

/**
 * created by designuj on 30/01/2020
 */

@Builder
@Getter
public class LegalEntity {
    private Long id;
    private String firstName;
    private String lastName;
    private ValidationScheme validationScheme;
}
