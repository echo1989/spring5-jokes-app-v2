package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisQuotesService chuckNorrisQuotesService;

    public JokesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("joke", chuckNorrisQuotesService.getQuote());
        return "index";
    }

}
