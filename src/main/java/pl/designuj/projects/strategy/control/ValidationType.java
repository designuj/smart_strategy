package pl.designuj.projects.strategy.control;

import pl.designuj.projects.strategy.entity.ValidationScheme;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, METHOD, FIELD, PARAMETER, CONSTRUCTOR})
@Qualifier
public @interface ValidationType {
    ValidationScheme value();
}
