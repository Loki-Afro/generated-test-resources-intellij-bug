package org.github.lokiafro;


import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.github.lokiafro.PlayerAssert.assertThat;

public class PlayerTest {

    @Test
    public void testName() throws Exception {
        String name = "Phillip";
        String teamName = "The best";
        ArrayList<String> teamMates = Lists.newArrayList();/* no team mates :'( */
        Player player = new Player(name, teamName, teamMates);

        assertThat(player).hasName(name);
    }
}