package in.co.genotypic.GTSO6793.sequence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SequenceRepositry extends PagingAndSortingRepository<Sequence, String> {
}
