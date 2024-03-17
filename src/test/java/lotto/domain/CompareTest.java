package lotto.domain;

import lotto.Lotto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.util.Arrays;
import java.util.Locale;

import static org.assertj.core.api.Assertions.*;

class CompareTest {
    @Test
    void 번호6개일치(){
        Compare compare = new Compare();
        int result = compare.correctCount(Arrays.asList(1,2,3,4,5,6), Arrays.asList(1,2,3,4,5,6));
        assertThat(result).isEqualTo(6);
    }

    @Test
    void 번호5개일치(){
        Compare compare = new Compare();
        int result = compare.correctCount(Arrays.asList(1,2,3,4,5,6), Arrays.asList(1,2,25,4,5,6));
        assertThat(result).isEqualTo(5);
    }

    @Test
    void 번호4개일치(){
        Compare compare = new Compare();
        int result = compare.correctCount(Arrays.asList(1,2,3,4,5,6), Arrays.asList(1,2,25,4,5,6));
        assertThat(result).isEqualTo(5);
    }

    @Test
    void 번호3개일치(){
        Compare compare = new Compare();
        int result = compare.correctCount(Arrays.asList(1,2,3,4,5,6), Arrays.asList(1,2,25,4,5,6));
        assertThat(result).isEqualTo(5);
    }
}

class bonusNumber{
    @Test
    void 보너스번호포함(){
        Compare compare = new Compare();
        int result = compare.bonusNumber(Arrays.asList(1,2,3,4,5,6), 6);
        assertThat(result).isEqualTo(1);
    }
}