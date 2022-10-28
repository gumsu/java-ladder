package ladder;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class UserNameTest {

    @Test
    void 유저_이름_5글자_제한() {
        assertThatThrownBy(() -> UserName.from("abcdefgh"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 유저_이름_널_에러() {
        assertThatThrownBy(() -> UserName.from(null))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 유저_이름_공백_에러() {
        assertThatThrownBy(() -> UserName.from(" "))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
