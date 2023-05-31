package franxx.code.reimiii.service;

import franxx.code.reimiii.entity.CaseConverter;
import franxx.code.reimiii.repository.CaseConverterRepository;
import franxx.code.reimiii.repository.CaseConverterRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class CaseConverterServiceTest {
    @Mock
    private CaseConverterRepository repository;
    private CaseConverterService service;

    @BeforeEach
    void setUp() {
        repository = new CaseConverterRepositoryImpl();
        service = new CaseConverterServiceImpl(repository);
    }

    @Test
    void testShowHistory() {
        service.addCaseConverter("Hello");
        service.addCaseConverter("Hello1");
        service.addCaseConverter("Hello2");

        service.showCaseConverter();
    }
}
