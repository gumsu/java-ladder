package ladder.result;

import java.util.Objects;

public class Award {

    private final String award;

    public Award(String award) {
        valid(award);
        this.award = award;
    }

    private void valid(String award) {
        if (award.isBlank()) {
            throw new IllegalArgumentException("유효하지 않은 결과 값입니다.");
        }
    }

    public String getAward() {
        return award;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Award award1 = (Award) o;
        return Objects.equals(award, award1.award);
    }

    @Override
    public int hashCode() {
        return Objects.hash(award);
    }
}
