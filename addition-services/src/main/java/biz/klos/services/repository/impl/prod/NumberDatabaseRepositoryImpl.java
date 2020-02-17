package biz.klos.services.repository.impl.prod;

import biz.klos.services.repository.NumberRepository;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Conditional(NumberDatabaseRepositoryPrecondition.class)
public class NumberDatabaseRepositoryImpl implements NumberRepository {

    @Override
    public BigDecimal findNumber() {
        // Miejsce na połączenie z bazą danych (Encje i połączenie z bazą danych powinny się znaleźć w module additional-dao).
        return null;
    }
}
