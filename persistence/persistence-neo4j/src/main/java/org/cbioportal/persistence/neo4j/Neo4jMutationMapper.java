package org.cbioportal.persistence.neo4j;

import org.cbioportal.model.Mutation;
import org.cbioportal.model.MutationCount;
import org.cbioportal.model.MutationCountByPosition;
import org.cbioportal.model.MutationCountByGene;
import org.cbioportal.model.meta.MutationMeta;

import java.util.List;

public interface Neo4jMutationMapper {

    // List<Mutation> getMutationsBySampleListId(String molecularProfileId, String sampleListId, List<Integer> entrezGeneIds,
    //                                           Boolean snpOnly, String projection, Integer limit, Integer offset, 
    //                                           String sortBy, String direction);

    // MutationMeta getMetaMutationsBySampleListId(String molecularProfileId, String sampleListId, 
    //                                             List<Integer> entrezGeneIds, Boolean snpOnly);

    // List<Mutation> getMutationsInMultipleMolecularProfiles(List<String> molecularProfileIds, List<String> sampleIds,
    //                                                        List<Integer> entrezGeneIds, Boolean snpOnly,
    //                                                        String projection, Integer limit, Integer offset,
    //                                                        String sortBy, String direction);

    // MutationMeta getMetaMutationsInMultipleMolecularProfiles(List<String> molecularProfileIds, List<String> sampleIds,
    //                                                          List<Integer> entrezGeneIds, Boolean snpOnly);

    // List<Mutation> getMutationsBySampleIds(String molecularProfileId, List<String> sampleIds, 
    //                                        List<Integer> entrezGeneIds, Boolean snpOnly, String projection, 
    //                                        Integer limit, Integer offset, String sortBy, String direction);

    // MutationMeta getMetaMutationsBySampleIds(String molecularProfileId, List<String> sampleIds, 
    //                                          List<Integer> entrezGeneIds, Boolean snpOnly);

    List<MutationCountByGene> getSampleCountByEntrezGeneIdsAndSampleIds(String molecularProfileId,
                                                                        List<String> sampleIds,
                                                                        List<Integer> entrezGeneIds,
                                                                        Boolean snpOnly);

    // List<MutationCountByGene> getPatientCountByEntrezGeneIdsAndSampleIds(String molecularProfileId,
    //                                                                      List<String> patientIds,
    //                                                                      List<Integer> entrezGeneIds,
    //                                                                      Boolean snpOnly);

    // List<MutationCount> getMutationCountsBySampleListId(String molecularProfileId, String sampleListId);
    
    // List<MutationCount> getMutationCountsBySampleIds(String molecularProfileId, List<String> sampleIds);
    
    // MutationCountByPosition getMutationCountByPosition(Integer entrezGeneId, Integer proteinPosStart, 
    //                                                    Integer proteinPosEnd);

}
