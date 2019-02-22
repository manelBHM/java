package co.pharma.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class webController {
	
    private static List<Client> clien = new ArrayList<Client>();
    
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("client", clients);
        
        return "index";
    }
    @RequestMapping(value = { "/List" }, method = RequestMethod.GET)
    public String personList(Model model) {
 
        model.addAttribute("Produit", produits);
 
        return "List";
    }
    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
    public String saveClient(Model model, //
            @ModelAttribute("PersonForm") ClientForm clientForm) {
 
        String firstName = clientForm.getFirstName();
        String lastName = clientForm.getLastName();
 
        if (firstName != null && firstName.length() > 0 //
                && lastName != null && lastName.length() > 0) {
            Client newClient = new Client(firstName, lastName);
            Client.add(newClient);
 
            return "redirect:/List";
        }
 
        model.addAttribute("errorMessage", errorMessage);
        return "index";
    }
}
