package franxx.code.reimiii.entity;

import java.util.Objects;

public class CaseConverter {
    private String convertToCase;

    public CaseConverter() {
    }

    public CaseConverter(String convertToCase) {
        this.convertToCase = convertToCase;
    }

    public String getConvertToCase() {
        return convertToCase;
    }

    public void setConvertToCase(String convertToCase) {
        this.convertToCase = convertToCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CaseConverter that = (CaseConverter) o;

        return Objects.equals(convertToCase, that.convertToCase);
    }

    @Override
    public int hashCode() {
        return convertToCase != null ? convertToCase.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CaseConverter{" +
                "convertToCase='" + convertToCase + '\'' +
                '}';
    }
}
