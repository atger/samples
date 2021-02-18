package in.co.genotypic.GTSO6793.genefeature;

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
public class GeneFeatureController {

    @Autowired
    private GeneFeatureRepository geneFeatureRepository;

    @GetMapping(path = "/geneFeature")
    public ResponseEntity<?> getGeneFeatures(@RequestParam Optional<Integer> page) {
        Integer pageNumber = page.orElseGet(()->0);
        Iterable<GeneFeature> geneFeatures = geneFeatureRepository.findAll(PageRequest.of(pageNumber, 10));
        return ResponseEntity.ok(geneFeatures);
    }
}
