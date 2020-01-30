package pl.designuj.projects.strategy.control.validators;

import pl.designuj.projects.strategy.control.ValidationType;
import pl.designuj.projects.strategy.entity.LegalEntity;
import pl.designuj.projects.strategy.entity.ValidationScheme;

import javax.ejb.Stateless;

/**
 * created by designuj on 30/01/2020
 */

@Stateless
@ValidationType(ValidationScheme.DEFAULT)
public class DefaultValidator implements Validator {

    @Override
    public LegalEntity validate(LegalEntity legalEntity) {
        return LegalEntity.builder()
                .id(legalEntity.getId())
                .firstName("not available")
                .lastName("not available")
                .build();
    }
}
