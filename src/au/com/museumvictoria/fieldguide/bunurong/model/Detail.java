package au.com.museumvictoria.fieldguide.bunurong.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Species detail object
 * 
 * @author Ajay Ranipeta <ajay.ranipeta@gmail.com>
 *
 */
public class Detail {
	private String description;
	private String bite;
	private String biology;
	private String diet;
	private String habitat;
	private String nativeStatus;
	private String distinctive;
	private String distribution;
	private ArrayList<ConservationStatuses> conservationStatuses;
	private String[] depth;
	private String[] location;	
	private boolean isCommercial;
	private String taxaPhylum;
	private String taxaClass;
	private String taxaOrder;
	private String taxaFamily;
	private String taxaGenus;
	private String taxaSpecies;
	private String commonNames;
	private String otherNames;
	
	public Detail() { }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBite() {
		if (bite == null) bite = "";
		return bite;
	}

	public void setBite(String bite) {
		this.bite = bite;
	}

	public String getBiology() {
		return biology;
	}

	public void setBiology(String biology) {
		this.biology = biology;
	}

	public String getDiet() {
		if (diet == null) diet = ""; 
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getNativeStatus() {
		return nativeStatus;
	}

	public void setNativeStatus(String nativeStatus) {
		this.nativeStatus = nativeStatus;
	}

	public String getDistinctive() {
		return distinctive;
	}

	public void setDistinctive(String distinctive) {
		this.distinctive = distinctive;
	}

	public String getDistribution() {
		return distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public ArrayList<ConservationStatuses> getConservationStatuses() {
		return conservationStatuses;
	}

	public void setConservationStatuses(
			ArrayList<ConservationStatuses> conservationStatuses) {
		this.conservationStatuses = conservationStatuses;
	}

	public String[] getDepth() {
		return depth;
	}

	public void setDepth(String[] depth) {
		this.depth = depth;
	}

	public String[] getLocation() {
		return location;
	}

	public void setLocation(String[] location) {
		this.location = location;
	}

	public boolean isCommercial() {
		return isCommercial;
	}

	public void setCommercial(boolean isCommercial) {
		this.isCommercial = isCommercial;
	}

	public String getTaxaPhylum() {
		return taxaPhylum;
	}

	public void setTaxaPhylum(String taxaPhylum) {
		this.taxaPhylum = taxaPhylum;
	}

	public String getTaxaClass() {
		return taxaClass;
	}

	public void setTaxaClass(String taxaClass) {
		this.taxaClass = taxaClass;
	}

	public String getTaxaOrder() {
		return taxaOrder;
	}

	public void setTaxaOrder(String taxaOrder) {
		this.taxaOrder = taxaOrder;
	}

	public String getTaxaFamily() {
		return taxaFamily;
	}

	public void setTaxaFamily(String taxaFamily) {
		this.taxaFamily = taxaFamily;
	}

	public String getTaxaGenus() {
		return taxaGenus;
	}

	public void setTaxaGenus(String taxaGenus) {
		this.taxaGenus = taxaGenus;
	}

	public String getTaxaSpecies() {
		return taxaSpecies;
	}

	public void setTaxaSpecies(String taxaSpecies) {
		this.taxaSpecies = taxaSpecies;
	}

	public String getCommonNames() {
		return commonNames;
	}

	public void setCommonNames(String commonNames) {
		this.commonNames = commonNames;
	}

	public String getOtherNames() {
		if (otherNames == null) otherNames = ""; 
		return otherNames;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}

	@Override
	public String toString() {
		return "Detail [description=" + description + ", bite=" + bite
				+ ", biology=" + biology + ", diet=" + diet + ", habitat="
				+ habitat + ", nativeStatus=" + nativeStatus + ", distinctive="
				+ distinctive + ", distribution=" + distribution
				+ ", conservationStatuses=" + conservationStatuses + ", depth="
				+ Arrays.toString(depth) + ", location="
				+ Arrays.toString(location) + ", isCommercial=" + isCommercial
				+ ", taxaPhylum=" + taxaPhylum + ", taxaClass=" + taxaClass
				+ ", taxaOrder=" + taxaOrder + ", taxaFamily=" + taxaFamily
				+ ", taxaGenus=" + taxaGenus + ", taxaSpecies=" + taxaSpecies
				+ ", commonNames=" + commonNames + ", otherNames=" + otherNames
				+ "]";
	}
	
}
