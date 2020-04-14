package com.com.fredymosquera.ch1;

import com.com.fredymosquera.ds.linkedlist.Polynomial;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayingWithPolynomialTest {

    PlayingWithPolynomial playingWithPolynomial = new PlayingWithPolynomial();

    @Test
    public void add() {

        Polynomial.Builder pb = new Polynomial.Builder();
        pb.set(1).set(2, "x").set(-3, "x", 2);
        Polynomial p = pb.build();

        Polynomial.Builder qb = new Polynomial.Builder();
        qb.set(2).set(-1, "x");
        Polynomial q = qb.build();

        Polynomial result = playingWithPolynomial.add(p, q);
        assertEquals("3 + x + -3x^2", playingWithPolynomial.getPolySting(result));
    }

    @Test
    public void multiply(){
        Polynomial.Builder pb = new Polynomial.Builder();
        pb.set(1).set(2, "x").set(-3, "x", 2);
        Polynomial p = pb.build();

        Polynomial.Builder qb = new Polynomial.Builder();
        qb.set(2).set(-1, "x");
        Polynomial q = qb.build();
        Polynomial result = playingWithPolynomial.multiply(p, q);

        assertEquals("2 + -1x + 4x + -2x^2 + -6x^2 + 3x^3", playingWithPolynomial.getPolySting(result));

    }
}