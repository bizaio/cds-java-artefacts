package au.org.consumerdatastandards.holder.repository.energy;

import au.org.consumerdatastandards.holder.model.energy.EnergyPlanEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EnergyPlanRepository extends PagingAndSortingRepository<EnergyPlanEntity, String>, JpaSpecificationExecutor<EnergyPlanEntity> {
}
