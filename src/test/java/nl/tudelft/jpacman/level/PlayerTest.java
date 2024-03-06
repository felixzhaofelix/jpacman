package nl.tudelft.jpacman.level;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.sprite.AnimatedSprite;
import nl.tudelft.jpacman.sprite.Sprite;

import java.util.HashMap;
import java.util.Map;

class PlayerTest {

    @Test
    void setAlive() {
        Map<Direction, Sprite> spriteMap;
        spriteMap = new HashMap<>();
        AnimatedSprite deathAnimation = new AnimatedSprite(new Sprite[1], 1, false);
        Player player = new Player(spriteMap, deathAnimation);
        player.setAlive(false);
        assertFalse(player.isAlive());
    }
    @Test
    void setAlive_PlayerAlive() {

        Player player = createPlayer(true);

        assertTrue(player.isAlive());

        player.setAlive(true);

        assertTrue(player.isAlive());
    }

    @Test
    void setAlive_PlayerDead() {

        Player player = createPlayer(false);

        assertFalse(player.isAlive());

        player.setAlive(false);

        assertFalse(player.isAlive());
    }
    private Player createPlayer(boolean isAlive) {
        Map<Direction, Sprite> spriteMap = new HashMap<>();
        AnimatedSprite deathAnimation = new AnimatedSprite(new Sprite[1], 1, false);
        Player player = new Player(spriteMap, deathAnimation);

        player.setAlive(isAlive);

        return player;
    }

}
