package formValidation.validator;

import formValidation.dao.EvaluateurDAO;
import formValidation.formbean.EvaluateurForm;
import formValidation.model.Evaluateur;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class EvaluateurValidator implements Validator {

    // common-validator library.
    private EmailValidator emailValidator = EmailValidator.getInstance();

    @Autowired
    private EvaluateurDAO evaluateurDAO;

    // The classes are supported by this validator.
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == EvaluateurForm.class;
    }

    @Override
    public void validate(Object target, Errors errors) {
        EvaluateurForm evaluateurForm = (EvaluateurForm) target;

        // Check the fields of EvaluateurForm.
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty.evaluateurForm.userName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty.evaluateurForm.firstName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty.evaluateurForm.lastName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.evaluateurForm.email");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.evaluateurForm.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "NotEmpty.evaluateurForm.confirmPassword");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "NotEmpty.evaluateurForm.gender");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryCode", "NotEmpty.evaluateurForm.countryCode");

        if (!this.emailValidator.isValid(evaluateurForm.getEmail())) {
            // Invalid email.
            errors.rejectValue("email", "Pattern.evaluateurForm.email");
        } else if (evaluateurForm.getUserId() == null) {
            Evaluateur dbUser = evaluateurDAO.findEvaluateurByEmail(evaluateurForm.getEmail());
            if (dbUser != null) {
                // Email has been used by another account.
                errors.rejectValue("email", "Duplicate.evaluateurForm.email");
            }
        }

        if (!errors.hasFieldErrors("userName")) {
            Evaluateur dbUser = evaluateurDAO.findEvaluateurByUserName(evaluateurForm.getUserName());
            if (dbUser != null) {
                // Username is not available.
                errors.rejectValue("userName", "Duplicate.evaluateurForm.userName");
            }
        }

        if (!errors.hasErrors()) {
            if (!evaluateurForm.getConfirmPassword().equals(evaluateurForm.getPassword())) {
                errors.rejectValue("confirmPassword", "Match.evaluateurForm.confirmPassword");
            }
        }
    }

}
