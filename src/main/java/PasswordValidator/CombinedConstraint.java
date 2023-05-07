package PasswordValidator;

import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Email;
import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Length(min = 8, max = 16)
@Email
@Documented
@ReportAsSingleViolation
public @interface CombinedConstraint {
    String message() default "Value must be email and contain 8-16 symbols";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
