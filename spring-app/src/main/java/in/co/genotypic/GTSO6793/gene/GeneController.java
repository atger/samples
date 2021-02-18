package in.co.genotypic.GTSO6793.gene;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
@RequestMapping(path = "/api")
public class GeneController {

    @Autowired
    private GeneRepository geneRepository;

    @GetMapping(path = "/genes")
    public ResponseEntity<?> getGenes(@RequestParam Optional<Integer> page) {
        Integer pageNumber = page.orElseGet(() -> 0);
        Iterable<Gene> genes = geneRepository.findAll(PageRequest.of(pageNumber,10));
        return ResponseEntity.ok(genes);
    }
}
