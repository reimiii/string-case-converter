package franxx.code.reimiii.service;

import franxx.code.reimiii.entity.CaseConverter;
import franxx.code.reimiii.repository.CaseConverterRepository;

public class CaseConverterServiceImpl implements CaseConverterService {
    private CaseConverterRepository repository;

    public CaseConverterServiceImpl(CaseConverterRepository repository) {
        this.repository = repository;
    }

    @Override
    public void showCaseConverter() {
        CaseConverter[] model = repository.getAll();

        System.out.println("History case converter");

        for (int i = 0; i < model.length; i++) {
            var listCase = model[i];
            var number = i + 1;

            if (listCase != null) {
                System.out.println(number + ". " + listCase.getConvertToCase());
            }
        }
    }

    @Override
    public void addCaseConverter(String insertString) {
        CaseConverter converter = new CaseConverter(insertString);
        repository.add(converter);

        System.out.println("Success convert to.. : " + insertString);
    }

    @Override
    public void removeCaseConverter(Integer number) {
        boolean success = repository.remove(number);

        if (success) {
            System.out.println("Success remove case: " + number);
        } else {
            System.out.println("Failed remove case: " + number);
        }
    }
}
