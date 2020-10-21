package com.adaptionsoft.games.trivia.acceptance

import com.adaptionsoft.games.trivia.runner.Die
import com.adaptionsoft.games.trivia.runner.HawkingsOracle
import com.adaptionsoft.games.trivia.runner.Printer
import com.adaptionsoft.games.trivia.runner.main
import org.junit.Assert.assertEquals
import org.junit.Test

class MainTest {

    // TODO: test penalty box

    @Test
    fun `a full game can be played`() {

        Die.fixAt(4)
        HawkingsOracle.forceAlternatingAnswer()

        main(emptyArray())

        val expectedOutput = """
            Chet was added
            They are player number 1
            Pat was added
            They are player number 2
            Sue was added
            They are player number 3
            Chet is the current player
            They have rolled a 1
            Chet's new location is 1
            The category is Science
            Science Question 0
            Answer was correct!!!!
            Chet now has 1 Gold Coins.
            Pat is the current player
            They have rolled a 4
            Pat's new location is 4
            The category is Pop
            Pop Question 0
            Question was incorrectly answered
            Pat was sent to the penalty box
            Sue is the current player
            They have rolled a 1
            Sue's new location is 1
            The category is Science
            Science Question 1
            Answer was correct!!!!
            Sue now has 1 Gold Coins.
            Chet is the current player
            They have rolled a 4
            Chet's new location is 5
            The category is Science
            Science Question 2
            Question was incorrectly answered
            Chet was sent to the penalty box
            Pat is the current player
            They have rolled a 1
            Pat is getting out of the penalty box
            Pat's new location is 5
            The category is Science
            Science Question 3
            Answer was correct!!!!
            Pat now has 1 Gold Coins.
            Sue is the current player
            They have rolled a 4
            Sue's new location is 5
            The category is Science
            Science Question 4
            Question was incorrectly answered
            Sue was sent to the penalty box
            Chet is the current player
            They have rolled a 1
            Chet is getting out of the penalty box
            Chet's new location is 6
            The category is Sports
            Sports Question 0
            Answer was correct!!!!
            Chet now has 2 Gold Coins.
            Pat is the current player
            They have rolled a 4
            Pat is not getting out of the penalty box
            Question was incorrectly answered
            Pat was sent to the penalty box
            Sue is the current player
            They have rolled a 1
            Sue is getting out of the penalty box
            Sue's new location is 6
            The category is Sports
            Sports Question 1
            Answer was correct!!!!
            Sue now has 2 Gold Coins.
            Chet is the current player
            They have rolled a 4
            Chet is not getting out of the penalty box
            Question was incorrectly answered
            Chet was sent to the penalty box
            Pat is the current player
            They have rolled a 1
            Pat is getting out of the penalty box
            Pat's new location is 6
            The category is Sports
            Sports Question 2
            Answer was correct!!!!
            Pat now has 2 Gold Coins.
            Sue is the current player
            They have rolled a 4
            Sue is not getting out of the penalty box
            Question was incorrectly answered
            Sue was sent to the penalty box
            Chet is the current player
            They have rolled a 1
            Chet is getting out of the penalty box
            Chet's new location is 7
            The category is Rock
            Rock Question 0
            Answer was correct!!!!
            Chet now has 3 Gold Coins.
            Pat is the current player
            They have rolled a 4
            Pat is not getting out of the penalty box
            Question was incorrectly answered
            Pat was sent to the penalty box
            Sue is the current player
            They have rolled a 1
            Sue is getting out of the penalty box
            Sue's new location is 7
            The category is Rock
            Rock Question 1
            Answer was correct!!!!
            Sue now has 3 Gold Coins.
            Chet is the current player
            They have rolled a 4
            Chet is not getting out of the penalty box
            Question was incorrectly answered
            Chet was sent to the penalty box
            Pat is the current player
            They have rolled a 1
            Pat is getting out of the penalty box
            Pat's new location is 7
            The category is Rock
            Rock Question 2
            Answer was correct!!!!
            Pat now has 3 Gold Coins.
            Sue is the current player
            They have rolled a 4
            Sue is not getting out of the penalty box
            Question was incorrectly answered
            Sue was sent to the penalty box
            Chet is the current player
            They have rolled a 1
            Chet is getting out of the penalty box
            Chet's new location is 8
            The category is Pop
            Pop Question 1
            Answer was correct!!!!
            Chet now has 4 Gold Coins.
            Pat is the current player
            They have rolled a 4
            Pat is not getting out of the penalty box
            Question was incorrectly answered
            Pat was sent to the penalty box
            Sue is the current player
            They have rolled a 1
            Sue is getting out of the penalty box
            Sue's new location is 8
            The category is Pop
            Pop Question 2
            Answer was correct!!!!
            Sue now has 4 Gold Coins.
            Chet is the current player
            They have rolled a 4
            Chet is not getting out of the penalty box
            Question was incorrectly answered
            Chet was sent to the penalty box
            Pat is the current player
            They have rolled a 1
            Pat is getting out of the penalty box
            Pat's new location is 8
            The category is Pop
            Pop Question 3
            Answer was correct!!!!
            Pat now has 4 Gold Coins.
            Sue is the current player
            They have rolled a 4
            Sue is not getting out of the penalty box
            Question was incorrectly answered
            Sue was sent to the penalty box
            Chet is the current player
            They have rolled a 1
            Chet is getting out of the penalty box
            Chet's new location is 9
            The category is Science
            Science Question 5
            Answer was correct!!!!
            Chet now has 5 Gold Coins.
            Pat is the current player
            They have rolled a 4
            Pat is not getting out of the penalty box
            Question was incorrectly answered
            Pat was sent to the penalty box
            Sue is the current player
            They have rolled a 1
            Sue is getting out of the penalty box
            Sue's new location is 9
            The category is Science
            Science Question 6
            Answer was correct!!!!
            Sue now has 5 Gold Coins.
            Chet is the current player
            They have rolled a 4
            Chet is not getting out of the penalty box
            Question was incorrectly answered
            Chet was sent to the penalty box
            Pat is the current player
            They have rolled a 1
            Pat is getting out of the penalty box
            Pat's new location is 9
            The category is Science
            Science Question 7
            Answer was correct!!!!
            Pat now has 5 Gold Coins.
            Sue is the current player
            They have rolled a 4
            Sue is not getting out of the penalty box
            Question was incorrectly answered
            Sue was sent to the penalty box
            Chet is the current player
            They have rolled a 1
            Chet is getting out of the penalty box
            Chet's new location is 10
            The category is Sports
            Sports Question 3
            Answer was correct!!!!
            Chet now has 6 Gold Coins.
        """.trimIndent()

        assertEquals(expectedOutput, Printer.messages.joinToString(System.lineSeparator()))
    }
}

