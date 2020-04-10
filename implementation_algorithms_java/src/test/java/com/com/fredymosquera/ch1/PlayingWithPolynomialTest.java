package com.com.fredymosquera.ch1;

import com.com.fredymosquera.ds.linkedlist.Polynomial;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals("3 + x + -3x^2", playingWithPolynomial.getPolySting(result));
    }
}