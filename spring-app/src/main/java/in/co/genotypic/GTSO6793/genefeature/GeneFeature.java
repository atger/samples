package in.co.genotypic.GTSO6793.genefeature;

import javax.persistence.*;

@Entity
@Table(name = "gene_features")
public class GeneFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String seqId;

    private String source;

    private String type;

    private Integer featureStart;

    private Integer featureEnd;

    private String score;

    private String strand;

    private String phase;

    private String attributes;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFeatureStart() {
        return featureStart;
    }

    public void setFeatureStart(Integer featureStart) {
        this.featureStart = featureStart;
    }

    public Integer getFeatureEnd() {
        return featureEnd;
    }

    public void setFeatureEnd(Integer featureEnd) {
        this.featureEnd = featureEnd;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStrand() {
        return strand;
    }

    public void setStrand(String strand) {
        this.strand = strand;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}
