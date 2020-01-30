package pl.designuj.projects.strategy.service;

import com.google.common.collect.Maps;
import pl.designuj.projects.strategy.control.ValidatorFactory;
import pl.designuj.projects.strategy.control.validators.Validator;
import pl.designuj.projects.strategy.entity.LegalEntity;
import pl.designuj.projects.strategy.entity.ValidationScheme;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Map;
import java.util.Optional;

/**
 * created by designuj on 30/01/2020
 */

@Stateless
public class LegalEntityService {

    @Inject
    private ValidatorFactory factory;

    public LegalEntity validLegalEntity(Long id) {
        LegalEntity legalEntity = findById(id);

        ValidationScheme validationScheme = Optional.ofNullable(legalEntity)
                .map(LegalEntity::getValidationScheme)
                .orElse(ValidationScheme.DEFAULT);
        Validator validator = factory.createValidator(validationScheme);

        return validator.validate(legalEntity);
    }

    // db mock
    private LegalEntity findById(Long id) {
        Map<Long, LegalEntity> legalEntityMap = Maps.newHashMap();

        legalEntityMap.put(1L, LegalEntity.builder()
                .id(1L)
                .firstName("John")
                .lastName("Wick")
                .validationScheme(ValidationScheme.UPPER)
                .build());

        legalEntityMap.put(2L, LegalEntity.builder()
                .id(2L)
                .firstName("Frank")
                .lastName("Sinatra")
                .validationScheme(ValidationScheme.LOWER)
                .build());

        return legalEntityMap.get(id);
    }
}
