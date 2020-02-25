package formValidation.controller;

import formValidation.dao.EvaluateurDAO;
import formValidation.formbean.EvaluateurForm;
import formValidation.model.Evaluateur;
import formValidation.model.TypeEvaluateur;
import formValidation.validator.EvaluateurValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EvaluateurDAO evaluateurDAO;

    @Autowired
    private EvaluateurValidator evaluateurValidator;

    // Set a form validator
    @InitBinder
    protected void initBinder(WebDataBinder dataBinder) {
        // Form target
        Object target = dataBinder.getTarget();
        if (target == null) {
            return;
        }
        System.out.println("Target=" + target);

        if (target.getClass() == EvaluateurForm.class) {
            dataBinder.setValidator(evaluateurValidator);
        }
        // ...
    }

    @RequestMapping("/")
    public String viewHome(Model model) {

        return "welcomePage";
    }

    @RequestMapping("/members") //liste de tout les evaluateurs
    public String viewMembers(Model model) {

        List<Evaluateur> list = evaluateurDAO.getEvaluateurs();

        model.addAttribute("members", list);

        return "membersPage";
    }

    @RequestMapping("/registerSuccessful")
    public String viewRegisterSuccessful(Model model) {

        return "registerSuccessfulPage";
    }

    // Show Register page.
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String viewRegister(Model model) {

        EvaluateurForm form = new EvaluateurForm();
        int typeEvaluateurs;
        typeEvaluateurs = TypeEvaluateur.getTypeEvaluateurID();

        model.addAttribute("evaluateurForm", form);
        model.addAttribute("typeEvaluateur", typeEvaluateurs );

        return "registerPage";
    }

}