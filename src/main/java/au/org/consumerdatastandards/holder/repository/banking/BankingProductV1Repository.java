package au.org.consumerdatastandards.holder.repository.banking;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import au.org.consumerdatastandards.holder.model.banking.BankingProductV1;


@Repository
public interface BankingProductV1Repository
    extends PagingAndSortingRepository<BankingProductV1, String>, JpaSpecificationExecutor<BankingProductV1> { }
