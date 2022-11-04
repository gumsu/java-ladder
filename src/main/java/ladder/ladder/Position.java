package ladder.ladder;

import java.util.Objects;

public class Position {

    private final int position;

    public Position(int position) {
        valid(position);
        this.position = position;
    }

    public Position moveLeft() {
        return new Position(position - 1);
    }

    public Position moveRight() {
        return new Position(position + 1);
    }

    public int getPosition() {
        return position;
    }

    private void valid(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("위치는 0 이상이어야 합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}