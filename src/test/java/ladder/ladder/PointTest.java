package ladder.ladder;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    public void first() {
        assertThat(Point.first(TRUE).move(), is(new Position(1)));
        assertThat(Point.first(FALSE).move(), is(new Position(0)));
    }

    @Test
    public void next_stay() {
        Point second = Point.first(FALSE).next(FALSE);
        assertThat(second.move(), is(new Position(1)));
    }

    @Test
    public void next_left() {
        Point second = Point.first(TRUE).next(FALSE);
        assertThat(second.move(), is(new Position(0)));
    }

    @Test
    public void next_right() {
        Point second = Point.first(FALSE).next(TRUE);
        assertThat(second.move(), is(new Position(2)));
    }

    @Test
    public void next() {
        Point second = Point.first(TRUE).next();
        assertThat(second.move(), is(new Position(0)));
    }
}
