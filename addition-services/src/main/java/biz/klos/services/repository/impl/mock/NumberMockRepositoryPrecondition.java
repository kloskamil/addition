package biz.klos.services.repository.impl.mock;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
public class NumberMockRepositoryPrecondition implements Condition, ConfigurationCondition {

    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.REGISTER_BEAN;
    }

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //Jeśli byśmy chcieli połączyć się z bazą danych to możemy ustawić flagę w application.properties
        //dodać nową implementację interfejsu NumberRepository i dodać kolejny Precondition, uzależniając wynik metody matches od wartości flagi
        return true;
    }
}
