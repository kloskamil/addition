package biz.klos.services.repository.impl.mock;

import biz.klos.services.repository.NumberRepository;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Conditional(NumberMockRepositoryPrecondition.class)
public class NumberMockRepositoryImpl implements NumberRepository {

    @Override
    public BigDecimal findNumber() {
        return new BigDecimal(Math.random());
    }
}
