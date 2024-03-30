package command;

import exceptions.CommandFormatException;
import itemlist.Itemlist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class FindCommandTest {

    @Test
    public void findCommandTest() throws CommandFormatException {
        Command addCommandTest1 = new AddCommand("testItem", 1, "EA",
                "NA", 1, 10);
        Command findCommand = new FindCommand("testItem");
        Command findCommand2 = new FindCommand("failFindCommand");

        addCommandTest1.execute();
        findCommand.execute();
        findCommand2.execute();
        assertFalse(Itemlist.itemIsExist("failFindCommand"));
    }
}