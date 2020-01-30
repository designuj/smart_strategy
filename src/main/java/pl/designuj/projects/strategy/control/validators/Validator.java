package pl.designuj.projects.strategy.control.validators;

import pl.designuj.projects.strategy.entity.LegalEntity;

/**
 * created by designuj on 30/01/2020
 */

public interface Validator {
    LegalEntity validate(LegalEntity legalEntity);
}
