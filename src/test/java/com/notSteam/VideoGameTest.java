package com.notSteam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VideoGameTest {

    @Test
    public void testVideoGameConstructor() {
        VideoGame Game = new VideoGame("Guild Wars 2", "MMORPG", 10, 29.99);

        Assertions.assertEquals("Guild Wars 2", Game.getTitle());
        Assertions.assertEquals("MMORPG", Game.getGenre());
        Assertions.assertEquals(10, Game.getRating());
        Assertions.assertEquals(29.99, Game.getPrice());
    }

    @Test
    public void testIsRatingGreaterThanAnother() {
        VideoGame Game1 = new VideoGame("Guild Wars 2", "MMORPG", 10, 29.99);
        VideoGame Game2 = new VideoGame("World of Warcraft", "MMORPG", 9, 29.99);

        Assertions.assertTrue(Game1.isRatingGreaterThanAnother(Game2));
    }

    @Test
    public void testSetRating() {
        VideoGame Game = new VideoGame("The last of Us", "MMORPG", 10, 29.99);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Game.setRating(11);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Game.setRating(-1);
        });
    }

    @Test
    public void testApplyDiscount() {
        VideoGame game = new VideoGame("Mount & Blade II: Bannerlord", "SANDBOX RPG", 10, 20);

        Assertions.assertEquals(18.00, game.applyDiscount(10));
        Assertions.assertEquals(10.00, game.applyDiscount(50));
        Assertions.assertEquals(0.00, game.applyDiscount(100));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            game.applyDiscount(-10);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            game.applyDiscount(110);
        });
    }
}
