package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VideoGameTest {

    @Test
    public void testVideoGameConstructor() {
        VideoGame VideoGameUnderTest = new VideoGame("Guild Wars 2", "MMORPG", 10, 29.99);

        Assertions.assertEquals("Guild Wars 2", VideoGameUnderTest.getTitle());
        Assertions.assertEquals("MMORPG", VideoGameUnderTest.getGenre());
        Assertions.assertEquals(10, VideoGameUnderTest.getRating());
        Assertions.assertEquals(29.99, VideoGameUnderTest.getPrice());
    }
}
