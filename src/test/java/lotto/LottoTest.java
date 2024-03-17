package lotto;

import lotto.domain.askPlayer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호가 6자리 이상일시 예외가 발생한다.")
    @Test
    void createLottoByLengthSixUp() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호가 6자리 이하일시 예외가 발생한다.")
    @Test
    void createLottoByLengthSixUnder() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("1000원 단위로 로또를 사야한다.")
    @Test
    void purchaseLottoByNotThousandUnit() {
        String input = "1001\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        askPlayer player = new askPlayer(in);
        assertThatThrownBy(() -> askPlayer.askLottoPurchase())
                .isInstanceOf(IllegalArgumentException.class);
    }
}
