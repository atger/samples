package in.co.genotypic.GTSO6793.annotation;

import javax.persistence.*;

@Entity
@Table(name = "annotations")
public class Annotation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String proteinId;

    private Integer length;

    private String homoProteinId;

    private Integer homoProteinLength;

    private Float percentageIdentity;

    private Float alignmentLength;

    private Float proteinCoverage;

    private Float homoProteinCoverage;

    private Integer mismatches;

    private Integer gapOpen;

    private Integer proteinStart;

    private Integer proteinEnd;

    private Integer homoProteinStart;

    private Integer homoProteinEnd;

    private Double eValue;

    private String proteinName;

    private String geneName;

    private String organismName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProteinId() {
        return proteinId;
    }

    public void setProteinId(String proteinId) {
        this.proteinId = proteinId;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getHomoProteinId() {
        return homoProteinId;
    }

    public void setHomoProteinId(String homoProteinId) {
        this.homoProteinId = homoProteinId;
    }

    public Integer getHomoProteinLength() {
        return homoProteinLength;
    }

    public void setHomoProteinLength(Integer homoProteinLength) {
        this.homoProteinLength = homoProteinLength;
    }

    public Float getPercentageIdentity() {
        return percentageIdentity;
    }

    public void setPercentageIdentity(Float percentageIdentity) {
        this.percentageIdentity = percentageIdentity;
    }

    public Float getAlignmentLength() {
        return alignmentLength;
    }

    public void setAlignmentLength(Float alignmentLength) {
        this.alignmentLength = alignmentLength;
    }

    public Float getProteinCoverage() {
        return proteinCoverage;
    }

    public void setProteinCoverage(Float proteinCoverage) {
        this.proteinCoverage = proteinCoverage;
    }

    public Float getHomoProteinCoverage() {
        return homoProteinCoverage;
    }

    public void setHomoProteinCoverage(Float homoProteinCoverage) {
        this.homoProteinCoverage = homoProteinCoverage;
    }

    public Integer getMismatches() {
        return mismatches;
    }

    public void setMismatches(Integer mismatches) {
        this.mismatches = mismatches;
    }

    public Integer getGapOpen() {
        return gapOpen;
    }

    public void setGapOpen(Integer gapOpen) {
        this.gapOpen = gapOpen;
    }

    public Integer getProteinStart() {
        return proteinStart;
    }

    public void setProteinStart(Integer proteinStart) {
        this.proteinStart = proteinStart;
    }

    public Integer getProteinEnd() {
        return proteinEnd;
    }

    public void setProteinEnd(Integer proteinEnd) {
        this.proteinEnd = proteinEnd;
    }

    public Integer getHomoProteinStart() {
        return homoProteinStart;
    }

    public void setHomoProteinStart(Integer homoProteinStart) {
        this.homoProteinStart = homoProteinStart;
    }

    public Integer getHomoProteinEnd() {
        return homoProteinEnd;
    }

    public void setHomoProteinEnd(Integer homoProteinEnd) {
        this.homoProteinEnd = homoProteinEnd;
    }

    public Double geteValue() {
        return eValue;
    }

    public void seteValue(Double eValue) {
        this.eValue = eValue;
    }

    public String getProteinName() {
        return proteinName;
    }

    public void setProteinName(String proteinName) {
        this.proteinName = proteinName;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }

    public String getOrganismName() {
        return organismName;
    }

    public void setOrganismName(String organismName) {
        this.organismName = organismName;
    }
}
