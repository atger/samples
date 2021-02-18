package in.co.genotypic.GTSO6793.protein;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(path = "/api")
public class ProteinController {

    @Autowired
    private ProteinRepository proteinRepository;

    @GetMapping(path = "/protein")
    private ResponseEntity<?> getProteins(@RequestParam Optional<Integer> page) {
        Integer pageNumber = page.orElseGet(() -> 0);
        Iterable<Protein> proteins = proteinRepository.findAll(PageRequest.of(pageNumber, 10));
        return ResponseEntity.ok(proteins);
    }
}
