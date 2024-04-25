package com.always.elfo;

import java.util.Objects;

public class Coord {

    private int i, j;

    public Coord(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coord coord)) return false;
        return i == coord.i && j == coord.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }

    @Override
    public String toString() {
        return "Coord{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
