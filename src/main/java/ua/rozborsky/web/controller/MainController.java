package ua.rozborsky.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.rozborsky.web.classes.GetValuesImpl;
import ua.rozborsky.web.interfaces.DAO;
import ua.rozborsky.web.interfaces.Equation;
import ua.rozborsky.web.interfaces.GetValues;

import javax.validation.Valid;

/**
 * Created by roman on 18.11.2016.
 */

@Controller
public class MainController {

    @Autowired
    GetValues getValues;

    @Autowired
    Equation equation;

    @Autowired
    DAO dao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {

        return new ModelAndView("main", "getValues", getValues);
    }

    @RequestMapping(value = "solveTheEquation", method = RequestMethod.POST)
    public ModelAndView solveTheEquation(@Valid @ModelAttribute(value = "getValues") GetValuesImpl getValues,
                                   BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("main");
        }
        String result = dataProcessing(getValues);

        return new ModelAndView("result", "result", result);
    }

    @RequestMapping(value = "result", method = RequestMethod.GET)
    public String result() {

        return "result";
    }

    private String dataProcessing(GetValuesImpl getValues) {
        String result = "невозможно вычислить x";
        equation.setValues(getValues);

        if (equation.canCalculate() && getValues.getA() != 0) {
            equation.calculateX();
            dao.saveValues(equation);
            result = equation.getValues();
        }

        return result;
    }
}
