package org.cbioportal.persistence.mybatis;

import org.cbioportal.model.GeneMolecularData;
import org.cbioportal.model.GeneMolecularAlteration;
import org.cbioportal.model.GenesetMolecularAlteration;

import java.util.List;

public interface MolecularDataMapper {

    List<String> getCommaSeparatedSampleIdsOfMolecularProfiles(List<String> molecularProfileIds);

    List<GeneMolecularData> getGeneMolecularAlterations(String molecularProfileId, List<Integer> sampleIds,
                                                        List<Integer> entrezGeneIds, String projection);

    List<GeneMolecularAlteration> getGeneMolecularAlterationsInMultipleMolecularProfiles(List<String> molecularProfileIds, 
                                                                                         List<Integer> entrezGeneIds,
                                                                                         String projection);

	List<GenesetMolecularAlteration> getGenesetMolecularAlterations(String molecularProfileId, List<String> genesetIds,
                                                                    String projection);
}
