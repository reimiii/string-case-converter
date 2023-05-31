package franxx.code.reimiii.repository;

import franxx.code.reimiii.entity.CaseConverter;

public class CaseConverterRepositoryImpl implements CaseConverterRepository {
    public CaseConverter[] caseConverters = new CaseConverter[5];

    @Override
    public CaseConverter[] getAll() {
        return caseConverters;
    }

    @Override
    public void add(CaseConverter converter) {
        reSizeIfFull();

        for (int i = 0; i < caseConverters.length; i++) {
            if (caseConverters[i] == null) {
                caseConverters[i] = converter;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= caseConverters.length) {
            return false;
        } else if (caseConverters[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < caseConverters.length; i++) {
                if (i == (caseConverters.length - 1)) {
                    caseConverters[i] = null;
                } else {
                    caseConverters[i] = caseConverters[i + 1];
                }
            }
        }

        return true;
    }

    public boolean isFull() {
        // check caseConverters full?
        var isFull = true;
        for (var i = 0; i < caseConverters.length; i++) {
            if (caseConverters[i] == null) {
                // model still not full?
                isFull = false;
                break;
            }
        }

        return isFull;
    }

    public void reSizeIfFull() {
        // if full is true? then index length array resize 2*
        if (isFull()) {
            var temp = caseConverters;
            caseConverters = new CaseConverter[caseConverters.length * 2];

            for (var i = 0; i < temp.length; i++) {
                caseConverters[i] = temp[i];
            }
        }
    }
}
