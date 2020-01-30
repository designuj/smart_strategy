package pl.designuj.projects.strategy.control;

import pl.designuj.projects.strategy.control.validators.Validator;
import pl.designuj.projects.strategy.entity.ValidationScheme;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * created by designuj on 30/01/2020
 */

@ApplicationScoped
public class ValidatorFactory {

    @Inject
    @Any
    private Instance<Validator> validatorInstance;

    public Validator createValidator(ValidationScheme scheme) {
        Instance<Validator> instance = validatorInstance.select(new ValidationTypeSchemeLiteral(scheme));

        if (!instance.isResolvable()) {
            throw new IllegalArgumentException("unsupported");
        }

        return instance.get();
    }
}
