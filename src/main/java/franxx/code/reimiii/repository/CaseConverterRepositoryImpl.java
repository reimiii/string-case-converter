package franxx.code.reimiii.repository;

import franxx.code.reimiii.entity.CaseConverter;

public class CaseConverterRepositoryImpl implements CaseConverterRepository {
    CaseConverter[] caseConverters = new CaseConverter[5];

    @Override
    public CaseConverter[] getAll() {
        return caseConverters;
    }

    @Override
    public void add(CaseConverter converter) {

    }

    @Override
    public boolean remove(Integer number) {
        return false;
    }
}
