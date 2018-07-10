package org.cbioportal.persistence.neo4j;

import org.cbioportal.model.Mutation;
import org.cbioportal.model.MutationCount;
import org.cbioportal.model.MutationCountByPosition;
import org.cbioportal.model.MutationCountByGene;
import org.cbioportal.model.meta.MutationMeta;
import org.cbioportal.persistence.MutationRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("neo4jMutationRepository")
public class MutationNeo4jRepository implements MutationRepository {

    @Autowired
    private Neo4jMutationMapper mutationMapper;

    @Override
    public List<Mutation> getMutationsInMolecularProfileBySampleListId(String molecularProfileId, String sampleListId,
                                                                       List<Integer> entrezGeneIds, Boolean snpOnly,
                                                                       String projection, Integer pageSize,
                                                                       Integer pageNumber, String sortBy,
                                                                       String direction) {

        throw new UnsupportedOperationException();
    }

    @Override
    public MutationMeta getMetaMutationsInMolecularProfileBySampleListId(String molecularProfileId, String sampleListId,
                                                                         List<Integer> entrezGeneIds) {

        throw new UnsupportedOperationException();
    }

    @Override
    public List<Mutation> getMutationsInMultipleMolecularProfiles(List<String> molecularProfileIds, 
                                                                  List<String> sampleIds, List<Integer> entrezGeneIds, 
                                                                  String projection, Integer pageSize, 
                                                                  Integer pageNumber, String sortBy, String direction) {

        throw new UnsupportedOperationException();
    }

    @Override
    public MutationMeta getMetaMutationsInMultipleMolecularProfiles(List<String> molecularProfileIds,
                                                                    List<String> sampleIds, 
                                                                    List<Integer> entrezGeneIds) {

        throw new UnsupportedOperationException();
    }

    @Override
    public List<Mutation> fetchMutationsInMolecularProfile(String molecularProfileId, List<String> sampleIds,
                                                           List<Integer> entrezGeneIds, Boolean snpOnly,
                                                           String projection, Integer pageSize, Integer pageNumber,
                                                           String sortBy, String direction) {

        throw new UnsupportedOperationException();
    }

    @Override
    public MutationMeta fetchMetaMutationsInMolecularProfile(String molecularProfileId, List<String> sampleIds,
                                                             List<Integer> entrezGeneIds) {

        throw new UnsupportedOperationException();
    }

    @Override
    public List<MutationCountByGene> getSampleCountByEntrezGeneIdsAndSampleIds(String molecularProfileId,
                                                                               List<String> sampleIds,
                                                                               List<Integer> entrezGeneIds) {
        
        try {
            return mutationMapper.getSampleCountByEntrezGeneIdsAndSampleIds(molecularProfileId, sampleIds, entrezGeneIds, null);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<MutationCountByGene> getPatientCountByEntrezGeneIdsAndSampleIds(String molecularProfileId,
                                                                                List<String> patientIds,
                                                                                List<Integer> entrezGeneIds) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MutationCount> getMutationCountsInMolecularProfileBySampleListId(String molecularProfileId,
                                                                                 String sampleListId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MutationCount> fetchMutationCountsInMolecularProfile(String molecularProfileId, 
                                                                     List<String> sampleIds) {

        throw new UnsupportedOperationException();
    }

    @Override
    public MutationCountByPosition getMutationCountByPosition(Integer entrezGeneId, Integer proteinPosStart,
                                                              Integer proteinPosEnd) {

        throw new UnsupportedOperationException();
    }
}
