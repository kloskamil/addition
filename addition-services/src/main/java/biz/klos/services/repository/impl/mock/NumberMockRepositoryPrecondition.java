package biz.klos.services.repository.impl.mock;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
@PropertySource("classpath:application.properties")
public class NumberMockRepositoryPrecondition implements Condition, ConfigurationCondition {

    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.REGISTER_BEAN;
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return context.getEnvironment().getRequiredProperty("database.mock.enabled", Boolean.class);
    }

}
