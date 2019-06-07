package org.cbioportal.persistence;

import org.cbioportal.model.GenePanel;
import org.cbioportal.model.GenePanelData;
import org.cbioportal.model.GenePanelToGene;
import org.cbioportal.model.meta.BaseMeta;

import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface GenePanelRepository {

    List<GenePanel> getAllGenePanels(String projection, Integer pageSize, Integer pageNumber, String sortBy,
                                     String direction);

    BaseMeta getMetaGenePanels();

    GenePanel getGenePanel(String genePanelId);

    List<GenePanel> fetchGenePanels(List<String> genePanelIds, String projection);

    List<GenePanelData> getGenePanelData(String molecularProfileId, String sampleListId);

    List<GenePanelData> fetchGenePanelData(String molecularProfileId, List<String> sampleIds);

    @Cacheable("GenePanelDataRepositoryCache")
    List<GenePanelData> fetchGenePanelDataInMultipleMolecularProfiles(List<String> molecularProfileIds, 
        List<String> sampleIds);

    List<GenePanelToGene> getGenesOfPanels(List<String> genePanelIds);
}
