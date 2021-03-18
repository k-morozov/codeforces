package com.codeforces.queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplTest {
    @Test
    public void emptyQueue() {
        Impl _impl = new Impl();
        assert _impl.size() == 0;
    }

    @Test
    public void addOneQueue() {
        Impl _impl = new Impl();
        assert _impl.size() == 0;
        _impl.push(1);
        assert _impl.size() == 1;
        assert _impl.front() == 1;
    }

    @Test
    public void addThreeElemAndRemove() {
        Impl _impl = new Impl();
        assert _impl.size() == 0;

        _impl.push(1);
        assert _impl.size() == 1;
        assert _impl.front() == 1;

        _impl.push(2);
        assert _impl.size() == 2;
        assert _impl.front() == 1;

        _impl.push(3);
        assert _impl.size() == 3;
        assert _impl.front() == 1;

        int value = _impl.pop();
        assert _impl.size() == 2;
        assert _impl.front() == 2;
        assert value == 1;

        value = _impl.pop();
        assert _impl.size() == 1;
        assert _impl.front() == 3;
        assert value == 2;

        value = _impl.pop();
        assert _impl.size() == 0;
        assert value == 3;
    }

    @Test
    public void addThreeElemAndClear() {
        Impl _impl = new Impl();
        assert _impl.size() == 0;

        _impl.push(1);
        assert _impl.size() == 1;
        assert _impl.front() == 1;

        _impl.push(2);
        assert _impl.size() == 2;
        assert _impl.front() == 1;

        _impl.push(3);
        assert _impl.size() == 3;
        assert _impl.front() == 1;

        _impl.clear();
        assert _impl.size() == 0;
    }

}