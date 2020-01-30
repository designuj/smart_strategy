package pl.designuj.projects.strategy.control;

import pl.designuj.projects.strategy.entity.ValidationScheme;

import javax.enterprise.util.AnnotationLiteral;

/**
 * created by designuj on 30/01/2020
 */

public class ValidationTypeSchemeLiteral extends AnnotationLiteral<ValidationType> implements ValidationType {

    private final ValidationScheme scheme;

    public ValidationTypeSchemeLiteral(ValidationScheme scheme) {
        this.scheme = scheme;
    }

    @Override
    public ValidationScheme value() {
        return scheme;
    }
}
