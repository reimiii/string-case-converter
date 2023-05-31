package franxx.code.reimiii.service;

import franxx.code.reimiii.entity.CaseConverter;
import franxx.code.reimiii.repository.CaseConverterRepository;
import franxx.code.reimiii.repository.CaseConverterRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

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
//        repository = new CaseConverterRepositoryImpl();
        service = new CaseConverterServiceImpl(repository);
    }

    @Test
    void testShowHistorySuccessClean() {
        // Arrange
        CaseConverter[] mockCaseConverters = {
                new CaseConverter("Test1"),
                new CaseConverter("Test2"),
                null,
                new CaseConverter("Test3"),
                new CaseConverter("Test4"),
                new CaseConverter("Test5"),
                new CaseConverter("Test6"),
        };

        when(repository.getAll()).thenReturn(mockCaseConverters);

        service.showCaseConverter();

        // assert
        verify(repository, times(1)).getAll();
    }

    @Test
    void testAddCaseConverterSuccessClean() {
        // Arrange
        String insertString = "Yahoo";

        // Act
        service.addCaseConverter(insertString);

        // Assert
        verify(repository, times(1)).add(new CaseConverter(insertString));
    }
}
