package in.co.genotypic.GTSO6793.gene;

import javax.persistence.*;

@Entity
@Table(name = "genes")
public class Gene {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String seqId;

    @Column(columnDefinition = "TEXT")
    private String sequence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
