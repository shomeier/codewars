package org.sho.tocamelcase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest {

    private String input;
    private String expectedResult;

    @Parameterized.Parameters
    public static Collection<String[]> primeNumbers() {
        return Arrays.asList(new String[][] {
                { "the_Stealth_Warrior", "theStealthWarrior" },
                { "the-Stealth-Warrior", "theStealthWarrior" },
                { "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields",
                        "YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedForTheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields"
                }
        });
    }

    public SolutionTest(String input, String expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        System.out.println("input: " + input);
        assertEquals(expectedResult, Solution.toCamelCase(input));
        assertEquals(expectedResult, Solution2.toCamelCase(input));
        assertEquals(expectedResult, Solution3.toCamelCase(input));
    }

    @Test
    public void testSomeUnderscoreLowerStartSolution2() {
        System.out.println("input: " + input);
        assertEquals(expectedResult, Solution2.toCamelCase(input));
    }

    @Test
    public void testSomeUnderscoreLowerStartSolution3() {
        System.out.println("input: " + input);
        assertEquals(expectedResult, Solution3.toCamelCase(input));
    }
}
