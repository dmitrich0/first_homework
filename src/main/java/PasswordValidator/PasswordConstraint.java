package PasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Documented
public @interface PasswordConstraint {
    String message() default "Password must contain at least 8 characters, '$' and '_'";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
