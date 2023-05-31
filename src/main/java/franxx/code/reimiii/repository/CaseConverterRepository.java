package franxx.code.reimiii.repository;

import franxx.code.reimiii.entity.CaseConverter;

public interface CaseConverterRepository {
    CaseConverter[] getAll();

    void add(CaseConverter converter);
}
